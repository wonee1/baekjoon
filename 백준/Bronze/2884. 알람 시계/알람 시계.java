import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int H=in.nextInt();
        int M=in.nextInt();
        
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
