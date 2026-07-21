class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                HashSet<Integer> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long req = (long) target - nums[i] - nums[j] - nums[k];

                    if (req >= Integer.MIN_VALUE &&
                        req <= Integer.MAX_VALUE &&
                        seen.contains((int) req)) {

                        List<Integer> temp = new ArrayList<>(
                            Arrays.asList(nums[i], nums[j], nums[k], (int) req)
                        );

                        Collections.sort(temp);
                        set.add(temp);
                    }

                    seen.add(nums[k]);
                }
            }
        }

        return new ArrayList<>(set);
    }
}
