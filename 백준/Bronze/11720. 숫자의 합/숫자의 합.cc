# include <iostream>
# include <string>
using namespace std;
 
int main(){
    
   int N;
   cin>>N;//숫자 개수 
   
   string s;
   
   int sum=0;
   cin>>s;
   
   for(int i=0;i<N;i++){
   sum+=s[i]-'0';//char형을 int 형으로 변환 
   }
  
  cout<<sum;
   return 0; 
}