class Solution {
    public static boolean isPrime(int n){
        if(n<=1)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3;i<=(int)Math.sqrt(n);i+=2){
            if(n%i==0)return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
    int rev=0;
    int num=n;
    while(num!=0){
    int ls=num%10;
    rev=rev*10+ls;
    num/=10;
    }
   int a=Math.min(n,rev);
   int b=Math.max(n,rev);
   int sum=0;
   for(int i=a;i<=b;i++){
       if(isPrime(i))sum+=i;
   }
        return sum;
    }
}
