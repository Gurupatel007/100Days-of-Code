const playlistSongs = document.getElementById("playlist-songs");
const playButton = document.getElementById("play");
const pauseButton = document.getElementById("pause");
const nextButton = document.getElementById("next");
const previousButton = document.getElementById("previous");
const shuffleButton = document.getElementById("shuffle");

const allSongs = [
  {
    id: 0,
    title: "Rolex Theme",
    artist: "Anirudh Ravichander",
    duration: "0:53",
    src: "https://audio.jukehost.co.uk/BhHVpXK3ZXmQ2PCXBWgQzd31nlViF9AK",
  },
  {
    id: 1,
    title: "09:45",
    artist: "Jay Trak, Prabh Singh, and Rooh Sandhu",
    duration: "4:15",
    src: "https://audio.jukehost.co.uk/R4Mq3JQ7wpGYEM7804Ivu2xz9wFaQYAp",
  },
  {
    id: 2,
    title: "Tum Kya Mile",
    artist: "Arijit Singh",
    duration: "4:37",
    src: "https://audio.jukehost.co.uk/GrhNyhctm0wbeBaBZBmW2bz45UYQeoN3",
  },
  {
    id: 3,
    title: "Satranga",
    artist: "Arijit Singh",
    duration: "4:31",
    src: "https://audio.jukehost.co.uk/QIUsriZU0RBcWRT1LlauKSrDRt01u5Ux",
  },
  {
    id: 4,
    title: "Oonchi Oonchi Deewarein",
    artist: "Arijit Singh",
    duration: "4:11",
    src: "https://audio.jukehost.co.uk/bbWbzbli3xLlOziySoELxbjJrn68O06W",
  },
  {
    id: 5,
    title: "Dil Mein Ho Tum",
    artist: "Armaan Malik",
    duration: "5:45",
    src: "https://audio.jukehost.co.uk/7GWo57IcOahBGflE5eVMqaGdfkuBy0qT",
  },
  {
    id: 6,
    title: "Khuda Bhi",
    artist: "Mohit Chauhan",
    duration: "3:11",
    src: "https://audio.jukehost.co.uk/jNpmXD5WGQB7buV1kpN73ErjgdBVs289",
  },
  {
    id: 7,
    title: "Janiye",
    artist: "Vishal Mishra",
    duration: "3:33",
    src: "https://audio.jukehost.co.uk/I28QsEJbfAwqCxQpTBni4E4KcNsEcNOq",
  },
  {
    id: 8,
    title: "Kabhi Shaam Dhale",
    artist: "M. M. Keeravani",
    duration: "4:07",
    src: "https://audio.jukehost.co.uk/4SRGWmuPhokdpgVw1KxEpZoSpXtJAtX6",
  },
  {
    id: 9,
    title: "Kaale Sheeshe",
    artist: "Addy Nagar",
    duration: "3:38",
    src: "https://audio.jukehost.co.uk/YkMcrbKehjpWyZ1eQfbKK5sIMD9DgtAX",
  },
];

const audio = new Audio();
let userData = {
  songs: [...allSongs],
  currentSong: null,
  songCurrentTime: 0,
};

const playSong = (id) => {
  const song = userData?.songs.find((song) => song.id === id);
  audio.src = song.src;
  audio.title = song.title;

  if (userData?.currentSong === null || userData?.currentSong.id !== song.id) {
    audio.currentTime = 0;
  } else {
    audio.currentTime = userData?.songCurrentTime;
  }
  userData.currentSong = song;
  playButton.classList.add("playing");

  highlightCurrentSong();
  setPlayerDisplay();
  setPlayButtonAccessibleText();
  audio.play();
};

const pauseSong = () => {
  userData.songCurrentTime = audio.currentTime;
  
  playButton.classList.remove("playing");
  audio.pause();
};

const playNextSong = () => {
  if (userData?.currentSong === null) {
    playSong(userData?.songs[0].id);
  } else {
    const currentSongIndex = getCurrentSongIndex();
    const nextSong = userData?.songs[currentSongIndex + 1];

    playSong(nextSong.id);
  }
};

const playPreviousSong = () =>{
   if (userData?.currentSong === null) return;
   else {
    const currentSongIndex = getCurrentSongIndex();
    const previousSong = userData?.songs[currentSongIndex - 1];

    playSong(previousSong.id);
   }
};

const shuffle = () => {
  userData?.songs.sort(() => Math.random() - 0.5);
  userData.currentSong = null;
  userData.songCurrentTime = 0;

  renderSongs(userData?.songs);
  pauseSong();
  setPlayerDisplay();
  setPlayButtonAccessibleText();
};

