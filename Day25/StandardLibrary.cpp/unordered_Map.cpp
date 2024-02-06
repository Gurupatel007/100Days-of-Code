#include<bits/stdc++.h>
using namespace std;
int main()
{
    unordered_map<int,int>map;
    map.insert({1,2});
    map.insert({2,3});
    map.insert({3,4});
    map.insert({4,5});
    map.insert({5,6});

    for(auto it=map.begin();it!=map.end();it++){
        cout<<it->first<<" "<<it->second<<endl;
    }
    cout<<endl;

    //finding for particular element using key
    if(map.find(2)!=map.end()){
        cout<<2<<" is present in map\n"<<endl;
    }
    else cout<<2<<" is not present in map\n"<<endl;

    //deleting particular element using key
    map.erase(2);
    cout<<"Elements after deleting 2 : "<<endl;
    for(auto it=map.begin();it!=map.end();it++){
        cout<<it->first<<" "<<it->second<<endl;
    }
    cout<<endl;

    //checking the size of the map
    cout<<map.size()<<endl;
    //clearing /removing all the values inside map
    map.clear();
    //checking whether empty or not
    if(map.empty()) cout<<"Empty";
    else cout<<"Not Empty";
    return 0;
}