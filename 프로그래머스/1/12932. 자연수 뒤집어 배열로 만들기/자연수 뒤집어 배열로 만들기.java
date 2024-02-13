import java.util.*;
class Solution {
    public long[] solution(long n) {
        String[] strNum = String.valueOf(n).split("");
        long[] answer = new long[strNum.length];
        System.out.println();
        
        int index = strNum.length-1;
        for(String str : strNum){
            answer[index--] = Integer.parseInt(str);
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}