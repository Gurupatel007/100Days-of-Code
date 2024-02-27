#include<bits/stdc++.h>
using namespace std;
int findMaxConsecutiveOnes(vector<int>& nums) {
        int max=0,count=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                count++;
            }
            else count=0;
            if(max < count) max = count;
        }
        return max;
    }
int main()
{
    vector<int> nums = {1,1,0,1,1,1};
    cout<<findMaxConsecutiveOnes(nums)<<endl;
    
    return 0;
}