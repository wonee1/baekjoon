import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int H=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		if(M>44){
            M-=45;
            System.out.printf("%d %d\n",H,M);
        }
        
        else if(M<45){
           H--;
           M=60-(45-M);
           
           if(H<0){
           H=23;
           }
           
          System.out.printf("%d %d\n",H,M);
          
        }
		
		
	}
}