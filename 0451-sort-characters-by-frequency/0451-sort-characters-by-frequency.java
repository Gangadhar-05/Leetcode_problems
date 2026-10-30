class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);

        }

       
        Character[] arr = freq.keySet().toArray(new Character[0]);

        Arrays.sort(arr, (a,b) -> freq.get(b) - freq.get(a));


        StringBuilder res=new StringBuilder();
        for(char c : arr){
            for(int j = 0; j < freq.get(c); j++){
                res.append(c);
            }
        }

        return res.toString();
    }
}