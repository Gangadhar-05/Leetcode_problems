class Solution {
    public boolean isPalindrome(int x) {
        int num=Math.abs(x);
        int rev=0;
        while(num!=0){
            int ls=num%10;
            rev=rev*10+ls;
            num/=10;
        }
        if(rev==x)return true;
        else return false;

        
    }
}
