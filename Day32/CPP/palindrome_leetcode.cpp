#include<bits/stdc++.h>
using namespace std;
bool isPalindrome(string s) {
        string newstr="";
        for(int i=0; i<s.length(); i++)
        {
            if(isalpha(s[i]) || isdigit(s[i]))
                newstr += tolower(s[i]);
        }
        
        string str = newstr;
        reverse(newstr.begin(),newstr.end());
        if(str == newstr){
            return true;
        }
        return false;
}
int main()
{
    string input;
    // cout << "Enter a string: ";
    cin >> input;

    if (isPalindrome(input)) {
        cout << "The string is a palindrome." << endl;
    } else {
        cout << "The string is not a palindrome." << endl;
    }

    return 0;
}