import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());// 문자열 입력 받기 
        String sNum = br.readLine();// 문자열 입력 받기 
        
        char[] cNum=sNum.toCharArray();
        int sum=0;
        
        for(int i=0;i<cNum.length;i++){
            sum+=cNum[i]-'0'; //아스키코드값 48를 빼줘야 char를 int로 변환가능
        }
        
        System.out.println(sum);
    }
}