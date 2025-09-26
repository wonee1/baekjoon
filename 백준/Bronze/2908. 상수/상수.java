import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] args)throws IOException {
		
        Scanner sc= new Scanner(System.in);
        char[] A = sc.next().toCharArray(); 
        char[] B = sc.next().toCharArray(); 
        
        
        //수 뒤집기 
        char temp = A[0];
        A[0]=A[2];
        A[2]=temp; 
        

	    temp = B[0];
        B[0]=B[2];
        B[2]=temp; 
        
	    
	    int reverseA = Integer.parseInt(new String(A)); 
	    int reverseB = Integer.parseInt(new String(B)); 
	  
        System.out.println(Math.max(reverseA, reverseB));
	    
	 }
	
}
