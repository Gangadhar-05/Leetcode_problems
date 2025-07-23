class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxcnt=0;
        int n=sentences.length;
        for(int i=0;i<n;i++){
            String sentence = sentences[i];
            int cnt = 1; 
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    cnt++;
                }
            maxcnt=Math.max(maxcnt,cnt);
        }
        }
        return maxcnt;
    }
}
