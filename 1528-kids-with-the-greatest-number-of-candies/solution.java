class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        
        int max=candies[n-1];
        for(int x:candies){
            max=Math.max(max,x);
        }
        ArrayList<Boolean> res=new ArrayList<>();
        for(int x:candies){
            if(x+extraCandies>=max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
        
    }
}
