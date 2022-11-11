class Solution {
    public String solution(String[] seoul) {
        int x = 0;
       // String answer = "김서방은 "+ x + "에 있다" ;
        String a = "";
        
        if(true){
            for(int i = 0; i < seoul.length; i++){
                if(seoul[i] == "Kim"){
                     x += i;
                    String answer = "김서방은 "+ x + "에 있다" ;
                    return answer;
                }else{
                //   return "못 찾았습니다.";
                }
            }
        }
        return a;
    }
}
