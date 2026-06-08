class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer,Integer> freq=new HashMap<>();
      ArrayList<Integer> list=new ArrayList<>();
      int n=nums.length;
      
      for(int num:nums){
        freq.put(num,freq.getOrDefault(num,0)+1);
      }
      for(int key:freq.keySet()){
        if(freq.get(key)>n/3){
            list.add(key);
        }
      }
      return list;
    }
}
