import java.util.*;

class wordChainGame {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < words.length; i++){
            if(i != 0 ){
                String back = words[i - 1];  // 이전 단어
                String next = words[i];  // 현재 단어
                
                char last = back.charAt(back.length() - 1); // 마지막 철자 (0부터 이므로 -1)
                char first = next.charAt(0); // 처음 철자이므로 0
                
                if(map.containsKey(next) || last != first){
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    
                    return answer;
                }
            }
            map.put(words[i],1);
        }

        return answer;
    }
}
