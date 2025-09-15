import java.util.*;
import java.io.*; 

public class Main{
    
    static int[][] M = new int[10][10];         // 종이 상태 저장 배열
    static int[] S = {0,5,5,5,5,5};             // 남은 색종이 수 저장 배열
    static int result = Integer.MAX_VALUE;   // 최소 사용 개수 저장 
    
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		for(int i=0; i<10; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    for(int j=0; j<10; j++){
		        M[i][j] = Integer.parseInt(st.nextToken()); //종이 상태 입력 받기 
		    }
		}
		
		 backtracking(0,0); //좌표, 몇개 색종이 썼는지 
		
		 if (result ==Integer.MAX_VALUE){
		     System.out.println(-1); 
		 }else{
		     System.out.println(result); 
		 }
	
		
	}
	
	public static void backtracking(int xy, int useCnt){
        //정답처리
        
        if(xy==100){
            result = Math.min(result, useCnt);//사용한 개수를 업데이트 해준다 
            return; 
            
        }
	    int x = xy%10; 
	    int y = xy/10; 
	    
	    if(result<=useCnt)return; 
	    
	    if(M[y][x]==1){//현재 위치가 1이라면 
	    
	        for(int i=5; i>0;i--){
	             if(S[i]>0 && check(x,y,i)){
	                S[i]--; 
	                fill(x,y,i,0);
	                backtracking(xy+1, useCnt+1);// 사용한 개수 증가 후 다음좌표로 이동, 백트래킹킹
	                fill(x,y,i,1);
	                S[i]++;
	             
	             }
	        }
	        
	    }else{
	        backtracking(xy+1, useCnt); // 다음 좌표로 이동 후 백트래킹 
	    }
	   
	    
	    
	}
	
	public static void fill(int x, int y, int size,int num){
	    for(int i=y;i<y+size;i++){
	        for(int j=x; j<x+size;j++){
	            M[i][j] = num; 
	        }
	    }//색종이 사이즈에 맞게 숫자 넣기 
	   
	    
	}//색종이 붙였다가 떼는 과정 
	
	
	public static boolean check(int x, int y, int size){
	    
	    if(x+size>10||y+size>10)return false; //사이즈가 10이 넘어가면 바로 종료 
	    
	    for(int i=y;i<y+size;i++){
	        for(int j=x; j<x+size;j++){
	           if(M[i][j] != 1) return false; //1이 아니면 붙일 수 없음 
	        }
	    }
	    return true; //붙일 수 있음 
	    
	}//색종이를 사용했을 때 다 1이 들어가는 지확인 


}