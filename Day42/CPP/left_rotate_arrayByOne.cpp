#include<bits/stdc++.h>
using namespace std;
vector<int> rotateArray(vector<int>& arr, int n) {
    vector<int>ans;
    int temp = arr[0];
    for(int i=1;i<=n;i++){
        if(i==n){
            ans.push_back(temp);
        }else {
            ans.push_back(arr[i]);
        }
    }
    return ans;
}
int main()
{
    int n;
    cin>>n;
    vector<int> arr;
    int x;
    for(int i=0;i<n;i++){
        cin>>x;
        arr.push_back(x);
    }
    vector<int>ans = rotateArray(arr,arr.size());
    for(int i=0;i<n;i++){
        cout<<ans[i]<<" ";
    }
    return 0;
}