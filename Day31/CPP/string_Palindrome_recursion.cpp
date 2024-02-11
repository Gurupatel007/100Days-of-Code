#include<bits/stdc++.h>
using namespace std;
bool checkpalindrome(int i,string &str,int n){
    if(i>=(n/2)) return true;
    else if(str[i]!=str[n-i-1]) return false;
    checkpalindrome(i+1,str,n);
}
bool isPalindrome(string& str) {
    return checkpalindrome(0,str,str.length());
}

int main()
{
    string str = "madam";
    bool ans =  isPalindrome(str);
    cout<<ans;
    return 0;
}