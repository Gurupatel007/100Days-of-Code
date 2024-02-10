#include<bits/stdc++.h>
using namespace std;
void printval(int i,int x,vector<int> &y){
    if(i<1){
        return;
    }
    else{
        printval(i-1,x,y);
        y.push_back(i);
    }
}

vector<int> printNos(int x) {
    vector<int> v;
    printval(x,x,v);
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