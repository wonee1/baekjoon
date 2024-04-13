#include <iostream>
#include <string>
using namespace std;
int main() {
    string arr[5]; // string 배열 
    for(int i = 0; i < 5; i++) cin >> arr[i]; //5개의 문자열을 입력받는다다
    
    for (int i = 0; i < 15; i++){
        for (int j = 0; j < 5; j++) {
            if (i<arr[j].length()) cout << arr[j][i];
            
        }
    }
}