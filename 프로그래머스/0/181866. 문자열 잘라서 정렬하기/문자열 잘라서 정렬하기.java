import java.util.*; 

class Solution {
    public String[] solution(String myString) {
        
        String[] answer = myString.split("x");
        
        Arrays.sort(answer);
        
        List<String> list = new ArrayList<>();
        
        for(String str : answer){
            if(!str.equals("")){//빈배열이 아닐 때만 추가하기 
                list.add(str);
            }
        }
        
        String[] result = new String[list.size()];
        
        for(int i=0; i<list.size();i++){
        
            result[i]=list.get(i); 
        }
        
        return result; 
        
    }
}