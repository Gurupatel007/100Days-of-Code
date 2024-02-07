// link : https://leetcode.com/problems/palindrome-number/

#include<bits/stdc++.h>
using namespace std;
bool isPalindrome(int x) {
        if(x<0) return false;
        if(x<10) return true;
        int n = 0;
        int t = x;
        while(x!=0){
            if(n>INT_MAX/10 || n<INT_MIN/10) return  0;
            n = n*10 + x%10;
            x/=10;
        }
        return t == (int(n));
    }
int main()
{
    int n;
    cin>>n;
    bool x = isPalindrome(n);
    cout<<x<<endl;
    return 0;
}