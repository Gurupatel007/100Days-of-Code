#include<iostream>
using namespace std;

void nStarDiamond(int n) {
    for(int i=0;i<2*n;i++){
        // space
        int space = i<n-1?n-i-1:i-n;
        for(int j=0;j<space;j++){
            cout<<" ";
        }

        // star
        int star = i<n?2*i+1:2*n-2*space-1;
        for(int j=0;j<star;j++){
            cout<<"*";
        }

        // space
        for(int j=0;j<space;j++){
            cout<<" ";
        }
        cout<<endl;
    }
}

int main()
{
    int x;
    cin>>x;
    nStarDiamond(x);
    return 0;
}