class Solution {
   public static boolean isprime(int n){
       if(n<=1) return false;
       for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
               return false;
           }
       }
        return true;
    }
    public boolean completePrime(int num) {
        if(num<10){
            return isprime(num);
        }
        String s=String.valueOf(num);
        int digcnt=s.length();
       for(int i=1;i<=digcnt;i++){
           int pref=Integer.parseInt(s.substring(0,i));
           if(!isprime(pref)){
               return false;
           }
       }

         for(int i=0;i<digcnt;i++){
           int suf=Integer.parseInt(s.substring(i));
           if(!isprime(suf)){
               return false;
           }
       }
        return true;
        
    }
}
