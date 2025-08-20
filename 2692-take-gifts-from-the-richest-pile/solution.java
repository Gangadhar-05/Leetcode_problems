class Solution {
    public long pickGifts(int[] gifts, int k) {
        for(int i=0;i<k;i++)
        {
            int max = 0;
            int index = 0;
            for(int j=0;j<gifts.length;j++)
            {
                if(max < gifts[j])
                {
                    max = gifts[j];
                    index = j;
                }  
            }
            int temp = (int)Math.sqrt(gifts[index]);
            gifts[index]=temp;
        }
        long result = 0;
        for(int num : gifts)
        {
            result += num;
        }
        return result;
        
    }
}
