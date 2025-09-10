/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; 
import java.io.*;

public class Main
{
    
    static boolean visited[]; 
    static ArrayList<Integer>[] A; 
    
	public static void main(String[] args) throws IOException {
		
		BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st= new StringTokenizer(br.readLine()); 
		
		int n= Integer.parseInt(st.nextToken()); // 노드 개수 입력 
		int m= Integer.parseInt(st.nextToken()); // 엣지 개수 입력 
		
	    visited = new boolean[n+1];
	    
		
		A = new ArrayList[n+1]; // 인접리스트 배열 선언 
		
		for(int i=1; i<n+1; i++){
		    A[i] = new ArrayList<Integer>(); // 인접리스트의 arrylist 초기화 
		    
		}
		
		
		for(int i=0; i<m;i++){
		    
		    st = new StringTokenizer(br.readLine()); // 한줄씩 받기
		    int s= Integer.parseInt(st.nextToken()); // 시작점 입력 
		    int e= Integer.parseInt(st.nextToken()); // 종료점입력 
		    
		    A[s].add(e);
		    A[e].add(s); // 방향성이 없고 연결되어있기 때문에 
		    
		}//노드의 개수 만큼 엣지 정보들 받기 
		
		
		int count = 0; 
		
		for(int i=1 ;i<n+1;i++){
		    
		    if(!visited[i]){// 방문하지 않은 노드 
		       
		        count ++; 
		        DFS(i);
		        
		    }
		    
		}
		
		
		System.out.println(count); 
	
	
 	}
 	
 	
 	private static void DFS (int v){
 	    
 	    if(visited[v]) return; // 현재 노드가 방문 노드면 바로 종료 
 	    
 	    visited[v] = true; // 현재 노드 방문 노드로 기록 
 	    
 	    for(int i: A[v]){ //A[v] 안에 들어 있는 원소들을 하나씩 꺼내서 i에 넣는다
 	        if(!visited[i]){
 	            DFS(i); 
 	        }
 	    }
 	    
 	}
 
}