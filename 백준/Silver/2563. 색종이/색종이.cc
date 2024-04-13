#include <iostream>
using namespace std;
int main() {
  
   int arr[101][101]={0};
   int x,y; 
   int N;
   int area=0;//영역 넓이 
   
   cin>>N;//색종이 수 
   
   for(int i=0;i<N;i++){
       cin>>x>>y; 
       for(int j=x;j<x+10;j++){
           for(int k=y;k<y+10;k++)
           arr[j][k]=1;
       }
   }//2차원 배열이 색칠된 부분을 1로 체크 
   
   for(int i=1;i<101;i++){
       for(int j=1;j<101;j++){
           if(arr[i][j]==1)area++;
       }
   }
   
   cout<<area++;
   return 0;
}