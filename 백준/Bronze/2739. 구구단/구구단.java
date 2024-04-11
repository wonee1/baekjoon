import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int dan=in.nextInt();
        int res=0;
        
        
        for(int i=1;i<10;i++){
            res=dan*i;
            System.out.printf("%d * %d = %d\n", dan, i, res);
            
        }
        
       
 	}
}
