class Solution {
    public String solution(String my_string, int[] index_list) {
        
        StringBuilder sb = new StringBuilder(); // String Builder로 문자열 붙이기 
        for (int index : index_list) { // index_list 부터 순회하기 
            sb.append(my_string.charAt(index)); // index 값에 해당하는 문자열 인덱스 문자를 붙이기 
        }
        
        return sb.toString(); // String으로 변환해서 출력 
    }
}