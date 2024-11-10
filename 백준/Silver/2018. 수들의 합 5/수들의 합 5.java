/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    Scanner sc = new Scanner(System.in);
	    int N =sc.nextInt();
	    int start_index=1;
	    int end_index=1;
	    int count=1;
	    int sum=1; 
	    while(end_index!=N){
	        if(sum==N){
	            count++;// 일치하면 카운트 증가
	            end_index++;
	            sum += end_index;
	        }else if(sum>N){
	            sum -=start_index;
	            start_index++;
	        }else{//sum이 n보다 작을 때 
	            end_index++;
	            sum += end_index;
	        }
	        
	    }
	    
	    System.out.println(count);
	    
	}
}


