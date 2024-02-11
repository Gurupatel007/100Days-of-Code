#include<bits/stdc++.h>
using namespace std;
void reverse(int i,vector<int> &nums,int n){
    if(i>=n) return;
    swap(nums[i],nums[n]);
    reverse(i+1, nums,n-1);
}
vector<int> reverseArray(int n, vector<int> &nums)
{
    reverse(0,nums,n-1);
    return nums;
}
int main()
{
    vector<int> nums = {10,20,30,40,50,60};
    vector<int> ans = reverseArray(nums.size(),nums);
    for(auto it:ans){
        cout<<it<<" ";
    }
    return 0;
}