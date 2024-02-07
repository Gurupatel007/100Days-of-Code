// link: https://leetcode.com/problems/reverse-integer/
#include<bits/stdc++.h>
using namespace std;
int reverse(int x) {
        int sum=0;
        while(x!=0){
            int rem = x%10;
            
            /*
            checking if the sum is greater then the 2^31 or if the value is equal to 2^30 and rem greater than 7.
            As if the rem is less than the 7 then it will in the range of less than 2^31 and so it will be added into sum variable in next line(line no :11).
            And similarly we check for the negative 2^-31 in that rem<-8.
            */
            if (sum > INT_MAX/10 || (sum == INT_MAX / 10 && rem > 7)) return 0;
            if (sum < INT_MIN/10 || (sum == INT_MIN / 10 && rem < -8)) return 0;
            sum = sum*10 + rem;
            x = x/10;
        }
        return sum;
    }
int main()
{
    int n;
    cin>>n;
    int x = reverse(n);
    cout<<x<<endl;
    return 0;
}