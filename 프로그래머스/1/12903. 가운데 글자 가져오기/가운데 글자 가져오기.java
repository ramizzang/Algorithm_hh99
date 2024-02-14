class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        //단어의 길이가 짝수면 가운데 두글자 반환
        // s 길이 1 이상 100 이하
        int len = s.length();
        if( !(len % 2 == 0)){//홀수일때
//            char ch = s.charAt(len/2);
            answer = strArr[len/2];
        }else{ //짝수는 가운데 두개 0123 2,1
            answer = strArr[len/2-1] + strArr[len/2] ;
            
        }
        return answer;
    }
}