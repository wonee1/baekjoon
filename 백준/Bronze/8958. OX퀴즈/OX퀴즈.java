import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] args)throws IOException {
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine()); 
	    
	    for(int i=0; i<T;i++){
	        char[] text = br.readLine().toCharArray();
	        int sum = 0; // 합계 
	        int cnt = 0; // 점수 값 
	    
	        for(int j=0; j<text.length; j++){
	            
	            
	            if(text[j]=='O'){
	                cnt++; 
	                sum+=cnt; 
	                
	            }
	            else if(text[j]=='X'){
	                cnt = 0; 
	            }
	            
	            
	        }
	        System.out.println(sum); 
	    }
	  
	}

}