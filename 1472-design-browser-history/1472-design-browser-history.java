class ListNode{
    ListNode prev;
    ListNode next;
    String data;
    ListNode(String data){
        this.prev=this.next=null;
        this.data=data;
    }

}

class BrowserHistory {
    ListNode curr;
   
    public BrowserHistory(String homepage) {
        curr=new ListNode(homepage);     
    }
    
    public void visit(String url) {
        ListNode newNode=new ListNode(url);
        newNode.prev=curr;
        curr.next=newNode;
        curr=newNode;   
    }
    
    public String back(int steps) {
        while(steps > 0 && curr.prev != null){
            curr=curr.prev;
            steps--;
        }
        return curr.data;
    }

    public String forward(int steps) {
         while(steps > 0 && curr.next != null){
            curr=curr.next;
            steps--;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */