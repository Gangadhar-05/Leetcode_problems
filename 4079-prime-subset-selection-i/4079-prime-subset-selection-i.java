class Solution {
    public boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> maxPrimes(int n, int s) {
        ArrayList<Integer> plist=new ArrayList<>();
        long psum=0;
        if(s<2)return plist;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                if(psum+i>s){
                    break;
                }
                plist.add(i);
                psum+=i;
            }
            
        }
        return plist;
    }
}