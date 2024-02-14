#include<bits/stdc++.h>
using namespace std;
vector<int> countFrequency(int n, int x, vector<int> &nums){
    vector<int> hash(n,0);
    for(int i=0;i<n;i++){
        if(nums[i]>n) continue;
        hash[nums[i]-1]++;
    }
    return hash;
}
int main()
{
    int n,x;
    cin>>n>>x;
    vector<int> nums(n);
    for(int i=0;i<n;i++) cin>>nums[i];
    vector<int> ans = countFrequency(n,x,nums);
    for(int i=0;i<n;i++) cout<<ans[i]<<" ";
    
    return 0;
}