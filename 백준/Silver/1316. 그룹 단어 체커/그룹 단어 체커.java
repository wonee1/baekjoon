import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
       
        for(int i=0; i<N; i++){
            String word = sc.next(); 
            
            boolean[] visited = new boolean[26]; // 알파벳 방문 booleann 배열 
            boolean isGroup = true; //그룹 단어 체크 배열 
            
            for(int j=0; j<word.length();j++){
                
                char c = word.charAt(j); // 문자열 순회 
                
                if(j>0 && c != word.charAt(j-1) ){//이전 문자열과 다른 문자열이 나왔을 때 
                    if(visited[c-'a']){//이미 방문한 알파벳이라면 
                        isGroup=false; 
                        break;                
                    }
                    
                }  
                
                visited[c - 'a'] = true;//방문 완료 한 알파벳은 true      
            }
            
            if(isGroup){//그룹문자가 true면 증가! 
                count++;
            }
        } 
       
       System.out.print(count); 
       
    }
}