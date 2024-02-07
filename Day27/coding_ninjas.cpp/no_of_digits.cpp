#include<bits/stdc++.h>
using namespace std;
int countDigits(int n) { 
	string str = to_string(n);
	return str.length();
}

int main()
{
    int n;
    cin>>n;
    int x = countDigits(n);
    cout<<x<<endl;
    return 0;
}