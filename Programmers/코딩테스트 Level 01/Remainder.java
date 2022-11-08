class Remainder {
    public int Remainder(int n) {
        int x = 0;
      
        for( x=1; x < n; x++){
            if(n % x == 1){
                return x ;
            }
        }
        return x;
    }
}
