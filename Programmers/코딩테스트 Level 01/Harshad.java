class Harshad {
    public boolean Harshad(int x) {
        int plus = 0;
        int n = x;
        
        while ( x != 0 ){
            plus += x % 10;
            x /= 10;
        } 
        return n % plus == 0;
    }
}
