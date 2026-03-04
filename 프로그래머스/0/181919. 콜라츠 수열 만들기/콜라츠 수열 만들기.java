import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> list = new ArrayList<>(); 
        
         while (n != 1) {
            list.add(n);
            
            if (n % 2 == 0) { // 짝수
                n = n / 2;
            } else { // 홀수 
                n = 3 * n + 1;
            }
        }
        
        list.add(1); // 마지막에 1 추가 
    
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
        
    }
}