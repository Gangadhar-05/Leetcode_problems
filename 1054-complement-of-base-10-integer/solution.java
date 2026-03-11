class Solution {
    public int bitwiseComplement(int n) {
       String bs=Integer.toBinaryString(n);
       StringBuilder sb=new StringBuilder();
       for(char c:bs.toCharArray()){
        if(c=='0'){
        sb.append('1');
        }else{
        sb.append('0');
        }
       }
       int num=Integer.parseInt(sb.toString(),2);
       return num;
    }
}
