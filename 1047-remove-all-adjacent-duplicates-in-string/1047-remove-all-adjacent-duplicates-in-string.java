class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }else if(c==(st.peek())){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}