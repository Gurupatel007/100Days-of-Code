#include<bits/stdc++.h>
using namespace std;

void insertionSort(int arr[], int n){
    if(n==1) return;
    insertionSort(arr,n-1);
    int last = arr[n-1];
    int j= n-2;

    while(j>=0 && arr[j]>last){
        arr[j+1] = arr[j];
        j--;
    }
    arr[j+1] = last;// why this step is included outside the while loop?
    // because if the while loop is not executed then the last element is already at its correct position
}

void insertionSort(int n, vector<int> &arr){
    if(n==1) return;
    insertionSort(n-1,arr);
    int last = arr[n-1];
    int j= n-2;

    while(j>=0 && arr[j]>last){
        arr[j+1] = arr[j];
        j--;
    }
    arr[j+1] = last;// why this step is included outside the while loop?
    // because if the while loop is not executed then the last element is already at its correct position

}
int main()
{
    int n;
    cin>>n;

    // using array
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    insertionSort(arr,n);
    for(int i = 0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    
    // using vector
    vector<int> arr1(n);
    for(int i=0;i<n;i++){
        cin>>arr1[i];
    }
    insertionSort(n,arr1);
    for(int i = 0;i<n;i++){
        cout<<arr1[i]<<" ";
    }
    return 0;
}