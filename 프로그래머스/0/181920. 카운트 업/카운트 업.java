import java.util.*; 

class Solution {
    public int[] solution(int start_num, int end_num) {
        
        ArrayList<Integer> list = new ArrayList<>();//배열 리스트 선언 
        
        for(int i=start_num; i<=end_num; i++ ){ // 배열 리스트에 추가 
            list.add(i);
        }
        
        int[] answer = new int[list.size()]; // 리스트 사이즈만큼 배열 선언함 
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i); 
        }
        
        return answer;
    }
}