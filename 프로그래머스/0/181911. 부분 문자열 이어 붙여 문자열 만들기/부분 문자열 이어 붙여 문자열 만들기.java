import java.util.*; 

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
     
        List<String> list = new ArrayList<>(); 
        
        for(int i=0; i<my_strings.length; i++){
            
            String str =my_strings[i]; 
            int s= parts[i][0];
            int e= parts[i][1]; 
            
            list.add(str.substring(s,e+1)); 
        
        } 
        
        //리스트에 저장된 문자열 합치기 
        String answer = ""; 
        for(String s : list){
            answer += s; 
        }            
        
        return answer; 
                
    }
}