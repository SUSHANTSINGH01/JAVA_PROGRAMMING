class Solution {
    private Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        head=reverseList(head);
        Node curr=head;
        Node prev=null;
        int carry=1;
        
        while(curr!=null){
            int sum=curr.data+carry;
            carry=sum/10;
            curr.data=sum%10;
            prev=curr;
            curr=curr.next;
        }

        if(carry==1) 
        prev.next=new Node(carry);
        
        return reverseList(head);
    }
}
