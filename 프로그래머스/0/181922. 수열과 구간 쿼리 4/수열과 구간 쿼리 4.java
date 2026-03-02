class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int q = 0; q < queries.length; q++) { // 쿼리 길이 만큼 반복 
            
            int s = queries[q][0]; //첫번째 요소 
            int e = queries[q][1]; //두번째 요소 
            int k = queries[q][2]; //세번째 요소 
            
            for (int i = s; i <= e; i++) { // i는 s와 e 사이에 있는 수 
                
                if (k == 0) { //k가 0이면 
                    if (i == 0) { // i가 0일 때 체크 
                        arr[i] += 1;
                    }
                } else {
                    if (i % k == 0) { //i가 k의 배수일 때의 경우 
                        arr[i] += 1; //그 요소에 +1 해준다 
                    }
                }
            }
        }
        
        return arr;
    }
}