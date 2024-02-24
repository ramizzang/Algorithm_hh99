import java.util.Arrays;

class Solution {
    public static long solution(long n){
        // 각 자릿수를 배열에 저장하고 직접 정렬하여 결과 계산
        String[] strNum = String.valueOf(n).split("");
        int len = strNum.length;
        int[] intArray = new int[len];

        for (int i = 0; i < len; i++) {
            intArray[i] = Integer.parseInt(strNum[i]);
        }

        Arrays.sort(intArray);

        long answer = 0;
        for (int i = len - 1; i >= 0; i--) {
            answer = answer * 10 + intArray[i];
        }

        return answer;
    }
}