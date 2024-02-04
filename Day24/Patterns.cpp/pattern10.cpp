#include<iostream>
using namespace std;
void nStarTriangle(int n) {
    for(int i=0;i<2*n;i++){
        int star = i<n?i+1:2*n-i-1;
        for(int j=0;j<star;j++){
            cout<<"*";
        }
        cout<<endl;
    }
}
int main()
{
    int x;
    cin>>x;
    nStarTriangle(x);
    return 0;
}