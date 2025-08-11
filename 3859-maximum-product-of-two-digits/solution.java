class Solution {
    public int maxProduct(int n) {
       int[] arr=new int[10];
        
       int i=0;
        while(n>0){
            int digit=n%10;
            arr[i]=digit;
            i++;
            n/=10;
        }
        Arrays.sort(arr);
        int res=arr[arr.length-1]*arr[arr.length-2];
        return res;
        
    }
}
