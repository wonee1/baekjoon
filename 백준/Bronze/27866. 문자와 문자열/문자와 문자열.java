import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args)throws IOException {
		
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     String s = br.readLine(); // 단어 s 입력받기 
	     int i = Integer.parseInt(br.readLine()); // 정수 i 
	           
	     char c= s.charAt(i-1);
	     System.out.println(c);
		
	}
}