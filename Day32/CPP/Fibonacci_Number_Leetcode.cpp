#include<bits/stdc++.h>
using namespace std;
int fibo(int n){
    if(n<=1) return n;
    int last = fibo(n-1);
    int slast = fibo(n-2);
    return last+slast;
}
int fib(int n) {
    int ans = fibo(n);
    return ans;
}
int main()
{
    int n;
    cin>>n;
    int ans  = fib(n);
    cout<<ans;
    return 0;
}