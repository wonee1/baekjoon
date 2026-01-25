class Solution {
    public int solution(int[] num_list) {

        int product = 1; // 곱은 1부터 시작
        int sum = 0;

        for (int i = 0; i < num_list.length; i++) {
            product *= num_list[i];
            sum += num_list[i];
        }

        int sumSquare = sum * sum;

        return product < sumSquare ? 1 : 0;
    }
}
