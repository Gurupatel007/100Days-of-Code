#include<bits/stdc++.h>
using namespace std;
long long printSum(long long x){
    if(x==0) return 0;
    return x+printSum(x-1);
}
long long sumFirstN(long long n) {
    long long ans = printSum(n);
    return ans;
}
int main()
{
    long long n;
    cin>>n;
    long long ans = sumFirstN(n);
    cout<<ans;
    
    return 0;
}