# include <iostream>
using namespace std;
 
int main(){
    
   int T;
   char s[1001];
   
   cin>>T;
   
   while(T--){
   cin>>s;
   
   int len=0;
   for(int i=0;s[i]!='\0';i++)len++;
   
   cout<<s[0]<<s[len-1]<<endl;
   
   }
   
   return 0; 
}