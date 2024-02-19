import java.util.Arrays;

class Solution {

    public int solution(int n, int[] lost, int[] reserve) {
       int[] students = new int[n + 2]; // 학생 수보다 2명 큰 배열 생성
        Arrays.fill(students, 1); // 모든 학생에게 체육복을 1개씩 가지고 있다고 초기화

        for (int l : lost) {
            students[l]--;
        }

        for (int r : reserve) {
            students[r]++;
        }

        for (int i = 1; i <= n; i++) {
            if (students[i] == 0) {
                if (students[i - 1] == 2) {
                    students[i - 1]--;
                    students[i]++;
                } else if (students[i + 1] == 2) {
                    students[i + 1]--;
                    students[i]++;
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (students[i] > 0) {
                answer++;
            }
        }

        return answer;
    }
}