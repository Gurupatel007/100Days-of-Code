#include<bits/stdc++.h>
using namespace std;
int main()
{
    /*
    Multiset is a similar to set just difference is that it can store multiple values
    in a particular order(sorted order);
    */
    multiset<int>s;
    for(int i=0;i<5;i++){
        s.insert(i);
    }
    s.insert(9);
    s.insert(8);

    for(int i=5;i<10;i++){
        s.insert(i);
    }

    for(auto i =s.begin();i!=s.end();i++){
        cout<<*i<<" ";
    }
    return 0;
}