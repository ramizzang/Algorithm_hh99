import java.util.*;
class Solution {
     public long solution(long n) {
            // 1. while % -> 각 자리수를
            // 2. LongStream 으로 .char
            // 3. String -> int -> Arr -> sort

            List<Long> arr = new ArrayList<Long>();

            while (n > 0) {
                Long digit = n % 10;
                n /= 10;
                arr.add(digit);
            }
//            Collections.reverse(arr);
            Collections.sort(arr, Collections.reverseOrder());

            long answer = 0;
            for(int i =0; i<arr.size(); i++){
                answer = (answer * 10) + arr.get(i) ; // 인덱스 값 하나씩 가져옴
            }
            return answer;
        }
}