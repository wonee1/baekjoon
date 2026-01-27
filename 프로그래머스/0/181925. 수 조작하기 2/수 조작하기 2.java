class Solution {
    public String solution(int[] numLog) {

        StringBuilder sb = new StringBuilder(); // 문자열을 붙일 때 사용 

        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1]; // 값 차이 

            if (diff == 1) {
                sb.append("w"); // append 사용해서 문자열이어 붙이기   
            } else if (diff == -1) {
                sb.append("s");
            } else if (diff == 10) {
                sb.append("d");
            } else if (diff == -10) {
                sb.append("a");
            }
        }

        return sb.toString();
    }
}
