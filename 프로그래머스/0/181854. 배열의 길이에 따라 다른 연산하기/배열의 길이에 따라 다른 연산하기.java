class Solution {
    public int[] solution(int[] arr, int n) {
       
        int[] answer = new int[arr.length];
        
        // arr 길이가 짝수 → 홀수 인덱스에 +n
        if(arr.length % 2 == 0){ 
            
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){ 
                    answer[i] = arr[i]; 
                }else{
                    answer[i] = arr[i] + n; 
                }
            }
            
        } 
        // arr 길이가 홀수 → 짝수 인덱스에 +n
        else {
            
            for(int i = 0; i < arr.length; i++){
                if(i % 2 == 0){
                    answer[i] = arr[i] + n; 
                }else{
                    answer[i] = arr[i]; 
                }
            }
        }

        return answer; 
    }
}