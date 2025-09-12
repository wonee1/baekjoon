import java.io.*;
import java.util.*; 


public class Main
{   
    static int N; 
    static int[] A; 
    static int cnt = 0 ; 
        

	public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt(); // N개를 서로 공격할 수 없게 놓는 경우의 수 

        A = new int[N]; 
        
        backtraking(0);
        
        System.out.println(cnt);
        
        
	}
	
	public static void backtraking(int row){ // 0 행부터 시작 
	
	    if(row == N) { // 퀸 4개를 모두 배치한 경우 
	        cnt++; // 정답 출력 
	        return; 
	        
	    } 
	    
	    for(int i=0; i<N; i++){// 모든 경우의 수 탐색 
	    
	        A[row] = i ; // 퀸 배치 
	        if(check(row)){// 가지치기 유효성 검사 
	            backtraking(row+1); 
	        }
	        
	    }
	   
	}
	
	private static boolean check(int row){
	    for(int i=0; i<row ; i ++){
	        if(A[i]==A[row])return false; //직선 공격 방어 
	        if(Math.abs(row-i)==Math.abs(A[row]-A[i]))return false;// 대각선 공격 방어 (행,열 차이값 비교) 
	   
	    }
	    
	    return true; 
	    
	}

}