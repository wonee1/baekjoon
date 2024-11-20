import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args)throws IOException {
		
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int T = Integer.parseInt(br.readLine());// 테스트 케이스 입력받기 
	     String[] name=new String[T]; 
	     
	     for(int i=0;i<T;i++){
	         String str =br.readLine(); //  문자열 입력받기
	         name[i]=str.substring(0,1)+str.substring(str.length()-1,str.length());
	     }
	
	    br.close();
	    
	    for(int i=0;i<T;i++) {
			System.out.println(name[i]);	
		}
	
	  
		
	}
}