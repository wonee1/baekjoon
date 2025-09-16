import java.util.*;
import java.io.*; 

public class Main {
	
    static int[] dx={0,1,0,-1}; //상하좌우 탐색
    static int[] dy={1,0,-1,0}; 
    static boolean[][] visited; // 방문 배열  
    static int[][] A; // 데이터 저장 배열 
    static int N,M; 
    
	public static void main(String[] args)throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    N=Integer.parseInt(st.nextToken());
	    M=Integer.parseInt(st.nextToken());
	    A = new int[N][M];
	    visited = new boolean[N][M]; 
	    
	    for(int i=0;i<N;i++){
	        st=new StringTokenizer(br.readLine());
	        String line =st.nextToken(); //공백이 없기 때문에 일단 한줄로 받기 
	        for(int j=0;j<M;j++){
	            A[i][j] = Integer.parseInt(line.substring(j,j+1)); //한줄로 받은 걸 한칸씩 끊어서입력받기  
	            
	        }
	    }
	    
	    BFS(0,0); 
	    System.out.println(A[N-1][M-1]); 
		
	}
	
	private static void BFS(int i, int j){
	    
	   Queue<int[]>queue = new LinkedList<>(); 
	   queue.offer(new int[] {i,j});  // 시작 노드삽입하기 
	   visited[i][j] = true; 
	   	       
	   while(!queue.isEmpty()){
	       int now[] = queue.poll(); //큐에서 노드 데이터 가져오기 
	       for(int k=0; k<4; k++){ // 상하좌우로 탐색 
	           int x= now[0] + dx[k]; 
	           int y= now[1] + dy[k]; 
	           if(x>=0 && y>=0 && x<N && y<M){ // 배열을 넘어가면 안되고
	               if(A[x][y]!=0&&!visited[x][y]){// 0이여서 갈 수 없거나 방문한 곳이면 안됨
	                visited[x][y] = true;    
	                A[x][y] = A[now[0]][now[1]] +1; 
	                queue.add(new int[] {x,y} );
	               }
	         
	           }
	       }
	       
	   }
	    
	}
	
}