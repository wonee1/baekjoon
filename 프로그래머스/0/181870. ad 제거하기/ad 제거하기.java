import java.util.*; 

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> list = new ArrayList<>(); 
        
        for(String str : strArr){
            
          list.add(str);  

          if(str.contains("ad")){
               list.remove(str); 
                  
          }  
            
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0; i<list.size(); i++){
            
            answer[i]=list.get(i); 
            
        }
        
        return answer;
    
    }
}