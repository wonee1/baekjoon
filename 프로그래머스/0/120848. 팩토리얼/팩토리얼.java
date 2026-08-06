class Solution {
    public int solution(int n) {
        int i = 1;
        int num = 1;
        
        while (num * (i + 1) <= n) {
            i++;
            num *= i;
        }
        
        return i;
    }
}