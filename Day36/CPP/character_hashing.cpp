#include<bits/stdc++.h>
using namespace std;
void printOccurences(vector<char> numberArr,vector<int> hashArr){
    for(int i=0;i<numberArr.size();i++){
        cout<<numberArr[i]<<": "<<hashArr[numberArr[i]]<<endl;
    }
}
int main()
{
    vector<char> arr = {'a','b','c','s','d','c','g','r'};
    vector<int> hashArr(256,0);
    vector<char> numberArr = {'s','a','b','c'};

    for(int i =0;i<arr.size();i++){
        hashArr[arr[i]]++;
    }

    printOccurences(numberArr,hashArr);
    return 0;
}