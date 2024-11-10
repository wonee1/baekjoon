import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());//StringTokenizer로 값 분리 
	    int N = Integer.parseInt(st.nextToken()); //숫자 개수 
	    int M = Integer.parseInt(st.nextToken());//질의 개수 
	    long[] S = new long[N+1]; 
	    st = new StringTokenizer(br.readLine());
	    
	    for(int i=1; i<=N; i++){
	        S[i]=S[i-1] + Integer.parseInt(st.nextToken());
	    }//합 배열 저장 
	    
	    for(int q=0;q<M;q++){
	           st = new StringTokenizer(br.readLine());
	          int i=Integer.parseInt(st.nextToken());
	          int j=Integer.parseInt(st.nextToken());
	          System.out.println(S[j]-S[i-1]);//구간합 출력 
	    }
	     

	}
}