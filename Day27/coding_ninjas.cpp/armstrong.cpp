#include<bits/stdc++.h>
using namespace std;

bool checkArmstrong(int n){
	int d = log10(n) + 1;  
	// You can also use while loop to extract d
	int m = n;
	long int sum = 0;
	while(m != 0) {
		sum = sum + pow((m%10),d); // inbuilt function
		m = m / 10;
	}
	return sum == n;
}


int main()
{
	int n;
	cin>>n;
	checkArmstrong(n);

	return 0;
}
