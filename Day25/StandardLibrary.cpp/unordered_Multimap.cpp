#include<bits/stdc++.h>
using namespace std;
int main()
{
    //ONLY Difference is that this can store duplicate values in it...
    unordered_multimap<int,int>map;

    map.insert({1,2});
    map.insert({2,3});
    map.insert({3,4});
    map.insert({4,5});
    map.insert({5,6});
    map.insert({1,2});
    map.insert({2,3});

    //printing the map values after adding
    for(auto it=map.begin();it!=map.end();it++){
        cout<<it->first<<" "<<it->second<<endl;
    }
    cout<<endl;
    cout<<map.size()<<endl;

    // remaining functions are same as unordered_map.
    return 0;
}