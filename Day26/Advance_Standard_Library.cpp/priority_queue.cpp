#include<bits/stdc++.h>
using namespace std;
void printPriorityQueue(priority_queue<int>pq){
    while(!pq.empty()){
        cout<<pq.top()<<" ";
        pq.pop();
    }
}
void printMinimumHeap(priority_queue<int,vector<int>,greater<int>>pqq){
    while(!pqq.empty()){
        cout<<pqq.top()<<" ";
        pqq.pop();
    }
    cout<<endl;
}
int main()
{
    /*
    It's a queue which stores based on the priority like the one which has highest will be stored at the top like in a sorted order in decresing order.
    */
    priority_queue<int>pq;
    pq.push(10);
    pq.push(2);
    pq.push(5);
    pq.push(1);
    pq.push(15);
    pq.push(8);
    cout<<"The elements are : "<<endl;
    printPriorityQueue(pq);
    cout<<endl;
    pq.pop();
    printPriorityQueue(pq);


    // Minimum heap 
    priority_queue<int,vector<int>,greater<int>>pqq;
    pqq.push(10);
    pqq.push(2);
    pqq.push(5);
    pqq.push(1);
    pqq.push(15);
    pqq.push(8);
    cout<<endl;
    printMinimumHeap(pqq);
    pqq.pop();
    printMinimumHeap(pqq);
    cout<<pqq.top()<<endl;
    
    return 0;
}