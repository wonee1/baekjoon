import java.util.*;
import java.io.*; 


public class Main
{
	public static void main(String[] args) throws IOException {
	
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();


        // 문자열이 팰린드롬인지 확인
        boolean isPalindrome = true;
        int len = word.length();
        
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
         if (isPalindrome) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
            
	}
}