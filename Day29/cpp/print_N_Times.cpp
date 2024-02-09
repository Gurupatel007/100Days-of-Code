#include<bits/stdc++.h>
using namespace std;

void printString(int i ,int n,vector<string> &str){
	if(n<i) return;
	else{
		str.push_back("Coding Ninjas");
		printString(i+1,n,str);
	}
}
vector<string> printNTimes(int n) {
	vector<string>str;
	printString(1,n,str);
	return str;
}

int main()
{
    int n;
    cin>>n;
    vector<string> str = printNTimes(n);
    for(int i=0;i<str.size();i++){
        cout<<str[i]<<endl;
    }
    
    return 0;
}