import java.util.*;
import java.io.*; 


public class Main
{
	public static void main(String[] args) throws IOException {
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt(); 
		 int result = 0; 
		 
		 for(int i=1; i<n;i++){
		     
		     if(n == check(i)){// check의 값이 n 이랑 같으면 check 값은 생성자  
		         result = i; 
		         break; 
		     }
		     
		 }
		
		System.out.println(result); 
		
	}
	
	public static int check(int now){
	    
	    int sum=now; 
	    
	    char text[] = String.valueOf(now).toCharArray(); // valueOf함수는 괄호안의 객체를 String 객체로 변환시킨다 
	   
	    for(int i=0; i<text.length;i++){
	        sum += Integer.parseInt(String.valueOf(text[i])); // 각 자리 수 더한 후 숫자에 더해준다 	    
	        
	    }
	    
	    
	    return sum; 
	    
	}

	
}