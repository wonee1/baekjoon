import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    char[] text = sc.next().toCharArray(); // 한글자씩 입력 받기 
		int N = sc.nextInt(); // N 전체입력 
	    int A[] = new int[text.length]; // 알파벳 수 표시 (Z면 35를 넣기 )  
		
		for(int i=0; i<text.length;i++){
		    
		    if(47<text[i] && text[i] < 58){//숫자 0하고 9 사이 (아스키코드)
		        A[i] = Integer.parseInt(String.valueOf(text[i])); 
		        
		    }else{//문자인 경우엔 
		    
		        A[i] = text[i] - 55; //A는 아스키코드가 65 따라서 A가 10이려면 55를 빼줘야함함
		        
		    }  
		    
		}
		
		
	    int result = A[A.length-1];//제일 앞에 수는 진수 상관없이 더해준다  
	    int temp = N; 
	    for(int i=A.length-2; i>=0;i--){
	        result += A[i]*temp; //결과값 누적하기 
	        temp = temp* N; //자릿수 한칸씩 이동 
	    }
		
		System.out.println(result);
		
	}
}