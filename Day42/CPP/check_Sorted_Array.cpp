#include<bits/stdc++.h>
using namespace std;
int isSorted(int n, vector<int> a) {
    for(int i=1;i<n;i++){
        if(a[i]<a[i-1]) return false;
    }
    return true;
}

int main()
{
    int n;
    cin>>n;
    // vector<int>arr = {1, 2, 3 ,8 ,2 ,3 ,4 ,9};
    vector<int> arr = {1,1,2,3,4,4,6,7,10,20};
    int ans = isSorted(n,arr);
    cout<<ans;
    return 0;
}