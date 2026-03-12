class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1; 
            
        for(int i=0;i<num_list.length;i++){
            
            if(num_list.length>=11){
                answer += num_list[i];
                
            }else if(num_list.length<=10){
                 sum *= num_list[i]; 
            }
            
        }
      
        return answer > sum ? answer : sum; 
    }
}