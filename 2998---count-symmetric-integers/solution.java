class Solution {
    static int digitcnt(int i){
        int dcnt=0;
    while(i>0){
       i/=10;
       dcnt++;
    }
    return dcnt;
    }
    static int symcheck(int i,int digitcnt){
        String numStr = Integer.toString(i);
        int length = digitcnt;
        int leftSum = 0;
        int rightSum = 0;

        for (int j = 0; j < length / 2; j++) {
            leftSum += Character.getNumericValue(numStr.charAt(j));
        }

        for (int j = length / 2; j < length; j++) {
            rightSum += Character.getNumericValue(numStr.charAt(j));
        }

        return Math.abs(leftSum - rightSum);
          
        
    }

        
    
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for(int i=low;i<=high;i++){
            if(digitcnt(i)%2==0) {
                int n=digitcnt(i);
                if(symcheck(i,n)==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
