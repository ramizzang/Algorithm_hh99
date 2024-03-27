class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        
        int len = s.length();
        
        if(!(s.length() %2 == 0)){
            answer = strArr[len/2];
        }
        
        if(s.length() %2 == 0){
            answer =strArr[len/2-1] +strArr[len/2];
        }
        
        
        
        return answer;
    }
}