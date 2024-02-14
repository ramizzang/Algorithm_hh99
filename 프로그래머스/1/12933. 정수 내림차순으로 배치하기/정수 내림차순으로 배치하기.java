import java.util.*;
class Solution {
    public static long solution(long n){
        // 각 자릿수를 배열 or list에 저장
        // 방법 1. Strtin 으로 변환 후 정렬 한 뒤 더하기
        // 방법 2. list or 배열에 저장 한뒤 collections를 사용 or for문을 사용하여 뒤에서부터 저장해주기
        long answer = 0;
        String result="";
        //1. long 을 스트링으로 변환 하여 배열로 저장
        String[] strNum = String.valueOf(n).split("");
        Arrays.sort(strNum);
        for(int i=strNum.length-1; i>=0; i--){
            result += strNum[i];
        }


        return Long.parseLong(result);
    }
}