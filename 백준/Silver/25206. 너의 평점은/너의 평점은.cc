#include <iostream>
using namespace std;
int main() {
	string majorName;//전공과목 이름 
	double avg = 0;//평균 
	float sumGrade = 0;
	double score[20];//과목평점
	float grade[20];//학점
	string input;//등급 
	for (int i = 0; i < 20; ++i)
	{
		cin >> majorName >> grade[i] >> input;//과목명, 학점, 등급 
		
		if (input == "A+") score[i] = 4.5;
		else if (input == "A0") score[i] = 4.0;
		else if (input == "B+") score[i] = 3.5;
		else if (input == "B0") score[i] = 3.0;
		else if (input == "C+") score[i] = 2.5;
		else if (input == "C0") score[i] = 2.0;
		else if (input == "D+") score[i] = 1.5;
		else if (input == "D0") score[i] = 1.0;
		else if (input == "F") score[i] = 0.0;
		else if (input == "P") { score[i] = 0.0; grade[i] = 0; }
		avg += (score[i] * grade[i]); //전공과목별 합
		sumGrade += grade[i];//학점의 총합 
	}
	avg = avg / sumGrade;//전공평점점
	cout << fixed;//소숫점 고정 
	cout.precision(6);//6의 자리까지지
	cout << avg;
	
}