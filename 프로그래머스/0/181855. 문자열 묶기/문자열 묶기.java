import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        Map<Integer, Integer> map = new HashMap<>(); 
        
        for(String str : strArr){
            int len = str.length(); //str 길이 
            map.put(len, map.getOrDefault(len, 0) + 1); //len이라는 key가 있으면 그 값 가져오기  key가 없으면 0 반환     
        }
        
        int max = 0;
        
        for(int count : map.values()){ //개수 값 가져오기 
            max = (int)Math.max(max, count); // 더 큰 값 반환 
        }
        
        return max;
    }
}