class Solution {
    public String solution(int a, int b) {
        int answer=0;
        
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<a-1; i++){
            answer += month[i];
        }
        answer += b-1;
                
        
        return days[answer % 7];
    }
}