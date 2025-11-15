import java.util.*;

public class Main{
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt(); // 테스트 케이스 받기 
	    
	    for(int i=0; i<T;i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	 
	       int res=1; //1번부터 시작 
	       
	       //a를 b번 곱하는 로직 
	       for(int j=0;j<b;j++){
	           res = (res *a)%10; //1의 자리가 곧 정답이다 
	       }
	  
	       if(res==0)System.out.println("10"); // res가 0일 때는 10으로 나누어떨어진 것 바로 답 10 
	       else System.out.println(res); // 그 외는 나머지가 정답 
	        
	    }
	
	    
	}
}