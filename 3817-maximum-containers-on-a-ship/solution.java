class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int res=maxWeight/w;
        if(n*n<=res) return n*n;
        else{
            return res;
        }
    }
}
