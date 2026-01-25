class Solution {
    public int solution(int a, int d, boolean[] included) {
        int num = 0;
        int answer=0; 
        
        for(int i=0; i<included.length;i++){
            
            if(included[i]==true){       
                num=a+i*d;
            }else{
                num=0;
            }
            
            answer+=num;             
            
        }
    
        return answer;
    }
}