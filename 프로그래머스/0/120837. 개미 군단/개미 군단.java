class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        while (hp > 0) {
            if (hp >= 5) {
                answer += hp / 5;
                hp %= 5; // 5로 나눈 나머지 체력만 남김
            } else if (hp >= 3) {
                answer += hp / 3;
                hp %= 3; // 3으로 나눈 나머지 체력만 남김
            } else {
                answer += hp; // 남은 1짜리 체력만큼 일개미 추가
                hp = 0;       // 반복 종료
            }
        }
        
        return answer;
    }
}