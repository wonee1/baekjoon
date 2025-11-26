import java.util.*;
import java.io.*;


public class Main{
    
    public static boolean isPrime(int n){
        
        if(n<=1){
            return false; 
        }
        
        // 합성수 N은 i부터 시작해서 루트 N까지의 범위에 약수를 가지고 있음  
        for(int i=2; i*i<=n;i++){
            if(n%i==0){//나누어 떨어지는 수가 있다면 소수가 아니다 (합성수_ 
                return false; 
            }
        }
        
        return true; 
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // M 이상 
		int N = sc.nextInt();  // N 이하

        
        int sum = 0; // 합계 저장 
        int min = -1; //최솟값 저장 
        
        
        // M부터 N까지 반복하며 소수인지 확인
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                
                sum += i; 
                
                //첫 번째로 발견된 소소구ㅏ 가장 작으 소수 
                if(min == -1){
                    min = i; 
                }
                
            }
        }

        if(sum > 0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1); 
        }
		
	}
}






