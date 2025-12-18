import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 지불할 돈 받기 
        int res = 0 ; //  잔돈 초기화 
        res = 1000-num; // 잔돈 계산 
        
        int count = 0; // 동전 개수
        int[] coins = {500, 100, 50, 10, 5, 1}; // 거스름돈 종류

        for (int coin : coins) {
            if (res >= coin) {
                count += res / coin; // 해당 동전의 개수를 더함
                res %= coin;         // 남은 잔돈 업데이트
            }
        }   
        
        System.out.println(count);

	}
}