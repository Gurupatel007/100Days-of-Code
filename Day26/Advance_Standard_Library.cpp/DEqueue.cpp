#include<bits/stdc++.h>
using namespace std;
void printDEqueue(deque<int>dq){
    while(!dq.empty()){
        cout<<dq.front()<<" ";
        dq.pop_front();
    }
}
int main()
{
    deque<int>dq;
    dq.push_back(10);
    dq.push_back(20); //add element at the end
    // printDEqueue(dq);
    dq.push_front(30); // add element at the beginning
    dq.push_front(40);
    dq.push_front(50);
    printDEqueue(dq);
    
    // remove the first element
    dq.pop_front();
    //removes the last element
    dq.pop_back();
    cout<<endl;
    printDEqueue(dq);
    return 0;
}