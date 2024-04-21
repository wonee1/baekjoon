#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {

	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);


	int N; 
	cin >> N;

	vector<int> A(N, 0); // N개만큼 0으로 초기화

	for (int i = 0; i < N; i++) {
		cin >> A[i];
	}

	sort(A.begin(), A.end());

	int Result = 0;

	for (int k = 0; k < N; k++) {
		long find = A[k];
		int i = 0;
		int j = N - 1;

		while (i < j) {
			if (A[i] + A[j] == find) {
				if (i != k && j != k) {
					Result++;
					break;
				}
				else if (i == k) {// k일 경우 포인터 변경
					i++;
				}
				else if (j == k) {// k일 경우 포인터 변경 
					j--;
				}
			}
			else if (A[i] + A[j] < find) {
				i++;
			}
			else {
				j--;
			}
			
		}//투포인터 알고리즘

	}
	cout << Result << endl;

}