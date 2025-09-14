class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        int sum;
        for(int i=0;i<tasks.length;i++){  
         sum=tasks[i][0]+tasks[i][1];   
        min=Math.min(sum,min);
    }
   
    return min;
        
        
    }
}
