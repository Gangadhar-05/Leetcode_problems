class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int largest=0;
        for(int x:set){
            if(!set.contains(x-1)){
                int cnt=1;
                
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                largest=Math.max(cnt,largest);
            }
            
        }
        return largest;
    }
}
