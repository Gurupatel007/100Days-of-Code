#include<bits/stdc++.h>
using namespace std;
int main()
{
    //set contains only unique elements in sorted manner
    set<int>s;
    for(int i=0;i<5;i++){
        s.insert(i);
    }
    for(int i=0;i<5;i++){
        s.insert(i);
    }
    cout<<endl;
    cout<<"Elements after insertion : "<<endl;
    for(auto it = s.begin();it!=s.end();it++){
        cout<<*it<<" ";
    }
    cout<<endl;

    s.erase(s.begin());

    cout<<*s.begin();

    // others functions
    /*
    s.clear(); // clears the set
    s.empty(); // check whether the set is empty or not
    s.size(); // returns the size of the set
    s.count(5); //returns 1 if element present else 0
    s.find(3); // check for the elements
    */

    return 0;
}