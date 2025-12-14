class Solution {
    private int cntV(String s){
        int cnt=0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cnt++;
            }
        }
        return cnt;
    }
    public String reverseWords(String s) {
        String p=s;
        String[] words=s.split(" ");
        int tar=cntV(words[0]);
        for(int j=1;j<words.length;j++){
            if(cntV(words[j])==tar){
                words[j]=new StringBuilder(words[j]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
}
