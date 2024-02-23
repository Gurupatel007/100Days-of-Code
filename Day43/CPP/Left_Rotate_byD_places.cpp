// Brute force Approach
#include<bits/stdc++.h>
using namespace std;
vector<int> rotateArraybyD(vector<int> &arr,int n, int d){
    d = d % n;
    int temp[d];
    for(int i=0;i<d;i++){
        temp[i] = arr[i];
    }

    for(int i=d;i<n;i++){
        arr[i-d] = arr[i];
    }

    for(int i=n-d;i<n;i++){
        arr[i] = temp[i-(n-d)];
    }
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