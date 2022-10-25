class Count {
    boolean Count(String s) {
      int p = 0, y = 0;
        String[] array = s.toLowerCase().split("");
        
        for(int i = 0; i < array.length; i++){
            if("p".equals(array[i])){
                p++;
            }else if ("y".equals(array[i])){
               y++;
            }
        }
        if(p != y){
            return false;
        }
        return true;
    }
}
