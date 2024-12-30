import java.util.*;
import java.io.*;
import java.lang.*; 


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 수의 개수 읽기
        int Arr[] = new int[N]; // 배열 선언
        
        for (int i = 0; i < N; i++) {
            Arr[i] = Integer.parseInt(br.readLine()); // 각 숫자를 배열에 저장
        }
        
        // 버블 정렬
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    // swap 함수를 호출하여 배열 요소를 교환
                    swap(Arr, j, j + 1);
                }
            }
        }
        
        // 정렬된 배열 출력
        for (int i = 0; i < N; i++) {
            System.out.println(Arr[i]);
        }
    }
    
    // 배열 요소를 교환하는 swap 함수
    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}