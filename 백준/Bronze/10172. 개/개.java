import java.io.*;
import java.util.*; 

public class Main{
    
    public static void main(String[] args)throws IOException{
        
      	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write("|\\_/|");
		bw.newLine();	// 줄 바꿈 
		
		bw.write("|q p|   /}");
		bw.newLine();	
        
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();
        
		bw.write("|\"^\"`    |");
		bw.newLine();
		
		bw.write("||_/=\\\\__|");
		bw.newLine();
		
        
		
       bw.flush();
       bw.close();
    }
    
    
}