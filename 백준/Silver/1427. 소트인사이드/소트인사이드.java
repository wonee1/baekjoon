import java.util.*;
import java.io.*;
import java.lang.*; 


public class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       String str = sc.next(); 
       int A[] = new int[str.length()];
       for(int i=0; i <str.length();i++){
           A[i]= Integer.parseInt(str.substring(i,i+1));//한칸씩 가면서 자르기 
           
       }
       
       //선택 정렬
       for(int i=0;i<str.length();i++){
           int Max = i; // 맨 앞에 있는 애를 최대값으로 설정(내림차순)
           for(int j=i+1;j<str.length();j++){
               if(A[j]>A[Max]){
                   Max=j; 
               }
           }
           if(A[i]<A[Max]){
               int temp = A[i];
               A[i] = A[Max];
               A[Max]=temp; 
           }
           
       }
       
       for(int i=0; i< str.length();i++){
           System.out.print(A[i]); 
       }
       
    }
    

}