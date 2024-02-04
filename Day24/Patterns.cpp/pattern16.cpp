#include<iostream>
using namespace std;
void alphaRamp(int n) {
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<(char)(65+i)<<" ";
        }
        cout<<endl;
    }
}

int main()
{
    int x;
    cin>>x;
    alphaRamp(x);
    return 0;
}