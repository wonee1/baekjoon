class Solution {
    public int[][] solution(int n) {

        int[][] arr = new int[n][n];

        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while(num <= n * n){

            //오른쪽 
            for(int i = left; i <= right; i++){
                arr[top][i] = num++;
            }
            top++;

            //아래 
            for(int i = top; i <= bottom; i++){
                arr[i][right] = num++;
            }
            right--;

            //왼쪽 
            for(int i = right; i >= left; i--){
                arr[bottom][i] = num++;
            }
            bottom--;

            // 위 
            for(int i = bottom; i >= top; i--){
                arr[i][left] = num++;
            }
            left++;
        }

        return arr;
    }
}