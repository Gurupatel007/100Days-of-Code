#include<bits/stdc++.h>
using namespace std;
void reversedArr(int n,vector<int> nums,vector<int> &revarr){
    if(n<0) return;
    revarr.push_back(nums[n]);
    reversedArr(n-1, nums,revarr);
}

vector<int> reverseArray(int n, vector<int> &nums)
{
    vector<int> revArr;
    reversedArr(n-1 , nums, revArr);
    return revArr;
}


int main()
{
    int n;
    cin>>n;
    vector<int> nums(n);
    for(int i=0;i<n;i++){
        cin>>nums[i];
    }
    vector<int> revArr = reverseArray(n, nums);
    for(int i=0;i<n;i++){
        cout<<revArr[i]<<" ";
    }
    
    return 0;
}