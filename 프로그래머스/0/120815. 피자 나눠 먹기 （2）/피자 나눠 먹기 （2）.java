class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = n * 6 / gcd (n,6);  // 60/2 = 30
        
        
        return answer / 6 ; //30/6=5 
        
        
        //사람수와 피자수의 최소 공배수 만큼이 결과  
        
    }

	public int gcd(int a, int b) {
		if(b == 0) return a; 
		else return gcd(b, a%b);
	}
}