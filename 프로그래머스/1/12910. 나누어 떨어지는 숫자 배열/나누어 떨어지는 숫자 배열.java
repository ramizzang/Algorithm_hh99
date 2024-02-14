import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();

        //arr length 만큼 반복
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                result.add(arr[i]);
            }
        }
        /* 향상된 for 문으로 변경
        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        */
        int[] resultArr = new int[result.size()];
        if (result.isEmpty()) { // list가 비어있다면
            return new int[]{-1};
        } else { // int[] 배열에 넣어주기
            for(int i = 0; i<result.size(); i++){
                resultArr[i] = result.get(i);
            }
            Arrays.sort(resultArr);
        }
     return resultArr;
    }
    
}