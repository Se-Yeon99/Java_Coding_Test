class Count {
    boolean Count(String s) {
        
        int p = s.replaceAll("[^pP]","").length();
        int y = s.replaceAll("[^yY]","").length();
        
        if(p == y){
            return true;
        }else if (p != y){
            return false;
        }
       return true;
    }
}
