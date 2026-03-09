import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        int first = -1;
        int last = -1;
        
        // 첫 2와 마지막 2 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        
        // 2가 없는 경우
        if (first == -1) {
            return new int[]{-1};
        }
        
        // 구간을 List에 담기
        for (int i = first; i <= last; i++) {
            list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}