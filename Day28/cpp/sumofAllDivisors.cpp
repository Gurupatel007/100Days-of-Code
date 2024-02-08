#include<bits/stdc++.h>
using namespace std;
int sumOfAllDivisors(int n){
	int sum=0;
	for(int i=1;i<=n;i++){
		sum+=(n/i)*i;
	}
	return sum;
}
int main()
{
	int n;
	cin>>n;
	cout<<sumOfAllDivisors(n)<<endl;
	
	return 0;
}