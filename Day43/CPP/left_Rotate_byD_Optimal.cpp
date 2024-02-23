// Optimal approach
#include<bits/stdc++.h>
using namespace std;
vector<int> rotateArraybyD(vector<int> arr, int n, int d) {
    reverse(arr.begin(), arr.begin() + d);
    reverse(arr.begin() + d, arr.end());
    reverse(arr.begin(), arr.end());

    return arr;
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
    vector<int>ans = rotateArraybyD(arr,n,d);
    for(int i=0;i<n;i++){
        cout<<ans[i]<<" ";
    }
    return 0;
}