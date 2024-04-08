#include <iostream>
#include <algorithm>
#include <string> 
using namespace std; 

int main()
{
    string A;
    string B;

    
    cin>>A;cin>>B;
    
    reverse(A.begin(),A.end());
    reverse(B.begin(),B.end());
    
    int num1=stoi(A);
    int num2=stoi(B);
    
    if(num1>num2){
        cout<<num1;
    }
    else cout<<num2;
    
    
    return 0;
}