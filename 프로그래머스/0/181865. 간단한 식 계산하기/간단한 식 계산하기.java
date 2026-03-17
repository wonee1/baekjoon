class Solution {
    public int solution(String binomial) {
        
        String[] arr = binomial.split(" ");// 공백 기준으로 일단 스플릿 
        
        int a = Integer.parseInt(arr[0]); // 0번 숫자  
        int b = Integer.parseInt(arr[2]); // 2번 숫자 
        String op = arr[1]; //1번은 연산자 
        
        if(op.equals("+")){
            return a + b;
        }else if(op.equals("-")){
            return a - b;
        }else{
            return a * b;
        }
        
    }
}