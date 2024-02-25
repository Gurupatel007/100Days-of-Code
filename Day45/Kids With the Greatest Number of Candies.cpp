#include<bits/stdc++.h>
using namespace std;
vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
    int max = 0;
    vector<bool>ans;
    for(int x : candies){
        if(max < x) max = x;
    }
    for(int i=0;i<candies.size();i++){
        if((candies[i]+extraCandies) >= max){
            ans.push_back(true);
        }else ans.push_back(false);
    }
    return ans;
}
int main()
{
    int n;
    cin>>n;
    vector<int>nums = {1, 2, 3, 6, 1, 3, 4, 9};
    vector<bool>result = kidsWithCandies(nums,n); 
    for(int i=0; i<result.size(); i++){
        cout << result[i] << " "; 
    }
    return 0;
}