import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> list = new ArrayList<>(); // 일단은 배열리스트로 받기  
        
        for (String str : intStrs) { // 
            
            // s부터 길이 l만큼 자르기 
            String sub = str.substring(s, s + l); 
            
            // 정수 변환하기 
            int num = Integer.parseInt(sub);
            
            // k보다 크면 리스트에 저장
            if (num > k) {
                list.add(num);
            }
        }
        
        // 리스트 배열로 변환하기 
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}