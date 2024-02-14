class Solution {
    public boolean solution(String str) {
        int len = str.length();
        if(!(len == 4 || len == 6)) {
            return false;
        }
//        s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다
        for(char ch : str.toCharArray()){
            System.out.println(ch);
            if('a'<=ch && ch<='z' || 'A'<=ch && ch<='Z'){
                return false;
            }
        }
        return true;
    }
}