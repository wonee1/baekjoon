import java.util.*;
import java.io.*; 

public class Main{
    
	public static void main(String[] args)throws IOException {
	    
	    Scanner sc = new Scanner(System.in); 
	    
	    int[] N = new int[10]; 
	    boolean[] check = new boolean[42];  
	    int count = 0 ; 
	    
	    for(int i=0;i<10;i++){
	        N[i] = sc.nextInt();
	        int mod = N[i]%42;
	        if(!check[mod]){//현재 체크 되지 않았으면 
	            check[mod] = true; 
	            count ++; 
	        }
	       
	    }
      
        System.out.println(count); 
		
	}
}
