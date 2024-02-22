#include<bits/stdc++.h>
using namespace std;
int removeDuplicates(vector<int> &arr, int n) {
	int i=0;
	for(int j=1;j<n;j++){
		if(arr[i]!=arr[j]){
			arr[i+1] = arr[j];
			i++;
		}
	}
	return i+1;
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
    int ans = removeDuplicates(arr,arr.size());
    cout<<ans;
    return 0;
}