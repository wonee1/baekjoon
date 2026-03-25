class Solution {
    public int[][] solution(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        // 행 > 열
        if(rows > cols){
            int[][] answer = new int[rows][rows];

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    answer[i][j] = arr[i][j]; //자동으로 0으로 채워진다 
                }
            }

            return answer;
        }else if(cols > rows){ //열 > 행 
            int[][] answer = new int[cols][cols];

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    answer[i][j] = arr[i][j];
                }
            }

            return answer;
        }

        //이미 정사각형
        else{
            return arr;
        }
    }
}