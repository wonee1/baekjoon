import java.util.*; 

class Solution {
    public int[] solution(int[] arr, int k) {
        
       List<Integer> list = new ArrayList<>(); 
        
       for(int i=0;i<arr.length;i++){
           
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
            
            if(list.size() == k){
                break;
            }
       }
    
        while(list.size() < k){
            list.add(-1);
        } //배열의 사이즈가 k보다 작으면 -1로 채우기 
        
        int[] answer = new int[k];
        
        for(int i = 0; i < k; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
        
    }
}