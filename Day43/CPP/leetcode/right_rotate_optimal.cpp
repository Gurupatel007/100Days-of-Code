#include<bits/stdc++.h>
using namespace std;
void rotate(vector<int>& nums, int k) {
    if(nums.size()<=1) return;
    k  = k % nums.size();
    reverse(nums.begin(),nums.end());
    reverse(nums.begin(),nums.begin()+k);
    reverse(nums.begin()+k,nums.end());
}
int main()
{
    int n;
    cin>>n;
    int d;
    cin>>d;
    vector<int> arr;
    int x;
    for(int i=0;i<n;i++){
        cin>>x;
        arr.push_back(x);
    }
    rotate(arr,d);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}