class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

        int m = my_string.length();
        int o = overwrite_string.length();

        char[] marr = my_string.toCharArray();
        char[] oarr = overwrite_string.toCharArray();

        // 덮어쓰기
        for (int i = 0; i < o; i++) {
            marr[s + i] = oarr[i];
        }

        return new String(marr);
    }
}
