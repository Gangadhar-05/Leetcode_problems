class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(String op:operations){
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("+")){
                int n1=stack.pop();
                int n2=stack.peek();
                stack.push(n1);
                stack.push(n1+n2);
            }else if(op.equals("D")){
                stack.push(2*stack.peek());
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}