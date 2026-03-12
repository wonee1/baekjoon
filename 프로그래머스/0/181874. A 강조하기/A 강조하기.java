class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            char str = myString.charAt(i);
            
            if(str == 'a' || str == 'A'){
                answer += 'A';
            }else{
                answer += Character.toLowerCase(str);
            }
        }
        
        return answer;
    }
}