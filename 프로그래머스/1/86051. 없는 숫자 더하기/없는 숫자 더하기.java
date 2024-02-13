class Solution {
    public int solution(int[] numbers) {
        
        //0~9 까지 더한 값
        int sum = 45;
        
        for(int num : numbers){
            sum -= num;
        }
        
        return sum;
    }
}