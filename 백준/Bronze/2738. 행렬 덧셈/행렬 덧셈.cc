#include <iostream>
using namespace std;


int main() {
  int N,M;
  
  cin>>N;cin>>M;
  
  
  int A[N][M];
  int B[N][M];
  
  for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
          cin>>A[i][j];
          
      }
      
      
  }
 
   for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
          cin>>B[i][j];
          
          
      }
      
  }
  
  int sum[N][M];
  
  for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
          sum[i][j]=A[i][j]+B[i][j];
          
      }
  }
  
 
 
   for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
          cout<<sum[i][j]<<" ";
          
      }
      cout<<endl;
  }
  
  
  return 0;
   
}