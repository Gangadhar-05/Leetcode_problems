class Solution {
    static boolean zerocheck(int i){
        int cnt=0;
        while(i>0){
            int digit=i%10;
            if(digit==0)
            cnt++;
            i/=10;
        }
        if(cnt==0) return true;
        else return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
       
        for(int i=1;i<n;i++){
           int j=n-i;
                if( zerocheck(i) && zerocheck(j)){
                    arr[0]=i;
                    arr[1]=j;
                }
            
        }
        return arr;
    }
}
