#include<bits/stdc++.h>
using namespace std;
void reverse(int i,vector<int> &nums,int n){
    if(i>=(n/2)) return;
    swap(nums[i],nums[n-i-1]);
    reverse(i+1,nums,n);
}
vector<int> reverseArray(int n, vector<int> &nums)
{
    reverse(0,nums,n);
    return nums;
}
int main()
{
    vector<int> nums = {10,20,30,40,50};
    vector<int> ans = reverseArray(nums.size(),nums);
    for(auto it:ans){
        cout<<it<<" ";
    }
    return 0;
}