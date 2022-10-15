class Squareroot {
    public long Squareroot(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        double sqrtPlus = Math.sqrt(n) + 1;
        
        if(Math.pow((int)sqrt, 2) == n){
            answer = ((long)Math.pow(sqrtPlus,2));
            return answer;    
        }else{
            answer = -1;
            return answer;
        }
   
    }
}
