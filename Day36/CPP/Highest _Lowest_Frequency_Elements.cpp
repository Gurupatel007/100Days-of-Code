#include<bits/stdc++.h>
using namespace std;
vector<int> getFrequencies(vector<int>& v) {
    int n= v.size();
    int maxi = INT_MIN,mini = INT_MAX;
    int maxFirst,minFirst;
    vector<int> ans;
    map<int,int> mp;
    for(auto &it:v)
        mp[it]++;
    
    
    for(auto &it:mp){
        if (it.second > maxi) {
            maxi = it.second;
            maxFirst = it.first;
        }
        if(it.second<mini){
            mini = it.second;
            minFirst = it.first;
        }
    }
    ans.push_back(maxFirst);
    ans.push_back(minFirst);
    return ans;
}
int main()
{
    int n;
    cin>>n;
    vector<int> v(n);
    for(int i=0;i<n;i++)
        cin>>v[i];
    vector<int> ans = getFrequencies(v);
    cout<<ans[0]<<" "<<ans[1]<<endl;
    
    return 0;
}