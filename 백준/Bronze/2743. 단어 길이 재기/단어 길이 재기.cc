# include <iostream>
using namespace std;
 
int main(){
    
   char s[1001]; // 0~1000까지 
   int len=0;
   cin>>s;//문자열 입력
   
   for(int i=0;s[i]!='\0';i++)len++;
   
   cout<<len;
    
}