#include<bits/stdc++.h>
using namespace std;
void printstack(stack<int>s){
    while(!s.empty()){
        cout<<s.top()<<" ";
        s.pop();
    }
    cout<<endl;
}
int main()
{
    stack<int>s;
    // Adding elements to the stack
    for(int i=0;i<5;i++){
        s.push(i);
    }
    // printing the elements in the stack
    printstack(s);  
    cout<<endl;
    s.pop();
    printstack(s);
    cout<<s.top()<<endl;


    // other functions
    cout<<"Empty or not: "<<s.empty()<<endl;
    cout<<"Size of the stack: "<<s.size()<<endl;
    cout<<"Top element of the stack: "<<s.top()<<endl;

    return 0;
}