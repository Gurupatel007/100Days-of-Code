#include<bits/stdc++.h>
using namespace std;
int singleNumber(vector<int>& nums) {
        int XOR = 0;
        for(int i=0;i<nums.size();i++){
            XOR = XOR^nums[i];
        }
        return XOR;
    }
int main()
{
    vector<int> nums = {4,1,2,1,2};
    cout<<singleNumber(nums)<<endl;
    return 0;
}