class Solution {
    public int solution(int a, int b) {

        // 둘 다 홀수
        if(a % 2 == 1 && b % 2 == 1){
            return a * a + b * b;
        }
        
        // 하나만 홀수
        else if(a % 2 == 1 || b % 2 == 1){
            return 2 * (a + b);
        }
        
        // 둘 다 짝수
        else{
            return Math.abs(a - b);
        }
    }
    
}