#include<iostream>
#include<stack>
using namespace std;
int main(){
    stack<int> arr;
    int x;
    cin>>x;
    int numm;
    for(int i=0;i<x;i++){
        cin>>numm;
        arr.push(numm);
    }
    while(!arr.empty()){
        cout<<arr.top()<<" ";
        arr.pop();
    }

}
