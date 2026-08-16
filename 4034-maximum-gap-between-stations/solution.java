class Solution {
    public int maximumGap(String skill, String station) {
        int n=skill.length();
        int m=station.length();
        int[] earliestFit=new int[n];
        int[] latestFit=new int[n];
        int ptr=0;
        for(int w=0;w<n;w++){
            while(station.charAt(ptr)!=skill.charAt(w)){
                ptr++;
            }
            earliestFit[w]=ptr;
            ptr++;
        }
        ptr=m-1;
        for(int w=n-1;w>=0;w--){
            while(station.charAt(ptr)!=skill.charAt(w)){
                ptr--;
            }
            latestFit[w]=ptr;
            ptr--;
        }
        int maxGap=0;
        for(int w=1;w<n;w++){
            maxGap=Math.max(maxGap,latestFit[w]-earliestFit[w-1]);
            
        }
        return maxGap;
        
        
    }
}
