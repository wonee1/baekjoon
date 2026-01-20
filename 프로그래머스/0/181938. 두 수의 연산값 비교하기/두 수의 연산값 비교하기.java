class Solution {
    public int solution(int a, int b) {
        
        String sa = String.valueOf(a); 
        String sb = String.valueOf(b);
        
        
        int ab1 = Integer.parseInt(sa+sb);
        int ab2 = 2*a*b; 
        
        
        if(ab1>ab2){
            return ab1; 
        }else if(ab1<ab2){
            return ab2; 
        }else{
            return ab1; 
        }
    
        
    }
}