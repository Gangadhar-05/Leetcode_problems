class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");
    String res=word[word.length-1];
    return res.length();
    }
}
