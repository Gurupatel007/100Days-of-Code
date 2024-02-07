#include<bits/stdc++.h>
using namespace std;
void checkpalindrome(int x){
    int temp = x;
    int rev = 0;
    while(temp!=0){
        int lastdigit = temp%10;
        rev = rev*10 + lastdigit;
        temp = temp/10;
    }
    if(rev==x){
        cout<<"Palindrome"<<endl;
    }
    else cout<<"Not Palindrome"<<endl;
}
int main()
{
    int x;
    cin>>x;
    cout<<(-1%10)<<endl;
    checkpalindrome(x);
    return 0;
}