class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0; 
        
        //자릿수 합 구하기 
        for(int i =0 ; i<number.length(); i++){
            char c = number.charAt(i);
            sum+=c-'0'; // char 숫자 바꿀 땐 문자열 0 빼기     
        }
    
        answer =sum%9;
    
        return answer;
    }
}