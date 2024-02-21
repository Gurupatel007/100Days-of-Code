#include<bits/stdc++.h>
using namespace std;
int secondLargest(vector<int>arr,int n){
    int largest = arr[0];
    int slargest = -1;
    for(int i=1;i<n;i++){
        if(arr[i]>largest){
            slargest = largest;
            largest = arr[i];
        }
        if(arr[i]!=largest && arr[i]>slargest){
            slargest = arr[i];
        }
    }
    return slargest;
}
int secondSmallest(vector<int>arr, int n){
    int smallest = arr[0];
    int ssmallest = INT_MAX;
    for(int i=1;i<n;i++){
        if(arr[i]<smallest){
            ssmallest = smallest;
            smallest = arr[i];
        }
        if(arr[i]!=smallest && arr[i]<ssmallest){
            ssmallest = arr[i];
        }
    }
    return ssmallest;
}
int main()
{
    vector<int> arr = {5, 10, 15, 20, 25};
    int sSmallest = secondSmallest(arr,arr.size());
    int sLargest = secondLargest(arr,arr.size());

    cout<<"The second Largest element: "<<sLargest<<endl;
    cout<<"The second Smallest element: "<<sSmallest<<endl;
    return 0;
}