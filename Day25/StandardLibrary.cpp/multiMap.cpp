#include<bits/stdc++.h>
using namespace std;
int main()
{
    // same as map but can store multiple values
    multimap<int,int>mp;

    mp.insert({1,10});
    mp.insert({2,20});

    for(auto it = mp.begin();it!=mp.end();it++){
        cout<<it->first<<" "<<it->second<<endl;
    }
    cout<<endl;

    return 0;
}