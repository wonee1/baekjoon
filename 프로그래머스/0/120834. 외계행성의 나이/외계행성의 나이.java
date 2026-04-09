class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = String.valueOf(age);
        char[] str_ch = str.toCharArray();
        
        for(int i = 0; i < str.length(); i++){
            char c = (char)(str_ch[i] - '0' + 'a'); // 숫자 문자 정수로 변환 후 알파벳 변환 
            answer += c;
        }
        
        
        return answer;
    }
}