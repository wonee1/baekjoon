class Solution {
    public String[] solution(String[] picture, int k) {

        String[] answer = new String[picture.length * k];
        int idx = 0;

        for(String row : picture){

            StringBuilder sb = new StringBuilder();

            // 가로 확대
            for(char c : row.toCharArray()){
                for(int i = 0; i < k; i++){
                    sb.append(c); //문자 하나씩 k번 반복 (가로)
                } 
            }

            String expanded = sb.toString(); // 확장한 

            //세로 확대
            for(int i = 0; i < k; i++){
                answer[idx++] = expanded;
            }
        }

        return answer;
    }
}