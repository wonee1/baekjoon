import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b * c; // 결과값
        String str = String.valueOf(result); // 문자열로 변환

        int[] num = new int[10]; // 0~9 카운트 배열

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            num[ch - '0']++;  // '0'을 빼서 정수 인덱스로 변환
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
    }
}

