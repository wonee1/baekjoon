import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());// 개수 입력 받기 
        String[] input = br.readLine().split(" ");// 점수를 공백으로 분리 
        int[] A = new int[N];
        double max=0;
        double sum=0;
        
      
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(input[i]); 
            if(max<A[i])max=A[i];
            sum+=A[i];
        }
        
        System.out.print(sum*100/max/N);
      
    }
}