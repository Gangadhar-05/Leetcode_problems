class Solution {
    public int[] scoreValidator(String[] events) {
        int cnt=0;
        int score=0; 
        for(int i=0;i<events.length;i++){
            if(cnt <10){
            if(events[i].equals("0") || events[i].equals("1") ||  events[i].equals("2") ||  events[i].equals("3") ||  events[i].equals("4") ||  events[i].equals("5") ||  events[i].equals("6")  ){
                score+=Integer.parseInt(events[i]);
            }else if(events[i].equals("W") )cnt++;
            else score++;
        }
        }
        int[] ans=new int[2];
        ans[0]=score;
        ans[1]=cnt;
        return ans;
    }
}
