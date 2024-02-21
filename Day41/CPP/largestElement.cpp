#include<bits/stdc++.h>
using namespace std;
int largestElement(vector<int> &arr, int n) {
    int max = arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>=max) max = arr[i];
    }
    return max;
}
int main()
{
    vector<int> arr = {5, 10, 15, 20, 25};
    int n = arr.size();
    int largest = largestElement(arr, n);
    cout << "Largest element in the array: " << largest << endl;
    return 0;
}