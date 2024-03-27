class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        //길이가 같은 두 1차우너 정수 배열 a,b
        // 내적을 return
        // a[n-1]*b[n-1]
        int idx = 0;
        for(int num: a){
            answer += a[idx]*b[idx];
            idx++;
        }
        
        
        return answer;
    }
}