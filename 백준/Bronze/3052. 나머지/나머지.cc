# include <iostream>
using namespace std;
 
int main(){
    
    int arr[43]={0};
    int a, cnt;
    
    for(int i=0;i<10;i++){
        cin>>a;
        arr[a%42]++; //나머지인덱스 1 증가가
    }
    
    cnt=0;
    
    for(int i=0;i<43;i++){
        if(arr[i]!=0){
            cnt++;
        }
    }
    
    cout<<cnt;
    
    return 0;
    
}