const deleteSong = (id) => {
  if (userData?.currentSong?.id === id) {
    userData.currentSong = null;
    userData.songCurrentTime = 0;

    pauseSong();
    setPlayerDisplay();
  }

  userData.songs = userData?.songs.filter((song) => song.id !== id);
  renderSongs(userData?.songs); 
  highlightCurrentSong(); 
  setPlayButtonAccessibleText(); 

  if (userData?.songs.length === 0) {
    const resetButton = document.createElement("button");
    const resetText = document.createTextNode("Reset Playlist");

    resetButton.id = "reset";
    resetButton.ariaLabel = "Reset playlist";
    resetButton.appendChild(resetText);
    playlistSongs.appendChild(resetButton);

    resetButton.addEventListener("click", () => {
      userData.songs = [...allSongs];

      renderSongs(userData?.songs); 
      setPlayButtonAccessibleText();
      resetButton.remove();
    });

  }

};

const setPlayerDisplay = () => {
  const playingSong = document.getElementById("player-song-title");
  const songArtist = document.getElementById("player-song-artist");
  const currentTitle = userData?.currentSong?.title;
  const currentArtist = userData?.currentSong?.artist;

  playingSong.textContent = currentTitle ? currentTitle : "";
  songArtist.textContent = currentArtist ? currentArtist : "";
};

const highlightCurrentSong = () => {
  const playlistSongElements = document.querySelectorAll(".playlist-song");
  const songToHighlight = document.getElementById(
    `song-${userData?.currentSong?.id}`
  );

  playlistSongElements.forEach((songEl) => {
    songEl.removeAttribute("aria-current");
  });

  if (songToHighlight) songToHighlight.setAttribute("aria-current", "true");
};

const renderSongs = (array) => {
  const songsHTML = array
    .map((song)=> {
      return `
      <li id="song-${song.id}" class="playlist-song">
      <button class="playlist-song-info" onclick="playSong(${song.id})">
          <span class="playlist-song-title">${song.title}</span>
          <span class="playlist-song-artist">${song.artist}</span>
          <span class="playlist-song-duration">${song.duration}</span>
      </button>
      <button onclick="deleteSong(${song.id})" class="playlist-song-delete" aria-label="Delete ${song.title}">
          <svg width="20" height="20" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><circle cx="8" cy="8" r="8" fill="#4d4d62"/>
          <path fill-rule="evenodd" clip-rule="evenodd" d="M5.32587 5.18571C5.7107 4.90301 6.28333 4.94814 6.60485 5.28651L8 6.75478L9.39515 5.28651C9.71667 4.94814 10.2893 4.90301 10.6741 5.18571C11.059 5.4684 11.1103 5.97188 10.7888 6.31026L9.1832 7.99999L10.7888 9.68974C11.1103 10.0281 11.059 10.5316 10.6741 10.8143C10.2893 11.097 9.71667 11.0519 9.39515 10.7135L8 9.24521L6.60485 10.7135C6.28333 11.0519 5.7107 11.097 5.32587 10.8143C4.94102 10.5316 4.88969 10.0281 5.21121 9.68974L6.8168 7.99999L5.21122 6.31026C4.8897 5.97188 4.94102 5.4684 5.32587 5.18571Z" fill="white"/></svg>
        </button>
      </li>
      `;
    })
    .join("");

  playlistSongs.innerHTML = songsHTML;
};

const setPlayButtonAccessibleText = () => {
  const song = userData?.currentSong || userData?.songs[0];

  playButton.setAttribute(
    "aria-label",
    song?.title ? `Play ${song.title}` : "Play"
  );
};

const getCurrentSongIndex = () => userData?.songs.indexOf(userData?.currentSong);

playButton.addEventListener("click", () => {
    if (userData?.currentSong === null) {
    playSong(userData?.songs[0].id);
  } else {
    playSong(userData?.currentSong.id);
  }
});

pauseButton.addEventListener("click",  pauseSong);

nextButton.addEventListener("click", playNextSong);

previousButton.addEventListener("click", playPreviousSong);

shuffleButton.addEventListener("click", shuffle);

audio.addEventListener("ended", () => {
  const currentSongIndex = getCurrentSongIndex();
  const nextSongExists = userData?.songs[currentSongIndex + 1] !== undefined;

    if (nextSongExists) {
      playNextSong();
    } else {
      userData.currentSong = null;
      userData.songCurrentTime = 0;  
pauseSong();
setPlayerDisplay();
highlightCurrentSong();
setPlayButtonAccessibleText();

    }
});

userData?.songs.sort((a,b) => {
  if (a.title < b.title) {
    return -1;
  }

  if (a.title > b.title) {
    return 1;
  }

  return 0;
});

renderSongs(userData?.songs);
setPlayButtonAccessibleText();