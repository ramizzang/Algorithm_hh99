class Solution {
    public long solution(int a, int b) {
        long answer = 0;
      
        
        for(int i =0; i<= (a < b ? b-a : a-b); i++){
            answer += a < b ? a+i : a-i;
        }

        
        return answer;
    }
}