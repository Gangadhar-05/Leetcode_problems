class Solution {
    public int alternateDigitSum(int n) {
        // Step 1: Extract digits from n and store in a stack or array
        int[] digits = new int[10]; // max 10 digits for int
        int len = 0;
        while (n > 0) {
            digits[len++] = n % 10;
            n /= 10;
        }

        // Step 2: Process digits from most significant to least (reverse the array)
        int sum = 0;
        int sign = 1; // start with positive
        for (int i = len - 1; i >= 0; i--) {
            sum += sign * digits[i];
            sign *= -1; // alternate sign
        }

        return sum;
    }
}

