#include<bits/stdc++.h>
using namespace std;

//time complexity : o(1) for best and average case and for worst case it takes O(n) but it's a very rare case.
//using map for best,average,worst case the timecomplexity is : O(nlogn)

void frequency(int arr[],int n){
    unordered_map<int,int> map;
    for(int i=0;i<n;i++){
        map[arr[i]]++;
    }
    for(auto x:map){
        cout<<x.first<<" "<<x.second<<endl;
    }
}
int main()
{
    int arr[] = {10,5,10,15,10,5};
    int n = sizeof(arr) / sizeof(arr[0]);
    frequency(arr, n);
    return 0;
}