#include<bits/stdc++.h>
using namespace std;
vector<int> shuffle(vector<int>& nums, int n) {
    int len = nums.size();
    vector<int>ans;

    for(int i=0;i<n;i++){
        ans.push_back(nums[i]);
        ans.push_back(nums[i+n]);
    }

    return ans;
}
int main()
{
    int n;
    cin>>n;
    vector<int>nums = {1, 2, 3, 9, 9, 4, 10, 20};
    vector<int>result = shuffle(nums,n); 
    for(int i=0; i<result.size(); i++){
        cout << result[i] << " "; 
    }
    return 0;
}