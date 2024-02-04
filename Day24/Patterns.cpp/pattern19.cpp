#include<iostream>
using namespace std;
void symmetry(int n) {
    int inis = 0;
    for(int i=0;i<n;i++){
        // star
        for(int j=1;j<=n-i;j++){
            cout<<"*";
        }

        // space
        for(int j=0;j<inis;j++){
            cout<<" ";
        }

        // star
        for(int j=1;j<=n-i;j++){
            cout<<"*";
        }
        inis += 2;
        cout<<endl;
    }
    inis = (2*n)-2;
    for(int i=1;i<=n;i++){
        // star
        for(int j=1;j<=i;j++){
            cout<<"*";
        }

        // space
        for(int j=0;j<inis;j++){
            cout<<" ";
        }

        // star
        for(int j=1;j<=i;j++){
            cout<<"*";
        }
        inis-=2;
        cout<<endl;
    }
}

int main()
{
    int x;
    cin>>x;
    symmetry(x);
    return 0;
}