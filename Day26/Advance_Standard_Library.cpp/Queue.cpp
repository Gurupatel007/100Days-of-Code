#include<bits/stdc++.h>
using namespace std;

void printqueue(queue<int>q){
    while(!q.empty()){
        cout<<q.front()<<" ";
        q.pop();
    }
    cout<<endl;
}
int main()
{
    queue<int>q;
    // Adding elements to the queue
    for(int i=0;i<5;i++){
        q.push(i);
    }
    // printing the elements in the queue
    printqueue(q);
    q.pop();
    printqueue(q);
    cout<<endl;

    // other functions
    cout<<"Empty or not: "<<q.empty()<<endl;
    cout<<"Size of the queue: "<<q.size()<<endl;
    cout<<"Front element of the queue: "<<q.front()<<endl;
    cout<<"Back element of the queue: "<<q.back()<<endl;
    return 0;
}