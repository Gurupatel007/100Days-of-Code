#include<bits/stdc++.h>
using namespace std;
int countDigits(int n){
	int count = 0;
	int x = n;
	while(x!=0){
		int temp = x%10;
		if(temp!=0 && n%temp==0){
			count++;
		}
		x = x/10;
	}
	return count;
}
int main()
{
    int n;
    cin>>n;
    int x = countDigits(n);
    cout<<x<<endl;
    return 0;
}