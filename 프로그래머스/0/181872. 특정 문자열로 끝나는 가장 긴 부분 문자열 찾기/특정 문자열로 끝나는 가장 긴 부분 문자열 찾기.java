class Solution {
    public String solution(String myString, String pat) {
        
        int index = myString.lastIndexOf(pat); //마지막 인덱스 
        
        return myString.substring(0, index + pat.length()); //마지막 인덱스에서 pat 문자열 길이까지 더한 것까지 포함
    }
}