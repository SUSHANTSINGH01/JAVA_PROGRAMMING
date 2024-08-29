class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        
        Node slow=head;
        Node fast=head;
        int res=1;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            break;
        }
        
        if(fast==null || fast.next==null)
        return 0;
        
        while(slow!=fast.next)
        {
            res++;
            fast=fast.next;
        }
        
        return res;
    }
}
