import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0; 
        int[] arr= {a,b,c,d}; 
        Arrays.sort(arr); // 일단 배열 정렬한 다음에 진행 
        
        Map<Integer, Integer> map = new HashMap<>();
        
        //빈도수 세기 
        map.put(a, map.getOrDefault(a,0) + 1);  // a가 이미 map에 있으면 가져오고 없으면 디폴트 값으로 0 
        map.put(b, map.getOrDefault(b,0) + 1); 
        map.put(c, map.getOrDefault(c,0) + 1); 
        map.put(d, map.getOrDefault(d,0) + 1); 
        
        if(map.size() ==1 ) return a * 1111; //숫자 4개가 모두 같을 때 
        if(map.size() ==2 ) { // 사이즈가 2일 때 
            
            if(map.containsValue(3)){ // 3번 나온 숫자가 있는 경우  
               for(Map.Entry<Integer, Integer> el : map.entrySet()){ //entrySet은 key와 Value를 한쌍으로 묶은 집합 반환 
                    answer += el.getKey() * (el.getValue() == 3 ? 10 : 1);//세 번 나온 숫자면 10, 아니면 1 
               }
                    return answer * answer; // 제곱 
                   
            }
            
            int x =(a+b+c+d-2*a)/2;// 전체합으로 다른 숫자 구하기 (2개씩 같은 숫자일때)
            return (a+x) * Math.abs(a-x); //abs는 절대값 
            
        }
    
        if(map.size() ==3){
            answer =1; 
            
            for(Map.Entry<Integer, Integer> el : map.entrySet()){
                if (el.getValue() != 2) answer *= el.getKey();
            }
            
            return answer;
            
        }
     
            return Math.min(Math.min(a, b), Math.min(c, d)); // 숫자가 다 다르면 가장 작은 숫자가 점수로 체킹됨            
    }        
}