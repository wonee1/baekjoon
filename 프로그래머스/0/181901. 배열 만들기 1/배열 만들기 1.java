import java.util.*; 

class Solution {
    public int[] solution(int n, int k) {
        
        List<Integer> list = new ArrayList<>(); // 리스트 배열 선언 
        
        
        for(int i=1;i<=n;i++){
            if(k*i<=n){ //k의 배수 n 이하 
                list.add(k*i);
            }
        
        }
        
        int[] answer = new int[list.size()];//리스트 사이즈만큼 배열 선언 
        
        for(int i=0; i<list.size(); i++){
            
            answer[i]=list.get(i);
            
        }
        
        return answer;

    }
}