class Solution {
    public int scoreOfString(String s) {
    // int sum=0;
    // int k;
    // for(int i=1;i<s.length();i++){
    //     if((int)s.charAt(i-1)<(int)s.charAt(i))
    //     k=(int)s.charAt(i)-(int)s.charAt(i-1);
    //     else k=(int)s.charAt(i-1)-(int)s.charAt(i);
    //     sum+=k;
    int sum=0;
    for(int i=0;i<s.length()-1;i++){
        sum+=Math.abs(s.charAt(i)-s.charAt(i+1));
    }
    
     return sum;
     }
}
