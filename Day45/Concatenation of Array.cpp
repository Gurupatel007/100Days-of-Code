#include<bits/stdc++.h>
using namespace std;
vector<int> getConcatenation(vector<int>& nums) {
    int n = nums.size();
    vector<int>ans (n*2);
    for(int i=0;i<n;i++){
        ans[i] = nums[i];
        ans[n+i] = nums[i];
    }
    return ans;
}
int main()
{
    vector<int>nums = {1, 2, 3};
    vector<int>result = getConcatenation(nums); 
    for(int i=0; i<result.size(); i++){
        cout << result[i] << " "; 
    }
    return 0;
}