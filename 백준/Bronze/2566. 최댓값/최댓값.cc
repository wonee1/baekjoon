#include <iostream>
using namespace std;
int main() {
    
    int arr[9][9];
    
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            cin>>arr[i][j];
        }
    }//2차원 행렬 입력값 받기 
    
    int max=0;
    int maxi=0;
    int maxj=0;
    
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            
            if(arr[i][j]>=max){
                max=arr[i][j]; 
                maxi=i;
                maxj=j;
                
            } 
        }
    }

    cout<<max<<endl;
    cout<<maxi+1<<" "<<maxj+1;
    


}
