import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[5];  
        int sum=0; 
        int max=0; 
        
        for(int i=0;i<5;i++){
            N[i] = sc.nextInt(); 
            sum+=N[i];
            
        }
        
        Arrays.sort(N);//오름차순 정렬  
        int result= sum/5; 
        int middle=N[2];
           
        System.out.println(result); 
        System.out.println(middle); 
    
    }
}

