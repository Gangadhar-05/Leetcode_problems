class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int number=1;
        while(true){
            if(set.contains(number)){
                number++;
            }else{
                return number;
            }
        }
    }
}
