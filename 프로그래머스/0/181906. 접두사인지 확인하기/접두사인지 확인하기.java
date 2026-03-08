import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        
        List<String> list = new ArrayList<>(); 
        
        for(int i=0 ; i<my_string.length(); i++) {
         list.add(my_string.substring(0,i));// 접두사만 잘라서 넣기 
        }    
        
        for(String str : list){
               if(str.equals(is_prefix)){
                    return 1; 
                }
        }
        
        return 0;
    }
}