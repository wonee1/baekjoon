import java.util.*;
import java.io.*; 


public class Main
{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toUpperCase(); // 전부 대문자로 변환
        int[] count = new int[26]; // A~Z 카운트 배열
        
        
        
		 // 각 알파벳 빈도수 세기
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            count[c - 'A']++;//알파벳 빈도수 세기 
        }
        
         // 최댓값 찾기
        int max = -1;
        char result = '?';
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i]; 
                result = (char) (i + 'A'); // 숫자를 다시 알파벳으로 변환 
            } else if (count[i] == max) { 
                result = '?'; // 최댓값이 여러 개일 때 
            }
        }
        
        System.out.println(result);
        
	
	}
}