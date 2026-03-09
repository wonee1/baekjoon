class Solution {
    public int solution(int[] num_list) {
    
        int answer = 0;
        boolean isTrue = false; 
        
        for(int i=0; i<num_list.length;i++){
            
            if(num_list[i]<0&& !isTrue){
                answer = i; 
                isTrue= true; 
                return answer; 
            }
        
        }
        
        return -1;
    }
}