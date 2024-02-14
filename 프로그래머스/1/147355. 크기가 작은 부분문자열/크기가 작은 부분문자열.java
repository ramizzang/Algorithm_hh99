class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int lenT = t.length();
        int lenP = p.length();
        
        long targetNum = Long.parseLong(p);
        
        for(int i=0; i<= lenT - lenP; i++){
            String subStr = t.substring(i, i+lenP);
                System.out.println(subStr);
            long subNum = Long.parseLong(subStr);
            
            if(subNum <= targetNum){
                answer++;
            }
        }
               
        return answer;
    }
}