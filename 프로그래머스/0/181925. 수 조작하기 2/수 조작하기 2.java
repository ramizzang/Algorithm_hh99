class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        // w +1
        // s -1
        // d +10
        // a -10
        
        // 5까지 있으면 5-4 ok
        for(int i = 0; i< numLog.length-1; i++){
            int log = numLog[i+1]-numLog[i];
            
            switch(log){
                case 1: answer += "w"; break;
                case -1: answer += "s"; break;
                case 10: answer += "d"; break;
                case -10: answer += "a"; break;
            }
        }
        
        
        
        return answer;
    }
}