
#include<bits/stdc++.h>
using namespace std;
int calcGCD(int n, int m){
    while(n>0 && m>0){
        if(n>m) n=n%m;
        else m = m%n;
    }
    if(m==0) return n;
    else return m;
}
int main()
{
    int n,m;
    cin>>n>>m;
    cout<<calcGCD(n,m)<<endl;
    
    return 0;
}