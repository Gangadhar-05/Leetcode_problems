class Solution {

    public boolean isLetter(char ch) {
        if ((ch >= 'a' && ch <= 'z') || 
            (ch >= 'A' && ch <= 'Z')) {
            return true;
        }
        return false;
    }

    public String reverseOnlyLetters(String s) {
        int l = 0;
        int r = s.length() - 1;

        char[] arr = s.toCharArray();

        while (l < r) {

            if (isLetter(arr[l]) && isLetter(arr[r])) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;

            } else if (isLetter(arr[l])) {
                r--;

            } else {
                l++;
            }
        }

        return new String(arr);
    }
}
