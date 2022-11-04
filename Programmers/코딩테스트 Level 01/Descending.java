import java.util.Arrays;
import java.util.Collections;

class Descending {
    public long Descending(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        str = String.join("",arr);
        answer = Long.parseLong(str);
        
        return answer;
    }
}
