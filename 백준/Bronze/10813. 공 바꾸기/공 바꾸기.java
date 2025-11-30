import java.io.*;
import java.util.*; 


public class Main{
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N+1]; // 0~N 까지 
		
		for(int i=1;i<=N; i++){
		    A[i] = i; // 초기화 
		}
		
		for(int i=0; i<M;i++){
		    int S= sc.nextInt(); 
		    int E = sc.nextInt(); 
		    int temp = A[S];
		    A[S] = A[E];
		    A[E] = temp; 
		    
		}
		
		
		for(int i=1;i<=N; i++){
		    System.out.print(A[i]+" ");
		}
	
		
	}
}