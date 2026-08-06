class Solution {
    public int product(int num){
        int pro =1;
        while (num>0){
                pro*=num%10;
                num/=10;
            }
            return pro;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            
            int num=n;
            
            if(product(num)%t==0){
                return n;
            }else{
                n++;
            }
        }
    }
}
