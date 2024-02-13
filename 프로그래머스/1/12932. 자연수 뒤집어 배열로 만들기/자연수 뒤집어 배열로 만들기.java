import java.util.*;
class Solution {
    public int[] solution(long n) {
        String[] strNum = String.valueOf(n).split("");
        int[] answer = new int[strNum.length];
        int index = 0;
        for(String str : strNum){
            answer[index++] = Integer.parseInt(str);
        }
        Arrays.sort(answer,collection.revers());
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}