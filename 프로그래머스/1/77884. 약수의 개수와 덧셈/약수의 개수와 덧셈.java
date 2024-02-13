class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer += measure(i) % 2 == 0 ? i : -i;
        }

        return answer; // 결과값 반환 추가
    }

    public static int measure(int number) { // 약수의 개수를 구하는 메서드
        int result = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result++;
            }
        }

        return result;
    }
}