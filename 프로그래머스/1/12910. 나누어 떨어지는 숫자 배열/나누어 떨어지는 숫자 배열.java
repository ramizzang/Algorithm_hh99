import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int answer[];
        int arrLength = 0;
        
        //arr을 divisor 을 나누어서 오름차순 정렬        
        for(int i : arr){
            if(i%divisor == 0){
                arrLength++;                
            }
        }

        
        if(arrLength == 0){
            answer = new int[]{-1};
        }else{
            answer = new int[arrLength];
            int index = 0;
            for(int i : arr){
                if(i % divisor == 0){
                    answer[index++] = i;
                }
            }
            //정렬
            Arrays.sort(answer);
        }
        
        
        return answer;
    }
}