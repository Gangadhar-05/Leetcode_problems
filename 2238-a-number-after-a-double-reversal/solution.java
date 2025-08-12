class Solution {
    public boolean isSameAfterReversals(int num) {
        int digit=num%10;
        if(digit!=0 || num==0)return true;
        else return false;
    }
}
