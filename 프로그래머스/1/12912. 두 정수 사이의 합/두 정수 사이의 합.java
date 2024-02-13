class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // a, b 사이에 속한 모든 정수의 합
        if(a>b){
            for(long i = b; i<= a; i++){
            answer += i;
        }
        }
        else {
                for(long i = a; i<= b; i++){
                    answer += i;
                }
            }

        
        return answer;
    }
}