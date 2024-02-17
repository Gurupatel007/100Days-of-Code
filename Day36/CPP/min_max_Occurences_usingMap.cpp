#include<bits/stdc++.h>
using namespace std;
void findOccurences(int arr[] ,int n){
    unordered_map<int,int> map;
    int minEle = INT_MIN;
    int maxEle = INT_MAX;
    int minFreq = n;
    int maxFreq;

    for(int i=0;i<n;i++){
        map[arr[i]]++;
    }

    for(auto it:map){
        if(it.second<minFreq){
            minEle = it.first;
            minFreq = it.second; 
        }
        if(it.second>maxFreq){
            maxEle = it.first;
            maxFreq = it.second;
        }
    }
    cout<<"Max Freq Element : "<<maxEle<<endl;
    cout<<"Min Freq Ele : "<<minEle<<endl;
}
int main()
{
    int arr[] = {1,2,1,1,3,2};
    int n = sizeof(arr)/sizeof(arr[0]);
    findOccurences(arr,n);
    return 0;
}