#include<bits/stdc++.h>
using namespace std;
void findMin_Max_Occurences(int arr[],int n){
    int minEle = arr[0];
    int maxEle = arr[n];
    int minFreq = n;
    int maxFreq = 0;
    vector<bool> visited(n,false);
    for (int  i = 0; i < n; i++)
    {
        if(visited[i]==true) continue;

        int count=1;
        for (int j = i+1; j < n; j++)
        {
            if(arr[i]==arr[j]){
                visited[j] = true;
                count++;
            }
        }
        if(count>maxFreq){
            maxEle = arr[i];
            maxFreq = count;
        }
        if(count<minFreq){
            minEle = arr[i];
            minFreq = count;
        }
        
    }
    cout<<"Min frequency Element : "<<minEle<<endl;
    cout<<"Max frequency Element : "<<maxEle<<endl;
        
}
int main()
{
    int arr[6] = {1,2,3,1,1,2};
    int n = sizeof(arr)/sizeof(arr[0]);
    findMin_Max_Occurences(arr,n);
    return 0;
}