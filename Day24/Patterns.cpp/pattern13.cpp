#include<iostream>
using namespace std;
void nNumberTriangle(int n) {
    int counter = 1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<counter<<" ";
            counter++;
        }
        cout<<endl;
    }
}
int main()
{
    int x;
    cin>>x;
    nNumberTriangle(x);
    return 0;
}