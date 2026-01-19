import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int N = Integer.parseInt(st.nextToken()); // 응시자수 
		int K = Integer.parseInt(st.nextToken()); // 상 받는 수 
		
		
		int A[] = new int[N];
		st = new StringTokenizer(br.readLine()); 
		
		
		for(int i=0 ; i<N ; i++){
		    A[i] = Integer.parseInt(st.nextToken());// 점수 분배 
		
		}
		
		Arrays.sort(A); // 오름차순으로 정렬 
		
        int result = A[N-K]; 
        
        System.out.println(result);
		
	}
}