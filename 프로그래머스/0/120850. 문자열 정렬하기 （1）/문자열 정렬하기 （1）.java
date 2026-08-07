import java.util.*; 

class Solution {
    public int[] solution(String my_string) {
        //스트림으로 풀 경우 
    return my_string.replaceAll("[^0-9]", "") // 숫자 문자열 만들기
                    .chars()                   // 각 글자를 스트림으로 만듦
                    .map(ch -> ch - '0')       // 문자 '1'을 숫자 1로 변환
                    .sorted()                  // 오름차순 정렬
                    .toArray();                // int[] 배열로 최종 반환
    }
}