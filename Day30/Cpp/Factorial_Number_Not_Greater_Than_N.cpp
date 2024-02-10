#include<bits/stdc++.h>
using namespace std;
long long findFact(long long i){
    if(i==1 || i==0) return 1;
    return i*findFact(i-1);
}

vector<long long> factorialNumbers(long long n) {
    vector<long long>v;
    for(long long i=1;i<=n;i++){
        long long ans = findFact(i);
        if(ans > n){
            return v;
        }
        v.push_back(ans);
    }
}
int main()
{
    long long n;
    cin>>n;
    vector<long long> v = factorialNumbers(n);
    for(auto i:v){
        cout<<i<<" ";
    }
    return 0;
}