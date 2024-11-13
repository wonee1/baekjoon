/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		int M= Integer.parseInt(br.readLine());
		int[] S =new int[N];
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
		    S[i] = Integer.parseInt(st.nextToken());
		}
  
		Arrays.sort(S); // 정렬 알고리즘 사용 
		int count =0;
		int i=0; //A[0] 
		int j=N-1; //A[N-1] 
		
		while(i<j){
		    if(S[i]+S[j]<M)i++;
		    else if(S[i]+S[j]>M)j--;
		    else{
		    i++;
		    j--;
		    count++;
		    }
		}
		
		System.out.println(count);
		
	}
}