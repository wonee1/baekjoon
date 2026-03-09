class Solution {
    public String solution(String my_string, int[] indices) {
        
        boolean[] remove = new boolean[my_string.length()];// 지울 변수는 true로 표시하기 
        
        // 지울 위치 표시
        for (int idx : indices) {
            remove[idx] = true; 
        }
        
        String answer = "";
        
        // 표시 안 된 문자만 이어붙이기
        for (int i = 0; i < my_string.length(); i++) {
            if (!remove[i]) {//true가 아니면 이어붙이기 
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}