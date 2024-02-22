class Solution {
    public int solution(int n) {
         int answer = 0;
        //n보다 작은수로 나눠서 나머지가 0인 수를 더하기
        for(int i = 1; i<= n; i++){
            if(n%i==0){
                answer += i;
            }
        }
        return answer;
    }
}