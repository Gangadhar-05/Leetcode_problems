class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int[] arr=new int[map.size()];
        int ind=0;
        for(int key:map.values()){
            arr[ind++]=key;
        }
        Arrays.sort(arr);
        int cnt=0;
        int ans=0;
        int r=1;
        for(int i=arr.length-1;i>=0;i--){
            if(cnt==8){
                cnt=0;
                r++;
            }
            ans+=(r*arr[i]);
            cnt++;
        }
        return ans;
    }
}
