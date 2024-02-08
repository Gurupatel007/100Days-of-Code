#include<bits/stdc++.h>
using namespace std;
bool isPrime(int n)
{
	int count=0;
	for(int i=1;i*i<=n;i++){
		if(n%i==0){
			count=count+1;
			if(n/i!=i) count++;
		}
	}
	if(count==2) return true;
	else return false;
}
int main()
{
	int n;
	cin>>n;
	cout<<isPrime(n)<<endl;
	
	return 0;
}

