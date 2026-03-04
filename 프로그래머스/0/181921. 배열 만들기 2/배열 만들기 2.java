import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> list = new ArrayList<>(); // 배열리스트로  
        
        for (int i = l; i <= r; i++) {
            
            String str = String.valueOf(i); // 일단은 문자열로 바꾸기 
            boolean isValid = true; 
    
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                
                if (c != '0' && c != '5') { // 0이나 5가 포함 안되어있으면 빼기 
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                list.add(i); // 리스트에 추가 
            }
            
        }
        
        // 만약 조건 만족하는 게 하나도 없으면 -1 반환
        if (list.size() == 0) {
            return new int[]{-1}; 
        }
        
        // List 배열 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);// 리스트 값 1개씩 꺼내서 배열에 넣기 
        }
        
        return answer;
    }
}