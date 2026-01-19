import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int A[] = new int[N]; // A는 각 시험장에 있는응시자수  
		for(int i=0; i<N;i++){
		    A[i] = Integer.parseInt(st.nextToken()); 
		    
		}
		st = new StringTokenizer(br.readLine()); // B C 한줄에 있어서 토큰으로 쪼개기 
		int B = Integer.parseInt(st.nextToken()); //총 감독관이 한번에 볼 수 있는 학생 수 
		int C = Integer.parseInt(st.nextToken()); // 부 감독관이 한번에 볼 수 있는 학생 수  
		
		long count = N; //방의 개수 만큼 총 감독관은 일단 투입된다  
		
		for(int i=0; i<N; i++){
		    if(A[i]>B){
    		    count += (A[i] - B)/C; // 총 감독관을 빼고 나서 남은 학생은 부 감독관으로 나눈다  
    		    if((A[i] - B)%C!=0){
    		        count++; 
    		    }
		    }
		}
		
		System.out.println(count);
		
	}
}