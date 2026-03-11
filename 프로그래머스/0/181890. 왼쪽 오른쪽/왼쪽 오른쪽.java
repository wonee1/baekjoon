class Solution {
    public String[] solution(String[] str_list) {

        for(int i = 0; i < str_list.length; i++) {
            String str = str_list[i];

            // l 발견하면 왼쪽 부분
            if(str.equals("l")) {
                String[] result = new String[i];

                for(int j = 0; j < i; j++) {
                    result[j] = str_list[j];
                }

                return result;
            }

            // r 발견하면 오른쪽 부분
            if(str.equals("r")) {
                String[] result = new String[str_list.length - i - 1];

                int idx = 0;
                for(int k = i + 1; k < str_list.length; k++) {
                    result[idx++] = str_list[k];
                }

                return result;
            }
        }

        // 둘 다 없으면 빈 배열
        return new String[0];
    }
}