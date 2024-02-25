#include<bits/stdc++.h>
using namespace std;
vector<int> findArrayIntersection(vector<int> &arr1, int n, vector<int> &arr2, int m)
{
	int i =0;
	int j=0;
	vector<int>ans;

	while(i<n && j<m){
		if(arr1[i]<arr2[j]){
			i++;
		}
		else if(arr2[j]<arr1[i]){
			j++;
		}
		else{
			ans.push_back(arr1[i]);
			i++;
			j++;
		}
	}
	return ans;
}
int main()
{
    int n1;
    cin>>n1;
    vector<int>arr1 = {1,2,3,4,5,6};
    int n2;
    cin>>n2;
    vector<int>arr2 = {2,3,5,9,10,11};
    vector<int>result = findArrayIntersection(arr1,n1,arr2,n2);
    for(int i=0; i<result.size(); i++){
        cout << result[i] << " "; 
    }
    
    return 0;
}