#include<bits/stdc++.h>
using namespace std;

void triangle(int n) {
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			cout<<i<<" ";
		}
		cout<<endl;
	}
}
int main(){
    int n;
    cin>>n;
    triangle(n);
}