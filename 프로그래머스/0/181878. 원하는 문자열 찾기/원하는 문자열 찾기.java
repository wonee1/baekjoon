class Solution {
    public int solution(String myString, String pat) {
        
        char[] arr = myString.toCharArray();
        boolean check = false;
        
       //pat의 문자열 길이 만큼 잘라서 일치하는지 비교해야함 대소문자 상관없으니깐 equalsIgnoreCase() 사용하기 
        
        for(int i = 0; i <= myString.length() - pat.length(); i++){
            
            String sub = myString.substring(i, i + pat.length()); //pat의 길이만큼 자르기 

            if(sub.equalsIgnoreCase(pat)){//대소문자 상관없이 값 일치 비교    
                check = true;
                break;
            }
        }
        
        if(check == true){
            return 1;
        }else{
            return 0;
        }
    }   
    
}
