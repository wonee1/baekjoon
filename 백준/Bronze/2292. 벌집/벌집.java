import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int now = 1;

        while(N > count){
            count += now * 6; // 이전 카운트에 6의 배수를 더해간다
            now++;
        }

        System.out.println(now);
        
    }

}