import java.util.*; 

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = emergency.clone(); 
        Arrays.sort(sorted); 
        
        //큰 값이 1등이니까 뒤에서 부터 등수를 부여한다 
        Map<Integer, Integer> map = new HashMap<>(); 
        
        
        int rank = 1; 
        for(int i=sorted.length-1; i>=0;i--){
            map.put(sorted[i], rank++); 
            
        }
        
        for(int i=0 ; i<emergency.length; i++){
            answer[i] = map.get(emergency[i]); //요소대로 등수 가져와서 배열에 담기 
        }
    
        
        return answer;
    }
}