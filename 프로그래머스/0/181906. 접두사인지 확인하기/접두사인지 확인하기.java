class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int len = is_prefix.length();
        
        if(my_string.length()>=len){
            answer = my_string.substring(0,len).equals(is_prefix)?1:0;
            System.out.println(my_string.substring(0,len).equals(is_prefix));
        }
        
        
        
        return answer;
    }
}