class Solution {
    public String solution(String phone_number) {
        int strLength =  phone_number.substring(0,phone_number.length()-4).length();
    String star = "*".repeat(strLength);
        String backNumber = phone_number.substring(phone_number.length()-4);
        
        // System.out.println((phone_number.substring(phone_number.length()-4)));
        // System.out.println("*".repeat(phone_number.substring(0,phone_number.length()-4).length()));
        return star+backNumber;
    }
}