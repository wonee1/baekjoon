import java.io.*;
import java.util.*; 


public class Main
{   
    static int N, M;
    static boolean[] V; //숫자 사용 여부 저장 배열 
    static int[] S;  // 수열을 담을 배열 
    
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
		S= new int[N];
		V= new boolean[N];
	    
	    backtracking(0); // 백트래킹 실행 (현재 포함된 수열 개수)
		
	}
	
	//백 트래킹 상세 구현 
    public static void backtracking(int length){
		    
		   if(length==M){ // 정답인지 확인해서 return 
		       printArray();
		       return;  // 정답 구현 
		   }                      
		                        
		   for(int i=0;i<N;i++){ // 탐색 기준 설정 
		       if(!V[i]){
		           V[i]=true; 
		           S[length]=i; 
		           backtracking(length+1);  // 재귀 호출 → 끝나면 돌아옴
		           V[i]=false; //다음 분기에서 사용할 수 있게 원상 복구  
		       }
		   }
		    
		}
		
	public static void printArray(){
	    
	    for(int i=0; i<M;i++){
	        System.out.print(S[i]+1+" "); 
	    }
	    
	    
	}	
	
}