class Solution {
    public String solution(int n) {
        String answer = "";
        //n이 홀수이면 수박수
        //짝수이면 수박
        //홀일때 수 짝일때 박
        
        for(int i = 1; i <= n; i++){
            answer += i % 2 == 0? "박" : "수";
        }
    
        return answer;
    }
}