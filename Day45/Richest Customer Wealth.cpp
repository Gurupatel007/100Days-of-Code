#include<bits/stdc++.h>
using namespace std;
int maximumWealth(vector<vector<int>>& accounts) {
    int n = accounts.size();
    int max = 0;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<accounts[i].size();j++){
            sum+=accounts[i][j];
        }
        if(max<sum) max = sum;
    }
    return max;
}
int main()
{
    vector<vector<int>>nums = {{1, 2, 3},{3, 3, 1}};
    cout<< maximumWealth(nums); 
    
    return 0;
}