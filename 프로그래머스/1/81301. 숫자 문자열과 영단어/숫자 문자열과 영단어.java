class Solution {
    public int solution(String s) {
        String[] strNumbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i < strNumbers.length; i++){
            s = s.replace(strNumbers[i],Integer.toString(i));
        }
        
        
        return Integer.parseInt(s);
    }
}