#include<bits/stdc++.h>
using namespace std;
int numIdenticalPairs(vector<int>& nums) {
    int n = nums.size();
    int count=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i] == nums[j]){
                count++;
            }
        }
    }
    return count;
}
int main()
{
    vector<int>nums = {1, 2, 3, 4, 5, 0};
    cout<<numIdenticalPairs(nums);
    return 0;
}