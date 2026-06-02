class Solution {
    public int[] intersection(int[] nums1, int[] nums2)  {
       HashSet<Integer> set=new HashSet<>();
       for(int i:nums1){
        set.add(i);
       }
       HashSet<Integer> res=new HashSet<>();
      for(int j:nums2){
        if(set.contains(j)){
            res.add(j);
        }
      }
      int[] arr=new int[res.size()];
      int i=0;
      for(int num:res){
        arr[i++]=num;
      }
      return arr;
    }
}
