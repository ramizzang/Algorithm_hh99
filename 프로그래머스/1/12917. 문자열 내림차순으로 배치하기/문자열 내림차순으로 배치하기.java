import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArr = s.toCharArray();
        
        Arrays.sort(chArr);
        
        for(int i = chArr.length-1; i>=0; i--){
            answer += String.valueOf(chArr[i]);
        }
 
        return answer;
    }
}