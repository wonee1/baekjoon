import java.util.*;
import java.io.*; 


public class Main
{
	public static void main(String[] args) throws IOException {
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt(); 
	     boolean fix = true; 
	     
		 
		 if(n==1){
		  
		  for(int i=2; i<9;i++){
		      int temp = sc.nextInt(); 
		      if(temp != i) {
		          fix = false; 
		          System.out.println("mixed");
		          break; 
		      }//숫자 순서대로 증가안할 경우는 제외해줘야함 
		      
		  }
		  if(fix==true){
		      System.out.println("ascending"); 
		  }
		  
		     
		 }
		 else if(n==8){
		     
		  for(int i=7; i>0;i--){
		      int temp = sc.nextInt(); 
		      if(temp!=i){
		           fix = false; 
		           System.out.println("mixed");
		           break; 
		      }//숫자 순서대로 감소안할 경우는 제외해줘야함
		      
		  }
		  
		  if(fix==true){
		      System.out.println("descending"); 
		  }
		     
		 }
		 
		 else{ // 1 이나 8로 시작안하면 mixed 바로 출력 
		     System.out.println("mixed"); 
		 }
		
		
	}
	
	
}