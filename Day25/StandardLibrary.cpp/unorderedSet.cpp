#include<bits/stdc++.h>
using namespace std;
int main()
{
    // declaration Syntax : unordered_set<data type, hash function, comparison function> name;
    unordered_set<int> s;

    s.insert(10); //insert an element
    s.begin(); //return an iterator pointing at first element
    s.end(); //return a iterator after the last element
    s.count(10); //return the number of elements with value 10
    s.find(10); //return an iterator pointing at the first element with value 10
    s.erase(10); //delete the first element with value 10
    s.size(); //returns the size of the unordered set
    s.empty(); //to check if the set is empty or not
    s.clear(); //deletes all the element in  unordered set

    unordered_set<int> ss;
    for(int i=0;i<5;i++){
        ss.insert(i);
    }
    for(int i=0;i<5;i++){
        ss.insert(i);
    }
    // ss.insert(3);
    cout<<"Elements in the unordered set : ";
    for(auto it = ss.begin(); it!=ss.end() ; it++){
        cout<<*it<<" ";
    }
    cout<<endl;

    int n=10;
    if(ss.find(n)!=ss.end()){
        cout<<n<<" is present in unordered set\n";
    }
    
    ss.erase(ss.begin());
    cout<<"Elements after deleting first element: ";

    for(auto it=ss.begin();it!=ss.end();it++){
        cout<<*it<<" ";
    }
    cout<<endl;


    if(ss.empty()){
        cout<<"Empty\n";
    }
    else cout<<"not empty\n";

    ss.clear();
    cout<<ss.size();

    return 0;
}