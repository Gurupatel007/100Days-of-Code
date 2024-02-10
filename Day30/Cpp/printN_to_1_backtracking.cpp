#include<bits/stdc++.h>
using namespace std;
void printNumbers(int i,int x,vector<int> &v){
    if(x<1) return;
    printNumbers(i,x-1,v);
    v.push_back(i-(x-1));
}

vector<int> printNos(int x) {
    vector<int> v;
    printNumbers(x, x, v);
    return v;
}
int main()
{
    int n;
    cin>>n;
    vector<int> v = printNos(n);
    for(auto i:v){
        cout<<i<<" ";
    }
    
    return 0;
}