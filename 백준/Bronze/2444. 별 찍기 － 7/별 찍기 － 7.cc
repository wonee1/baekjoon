#include <iostream>
using namespace std;

int main() {
    
  int N;
  cin>>N; //첫째 줄 입력 
  

  for(int i=1;i<=N;i++){
      
      for(int k=N-i;k>0;k--)cout<<" ";
      
      for(int j=2*i-1;j>0;j--)cout<<"*";
      
      cout<<endl;
  }
   
  for(int i=N-1;i>0;i--){
      
      for(int k=0;k<N-i;k++)cout<<" ";
      for(int j=2*i-1;j>0;j--)cout<<"*";
      
      cout<<endl;
     
  } 
   
   
}
