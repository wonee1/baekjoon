import java.util.*;
import java.io.*; 

public class Main{
    
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int N = Integer.parseInt(st.nextToken()); // 카드 개수 
		int M = Integer.parseInt(st.nextToken()); // 카드 합 
		st = new StringTokenizer(br.readLine()); 
		int[] A = new int[N]; 
		
		for(int i=0; i<N;i++){
		   A[i] = Integer.parseInt(st.nextToken());
	    
		}
		
		int Max =-1; 
		
		for(int i=0; i<N;i++){
		    for(int j=i+1;j<N;j++){
		        for(int k=j+1;k<N; k++){
		            int temp = A[i] + A[j] + A[k]; 
		            if(Max<temp && M >= temp){
		                Max=temp;
		            }
		        }
		    }
		    
		} 
		
		System.out.println(Max); 
	
	}
}
