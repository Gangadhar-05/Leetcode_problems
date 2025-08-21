import java.util.HashMap;

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Sum elements that appear exactly once
        int sum = 0;
        for (int num : freq.keySet()) {
            if (freq.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}

