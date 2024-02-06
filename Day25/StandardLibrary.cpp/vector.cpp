#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector<int> v;
    for(int i=0;i<10;i++){
        v.push_back(i); //adds the element at the end of vector
    }
    cout<<"Elements after adding: "<<endl;
    for(auto it = v.begin(); it!=v.end();it++){
        cout<<*it<<" ";
    }
    cout<<endl;
    cout<<v.front()<<endl; //returns the first element
    cout<<v.back()<<endl; //returns the last element
    cout<<v.size()<<endl;

    v.pop_back(); //removing the last element
    cout<<"Elements after removing last element: "<<endl;

    for(auto it=v.begin();it!=v.end();it++){
        cout<<*it<<" ";
    }
    cout<<endl;

    // inset at first index 
    v.insert(v.begin(),20);

    cout<<"First Element : "<<v[0]<<endl;
    // removing the first element
    v.erase(v.begin());
    cout<<"first element after removing first element: "<<v[0]<<endl;

    // checking if empty or not
    if(v.empty())
    cout<<"empty";
    else cout<<"empty";

    // clearing the vector
    v.clear();
    cout<<"After clearing the size : "<<v.size(); //returns the size of the vector
    
    return 0;
}