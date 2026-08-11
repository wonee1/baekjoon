class Solution {
    
    private static final int[] dx = {0,1,-1};
    private static final int[] dy = {1,0,-1};  // 변화량 사용 아래->오른쪽->왼쪽 위 순서 
    
    
    public int[] solution(int n) {
        
        
        int[][] triangle = new int[n][n];
        int v = 1; //채워넣을 숫자 
        int x = 0;                                              
        int y = 0; 
        //숫자를 채운 현재 위치를 0,0으로 설정 
        int d = 0; 
                
       while(true){  
           triangle[y][x] = v++; 
           int nx = x + dx[d]; 
           int ny = y + dy[d]; 
           if(nx == n || ny ==n || nx==-1 || ny==-1 ||triangle[ny][nx]!=0){
               d = (d+1)%3; 
               nx = x+dx[d];
               ny = y+dy[d]; 
               if(nx == n || ny ==n || nx==-1 || ny==-1 ||triangle[ny][nx]!=0) break; 
           
            }
               x = nx; 
               y = ny; 
        }

        
        int[] result = new int[v-1]; 
        int index = 0;
        for (int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                result[index++]=triangle[i][j]; //행 인덱스 개수+1 만큼 열에 숫자가 있음 
            }     
        }
        
        return result; 
    }
}