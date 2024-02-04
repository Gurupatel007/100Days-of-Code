#include<iostream>
using namespace std;
void symmetry(int n) {
    int inis = (2*n)-2; 
    for(int i=1;i<=2*n-1;i++){
        // star
        int star = i>n?2*n-i:i;
        for (int j = 1; j <= star; j++) {
          cout << "*";
        }

        // space
        for(int j=0;j<inis;j++){
            cout<<" "; 
        }
        // star
        for (int j = 1; j <= star; j++) {
            cout << "*";
        }
        cout<<endl;
        if(i<n) inis-=2;
        else inis+=2;
    }
}
int main()
{
    int x;
    cin>>x;
    symmetry(x);
    return 0;
}