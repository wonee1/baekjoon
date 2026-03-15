class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);

            if(c == alp.charAt(0)){
                answer += Character.toUpperCase(c);
            }else{
                answer += c;
            }
        }
        
        return answer;
    }
}