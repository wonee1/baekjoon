class Solution {
    public int[] solution(int n) {
        
        
        int[][] triangle = new int[n][n];
        int v = 1; //채워넣을 숫자 
        int x = 0; 
        int y = 0; 
        //숫자를 채운 현재 위치를 0,0으로 설정 
        
       while(true){  
           
        //아래로 이동
        while(true){
            triangle[y][x] = v++; 
            if (y+1 == n || triangle[y+1][x]!=0) break;
            y+=1; 
        }
        if(x+1 == n || triangle[y][x+1]!=0) break; // 오른쪽 칸이 막혀있는지 확인 
        x+=1; 
        
        
        //오른쪽으로 이동
        while(true){
            triangle[y][x] = v++;
            if(x+1 == n || triangle[y][x+1]!=0) break; 
            x+=1; 
        }
        if(triangle[y-1][x-1]!=0)break; //대각선 칸이 막혀있는지 확인 
        x-=1;
        y-=1;
        
        //대각선으로 이동하면서 숫자 채우기 
        while(true){
            triangle[y][x] = v++;
            if(triangle[y-1][x-1]!=0) break; 
            x -=1; 
            y -=1; 
        }
        if(y+1 == n || triangle[y+1][x] != 0) break; //아래로 한칸 내리기 전에 확인 
        y+=1; 
        
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