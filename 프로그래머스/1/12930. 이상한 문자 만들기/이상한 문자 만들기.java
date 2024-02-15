class Solution {
    public String solution(String s) {
        String[] words = s.split(" ",-1);
        String answer = "";
        
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                
                //짝수 인덱스 변환
                if(i % 2 == 0 ){
                    //대소문자 확인
                    if('A'<= ch && ch <= 'Z'){ // 대문자이면 그대로 추가
                        answer += ch;
                    }else{ //소문자이면 대문자로 변환
                        answer += (char)(ch - 'a' + 'A');
                    }
                }else{ // 홀수 인덱스 변환
                    if('A'<= ch && ch <= 'Z'){ // 대문자이면 소문자로 변환
                        answer += (char)(ch - 'A' + 'a');
                    }else{ // 소문자이면 그대로 추가
                        answer += ch;
                    }
                }
            }
            answer += " ";
        }
        
            if (!answer.isEmpty()) {
            answer = answer.substring(0, answer.length() - 1);
                
        }

        return answer;
    
    }
}