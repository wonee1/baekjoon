import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] args)throws IOException {
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    char[] text = br.readLine().toCharArray(); // 배열로 받기 
	    
	    for(int i=0; i<26; i++){
	        int temp = -1; 
	        
	        for(int j=0; j<text.length;j++){
	            if(text[j]-'a'==i){//알파벳과 현재 text 자리가 매핑됨
	                temp = j; //j는 텍스트 인덱스 
	                break; //처음 등장한 위치를 찾는 것이기 때문에 찾으면 바로 중단 
	            }
	            
	        }
	        
	       System.out.print(temp+" "); 
	       
	    }
	  
	}
	
}