import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        
        // 접미사들을 저장할 리스트
        List<String> list = new ArrayList<>();
        
        // 모든 접미사 생성
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        
        // 접미사와 일치하는지 검사
        for (String str : list) {
            if (str.equals(is_suffix)) {
                return 1;  // 하나라도 같으면 바로 1 반환
            }
        }
        
        return 0;  // 끝까지 없으면 0
    }
}