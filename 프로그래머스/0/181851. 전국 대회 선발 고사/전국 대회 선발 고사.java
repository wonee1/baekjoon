import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        List<int[]> list = new ArrayList<>();
        
        //참석 가능한 학생만 저장
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) {//true일 경우 
                list.add(new int[]{rank[i], i}); // 등수와 인덱스를 저장 
            }
        }
        
        //rank 기준 정렬 (등수 낮을수록 앞에 위치하기 )
        Collections.sort(list, (a, b) -> a[0] - b[0]); //오름차순 정렬 
        
        // 3. 상위 3명 추출
        int a = list.get(0)[1];
        int b = list.get(1)[1];
        int c = list.get(2)[1];
        
        // 4. 결과 반환
        return 10000 * a + 100 * b + c;
    }
}