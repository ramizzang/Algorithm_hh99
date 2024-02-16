class Solution {
    public String solution(int[] food) {
        String answer = "";
        String foodList = "";
        for(int i=1; i<food.length; i++){
            int count = food[i]/2;
           foodList += String.valueOf(i).repeat(count);
        }
        answer += foodList+ "0";

        for(int i=foodList.length()-1; i>=0; i--){
            answer += foodList.charAt(i);
        }

        return answer;
    }
}