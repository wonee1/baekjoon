class Solution {
    public int[] solution(String my_string) {
       
       int[] answer = new int[52]; 
        
        // 알파벳 인덱스 문자 변환 
        for(int i=0; i<my_string.length(); i++){
            
            char c = my_string.charAt(i); //문자 하나씩 받기 
        
            if(c>='A' && c<='Z'){
                answer[c-'A']++; // 해당 대문자 알파벳 인덱스 개수 증가 
            }else if(c>='a' && c<='z'){
                answer[26 + c - 'a']++; // 해당 소문자 알파벳 인덱스 개수 감소 
            }
        }
     return answer;
        
    }
}