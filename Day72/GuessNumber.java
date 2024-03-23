public class GuessNumber {
    /* 
         * Forward declaration of guess API.
         * @param  num   your guess
         * @return 	     -1 if num is higher than the picked number
         *			      1 if num is lower than the picked number
        *               otherwise return 0
        * int guess(int num);
    */
    public int guess(int num){
        int pick = 6;
        if(num == pick){
            return 0;
        }
        else if(num < pick){
            return 1;
        }
        else{
            return -1;
        }
    }
    public int guessNumber(int n) {
        int min = 1;
        int max = n;
        while(true){
            int mid = min + (max-min) /2 ;
            int guessNo = guess(mid);
            if(guessNo > 0){
                min = mid+1; 
            }
            else if(guessNo < 0){
                max = mid-1;
            }
            else{
                return mid;
            }
        }
    }
    public static void main(String[] args) {
        // input n = 10, pick = 6
        GuessNumber obj = new GuessNumber();
        System.out.println(obj.guessNumber(10));
    }
}