#include <iostream>
#include <string> 
using namespace std; 

int main()
{
    string s;
    int cnt=1;
    
    getline(cin,s);//공백까지 같이 입력받기 
    
    for(int i=0;i<s.length();i++){
        
        if(s[i]==' ')cnt++;
    }
    
    if(s[0]==' ')cnt--; //첫글자가 공백이면 감소
    
    if(s[s.length()-1]==' ')cnt--; //끝이 공백이면 감소 



    cout<<cnt;
    return 0;
}
