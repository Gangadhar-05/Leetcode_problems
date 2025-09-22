class Solution {
    public int maxFrequencyElements(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int eachnum:nums){
             if(map.containsKey(eachnum)){
            map.put(eachnum,map.get(eachnum)+1);

        }else{
            map.put(eachnum,1);

        }
         }

         int max=0;
         for(int val:map.values()){
           max=Math.max(val,max);
         }

         int total=0;
         for(int val:map.values()){
            if(max==val){
                total+=val;
            }
         }
         return total;
         
        
    }
}
