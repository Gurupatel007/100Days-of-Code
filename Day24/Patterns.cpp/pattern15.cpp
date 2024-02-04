#include<iostream>
using namespace std;
void nLetterTriangle(int n) {
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            cout<<(char)(65+j)<<" ";
        }
        cout<<endl;
    }
}
int main()
{
    int x;
    cin>>x;
    nLetterTriangle(x);
    return 0;
}