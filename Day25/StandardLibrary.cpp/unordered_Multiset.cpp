#include<bits/stdc++.h>
using namespace std;
int main()
{
    /*
    Unordered_mut=ltiset is same as unordered set just the difference is that this one can store multiple/duplicate values.
    */

   unordered_multiset<int>s;
    for(int i=0;i<5;i++){
        s.insert(i);
    }
    for(int i=0;i<5;i++){
        s.insert(i);
    }

   for(auto it=s.begin();it!=s.end();it++){
    cout<<*it<<" ";
   }

    // functions are all same just the above one was the difference

    return 0;
}