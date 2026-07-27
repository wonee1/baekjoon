class Solution {
    public int solution(int balls, int share) {
        // base case: 아무것도 안 뽑거나(0개), 모두 뽑는 경우(balls == share)는 1가지
        if (share == 0 || balls == share) {
            return 1;
        }
        
        // nCr = (n-1)Cr-1 + (n-1)Cr 성질 이용
        return solution(balls - 1, share - 1) + solution(balls - 1, share);
    }
}