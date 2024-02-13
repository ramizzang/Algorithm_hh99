class Solution {
    public static boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            String[] strArr = s.split("");
            for(String str : strArr){
                if(!(str.compareTo("0") >= 0 && str.compareTo("9") <= 0)){
                    // "1" 이상 "9" 이하의 문자열일 때의 처리
                    return false;
                }
            }
        }else{
            return false;
        }

        return answer;
    }
}