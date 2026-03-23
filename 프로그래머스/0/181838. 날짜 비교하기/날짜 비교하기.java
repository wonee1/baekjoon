class Solution {
    public int solution(int[] date1, int[] date2) {

        int d1 = date1[0] * 10000 + date1[1] * 100 + date1[2];
        int d2 = date2[0] * 10000 + date2[1] * 100 + date2[2]; 
        //숫자로 바꿔서 계산하기 

        return d1 < d2 ? 1 : 0; 
    }
}