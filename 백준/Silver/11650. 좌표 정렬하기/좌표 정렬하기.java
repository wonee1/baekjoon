import java.util.*;
import java.io.*;


public class Main{
    
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        ArrayList<Point>points = new ArrayList<>(); // 배열 리스트 points 선언 (x,y를 저장함 )
        
        
        for(int i=0; i<N; i++){
            
            points.add(new Point(sc.nextInt(), sc.nextInt())); //x,y 갖고 와서 배열 리스트에 넣기 
            
            
        }
	 
	   Collections.sort(points); 
	   for(Point now : points){
        // points 리스트의 모든 요소를 순서대로 하나씩 now 변수에 대입
        
        System.out.println(now.x + " " + now.y);
	   }
	   
	   
    }
	 
}


class Point implements Comparable<Point>{//정렬 기준이 되는 Comparable 인터페이스 구현  
//<Point>를 명시함으로써, 이 Point 클래스의 객체들은 다른 Point 객체와 비교하여 정렬될 것을 보인다 
    
    int x; 
    int y;
    
    public Point(int x, int y){
        this.x =x;
        this.y =y; 
    }
    
    
    @Override
    public int compareTo(Point o){//객체를 비교하는 정렬 기준 
        if(this.x == o.x){
            return this.y - o.y; // x가 같을 때는 y 로 오름차순 정렬   
        }
        return this.x - o.x; //객체 오름차순 정렬 
        
    }
}