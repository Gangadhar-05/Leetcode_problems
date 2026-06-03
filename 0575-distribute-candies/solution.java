class Solution {
    public int distributeCandies(int[] candyType) {
        int max=candyType.length/2;
        HashSet<Integer> set=new HashSet<>();
        for(int i:candyType){
            set.add(i);
        }
        int types=set.size();
        if(types<max)return types;
        else return max;
        


        
    }
}
