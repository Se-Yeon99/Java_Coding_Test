import java.util.*;

public class PlusNumber {
    public int PlusNumber(int n) {
        int answer = 0;

         while ( n != 0 ){
            answer += n % 10;
            n /= 10;         
        }

        return answer;
    }
}
