class Solution {
    public int parity(int ind,int[] arr){
        int ocnt=0;
        int ecnt=0;
        for(int i=ind+1;i<arr.length;i++){
            if(arr[i]%2==0)ecnt++;
            else ocnt++;
        }
        if(arr[ind]%2==0)return ocnt;
        else return ecnt;
    }
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=parity(i,nums);
        }
        return res;
    }
}
