#include <iostream>
#include <string>
using namespace std;

int main() {
    string line;

    // 입력이 주어질 때까지 반복
    while (getline(cin, line)) {
        // 해당 줄에 있는 문자열 출력
        cout << line << endl;
    }

    return 0;
}

