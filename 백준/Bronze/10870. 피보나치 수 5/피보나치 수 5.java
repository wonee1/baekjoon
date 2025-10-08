import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws IOException {
	    
	   int p[] = new int[21]; 
	   p[0] = 0; 
	   p[1] = 1;
	   
	   for(int i=2; i<=20; i++){
	       p[i] = p[i-1]+p[i-2]; 
	       
	    }// 피보나치 수열 합이 담긴 배열 
	   
	   Scanner sc = new Scanner(System.in);
	   int n =sc.nextInt();
	   System.out.println(p[n]);
	
	   
	}
}