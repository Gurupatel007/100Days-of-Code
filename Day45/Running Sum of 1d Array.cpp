#include<bits/stdc++.h>
using namespace std;
vector<int> runningSum(vector<int>& nums) {
    int n = nums.size();
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=nums[i];
        nums[i] = sum;
    }
    return nums;
}
int main()
{
    vector<int>nums = {1, 2, 3, 4, 5, 6};
    vector<int>result = runningSum(nums); 
    for(int i=0; i<result.size(); i++){
        cout << result[i] << " "; 
    }
    return 0;
}