class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else if(ch=='%'){
                sb.reverse();
            }else if(ch=='#'){
                sb.append(sb.toString());
            }else{
                sb.append(ch);
            }
        }
        String res=sb.toString();
        return res;
        
    }
}
