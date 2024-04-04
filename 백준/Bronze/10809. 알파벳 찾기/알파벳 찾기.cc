#include <iostream>
#include <string>

using namespace std;


int main() {

	int cnt[26] = { 0 , };

	string s;
	cin >> s;//문자열 입력 

	for (char i = 'a'; i <= 'z'; i++) {
		cout << (int)s.find(i) << ' '; // 문자열 s에서 문자 i가 최초로 등장하는 인덱스 번호 반환 
	}


	return 0;
}