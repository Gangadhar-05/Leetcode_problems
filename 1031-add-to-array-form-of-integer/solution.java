
import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for (int n : num) {
            sb.append(n);
        }

        BigInteger number = new BigInteger(sb.toString());
        BigInteger numk = BigInteger.valueOf(k);

        number = number.add(numk);

        for (char c : number.toString().toCharArray()) {
            list.add(c - '0');
        }

        return list;
    }
}
