class Solution {
    public int smallestAbsent(int[] nums) {
         int n = nums.length;
        long sum = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            sum += num;
            set.add(num);
        }
        
        double avg = (double) sum / n;
        int candidate = (int) Math.floor(avg) + 1;
        
       
        while (candidate <= 0 || set.contains(candidate)) {
            candidate++;
        }
        
        return candidate;
    }
}
