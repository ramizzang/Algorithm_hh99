import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        // arr[i]와 arr[j]의 값을 서로 변경
        
        for(int[] query : queries){

            for(int i=0; i<query.length-1; i++){
                int tmp = arr[query[i]];
                arr[query[i]] = arr[query[i+1]];
                arr[query[i+1]] = tmp;
            }
        }
        
        
        return arr;
    }
}