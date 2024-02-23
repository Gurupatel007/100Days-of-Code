#include<bits/stdc++.h>
using namespace std;
void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        if(n<=1) return;
        k = k % n;
        vector<int> temp(k);
        for(int i=n-k;i<n;i++){
            temp[i-(n-k)] = nums[i];
        }
        for(int i=n-1;i>=k;i--){
            nums[i] = nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
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