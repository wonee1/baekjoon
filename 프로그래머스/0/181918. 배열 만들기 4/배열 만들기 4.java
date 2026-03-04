import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> stk = new ArrayList<>(); // 스택 배열리스트 선언 
        int i = 0;
        
        while (i < arr.length) {
            
            if (stk.isEmpty()) { // stk가 빈 배열일 때 
                stk.add(arr[i]); // arr[i] 원소 추가하기 
                i++; // i 증가 
            }
            
            else if (stk.get(stk.size() - 1) < arr[i]) {  // stk 마지막 원소가 arr[i] 보다 작을 때  
                stk.add(arr[i]);///arr[i] 를 stk 뒤에 추가 
                i++;
            }
            
            else {
                stk.remove(stk.size() - 1); //stk 마지막 원소제거 
            }
        }
        

        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);
        }
        
        return answer;
    }
}
