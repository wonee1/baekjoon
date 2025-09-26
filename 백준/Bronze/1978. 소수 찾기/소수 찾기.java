import java.util.*;
import java.io.*;
 
public class Main{
	public static void main(String[] args)throws IOException {	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0; 
		 
		 for(int i=0; i<N;i++){
		     int temp = sc.nextInt();
		     boolean isPrimeNumber =true; 
		     
		     if(temp ==1){ // 1제외 
		         isPrimeNumber = false;
		     }
		     else{
		  
		         for(int j=2; j<temp; j++){
		             //약수가 나외에 없는 수가 소수  
		             if(temp%j==0){
		                 isPrimeNumber = false;
		                 break; 
		             }
		             
		         }
		         
		     }
		     
		     if(isPrimeNumber){
		         cnt++; 
		     }
		 }
	     System.out.println(cnt);
	 }
}


