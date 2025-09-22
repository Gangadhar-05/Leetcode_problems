class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int pcnt=0;
        int remcnt=0;
        for(int val:freq.values()){
            if(val%2!=0){
                remcnt++;
            }
            pcnt+=val/2;
        }
        int[] arr=new int[2];
        arr[0]=pcnt;
        arr[1]=remcnt;
        return arr;
    }
}
