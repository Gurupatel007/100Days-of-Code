#include<bits/stdc++.h>
using namespace std;

void printval(int i,int x,vector<int> &y){
    if(x<i){
        return;
    }
    else{
        y.push_back(i);
        printval(i+1,x,y);
    }
}

vector<int> printNos(int x) {
    vector<int> v;
    printval(1,x,v);
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