#include<bits/stdc++.h>
using namespace std;
void storeFibo(int i,int n,vector<int> &fibo){
    if(i>=n) return;
    int ans = fibo.at(i-1)+fibo.at(i-2);
    fibo.push_back(ans);
    storeFibo(i+1,n,fibo);
}
vector<int> generateFibonacciNumbers(int n) {
    vector<int> fibo;
    fibo.push_back(0); // Initialize with 0
    if(n==1) return fibo;
    fibo.push_back(1); // Initialize with 1
    storeFibo(2,n,fibo);
    return fibo;
}
int main()
{
    int n;
    cin>>n;
    vector<int> ans = generateFibonacciNumbers(n);
    for(auto it : ans){
        cout<<it<<" ";
    }
    return 0;
}