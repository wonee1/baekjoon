class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int len1= arr1.length; 
        int len2= arr2.length;
        
        if(len1>len2){
            return 1;
        }else if(len1<len2){
            return -1;
        }else if(len1 == len2){
            if(sum(arr1)>sum(arr2)){
                return 1;
            }else if(sum(arr1)<sum(arr2)){
                return -1; 
            }else{
                return 0; 
            }   
        } 
        return 0; 
    }
    
    public int sum (int[] arr){
        
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum +=arr[i]; 
    
        }
        return sum;         
    }
}