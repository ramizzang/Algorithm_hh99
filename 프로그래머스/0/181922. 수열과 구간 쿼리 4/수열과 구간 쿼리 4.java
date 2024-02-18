import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        // queries s,e,k
        // s<= i <= e
        // i 가 k의 배수이면 arr[i] 에 1을 더한다
        
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            //0~4 0,1,2,3,4 / 1 / 1의 배수 이면 arr[i]에 1d을 더한다
            //arr[0] arr[1] arr[2] arr[3] arr[4] 1,2,3,5
            // 0은 모든 수의 배수 i%k == 0 -> arr[i]++;
            
            for(int i=s; i<=e; i++){  
                if(i%k ==0){
                    arr[i]++;
                    
                }
            }
                       
            
        }
        
        
        
        
        return arr;
    }
}