class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int digitsum=0;
        int number=x;
        while(x>0){
            int digit=x%10;
            digitsum+=digit;
            x/=10;

        }
        if(number%digitsum==0){
            return digitsum;
        }else return -1;
    }
}
