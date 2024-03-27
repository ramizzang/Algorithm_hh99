class Solution {
    public String solution(int n) {
        // 길이 n 
        // 수박수박 패턴
        // n이 4이면 수박수박 , 3이면 수박수
        // 0 수 1 박 2수 3박
        // 짝 : 수 , 홀 : 박
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < n; i++){
            sb.append(i%2==0?"수":"박");
        }
   
        return sb.toString();
    }
}