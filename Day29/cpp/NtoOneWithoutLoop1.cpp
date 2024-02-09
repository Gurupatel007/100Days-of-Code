#include<bits/stdc++.h>
using namespace std;

void printNumbers(int i,int x,vector<int> &v){
    if(x<i) return;
    else{
        v.push_back(x);
        printNumbers(i,x-1,v);
    }
}

vector<int> printNos(int x) {
    vector<int> v;
    printNumbers(1, x, v);
    return v;
}

int main()
{
    int n;
    cin>>n;
    vector<int> v = printNos(n);
    for(int i=0;i<v.size();i++){
        cout<<v[i]<<" ";
    }
    return 0;
}