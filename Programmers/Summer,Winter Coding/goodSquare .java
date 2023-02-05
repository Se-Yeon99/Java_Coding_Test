class goodSquare {
    public long solution(int w, int h) {
       
        long x = gcd(w,h);
        return ((long) w * h) - (((w / x) + ( h / x ) - 1 ) * x);
        
    }
    // 최대공약수 구하기 (유클리드 호제법)
    public int gcd(int n , int m){
        
        while ( m != 0 ){
            int r = n % m;
            
            n = m;
            m = r;
        }
        
        return n;
    }
}
