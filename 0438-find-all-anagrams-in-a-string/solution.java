class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();

        int n = s.length();
        int l = p.length();

        if (l > n) return res;

        HashMap<Character, Integer> pmap = new HashMap<>();

        for (char c : p.toCharArray()) {
            pmap.put(c, pmap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> smap = new HashMap<>();

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            smap.put(c, smap.getOrDefault(c, 0) + 1);
        }

        if (smap.equals(pmap)) {
            res.add(0);
        }

        int left = 0;
        int right = l;

        while (right < n) {

           
            char remove = s.charAt(left);
            smap.put(remove, smap.get(remove) - 1);

            if (smap.get(remove) == 0) {
                smap.remove(remove);
            }

           
            char add = s.charAt(right);
            smap.put(add, smap.getOrDefault(add, 0) + 1);

            left++;
            right++;

            if (smap.equals(pmap)) {
                res.add(left);
            }
        }

        return res;
    }
}
