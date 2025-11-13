import java.util.*;
import java.io.*;


public class Main{
    
	public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt(); 
	    int cnt = 1; 
	    int x = 1;
	    int y = 1; // 분자를 x, 분모를 y라고 생각하기 
	    //처음에는 무조건 오른쪽으로 이동한다 
	    int dir = -1; // 분수 증가 방향  
	    while(cnt<N){
	        if(x==1 && dir == -1 ){
	            y++;
	            dir = 1; // 방향을 바꿔준다  
	        }else if(y==1 && dir ==1){
                x++;
                dir = -1; 
	        }else if(dir==1){ // 내려오고 있는 것 따라서 분자는 증가 분모는 감소하기 
	            x++;
	            y--; 
	            
	        }else{//dir -1 일 경우엔 반대로  
	            x--;
	            y++;
	        }
	        
	        cnt++;
	        
	    }
	    
	    System.out.println(x +"/"+ y); 
	 
	}
}