#include<bits/stdc++.h>
using namespace std;
void selection_sort(int arr[],int n){
    for(int i=0;i<=n-2;i++){
        int min = i;
        int min_index;
        for(int j=i+1;j<=n-1;j++){
            if(arr[j]<arr[min]){
                min = j;
            }
        }
        swap(arr[i],arr[min]);
    }
    for(int x=0;x<n;x++){
        cout<<arr[x]<<" ";
    }
}
int main()
{
    int n;
    int arr[] = {19,1,0,3,6,48,16};
    n = sizeof(arr)/sizeof(arr[0]);
    selection_sort(arr,n);
    return 0;
}