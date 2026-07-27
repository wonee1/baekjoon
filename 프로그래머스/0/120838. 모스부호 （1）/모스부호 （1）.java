import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();

        Map<String, Character> map = new HashMap<>(); 
        
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
        char ch = 'a';
        for (int i = 0; i < str.length; i++) {           
            map.put(str[i], ch++); 
        }
        
        //입력받은 모스부호를 공백(" ") 기준으로 나누기
        String[] morse = letter.split(" ");
        
        // 각 모스부호를 알파벳으로 변환해서 붙이기
        
        for(String m  : morse){
            
            answer.append(map.get(m));
            
        }
        
        
        return answer.toString();
    }
}