
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
   
    int n, m; // n은 바구니 크기기, m은 바꾸는 횟수

    cin >> n >> m;
    int *arr = new int[n + 1]; //동적배열 

    // 바구니 초기화 하기
    for (int i = 1; i <= n; i++) // 1번 바구니부터 N 번까지 
    {
        arr[i] = i; // 공의 번호와 바구니 번호를 동일하게 만든다다
    }

    // 공 바꾸기
    for (int i = 0; i < m; i++)
    {
        int num1, num2;
        cin >> num1 >> num2;

        reverse(arr + num1, arr + num2 + 1); //reverse 함수를 사용하기 위해 algorithm을 include해주었다
        // 
    }

    // 바구니 출력하기
    for (int i = 1; i <= n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    delete[] arr;
    return 0;
    
}