class GfG {
    public static Node partition(Node head, Node last){
        Node pivot=head;
        Node curr=head;
        Node next=head.next;
        while(next!=last){
            if(next.data<pivot.data){
                curr=curr.next;
                int temp=next.data;
                next.data=curr.data;
                curr.data=temp;
            }
            next=next.next;
        }
        int temp=pivot.data;
        pivot.data=curr.data;
        curr.data=temp;
        return curr;
    }
    public static void Quick_Sort(Node head, Node last){
        if(head!=last && head!=null && head.next!=last){
            Node part=partition(head,last);
            Quick_Sort(head,part);
            Quick_Sort(part.next,last);
        }
    }
    public static Node quickSort(Node node) {
        // Your code here
        Quick_Sort(node,null);
        return node;
    }
}
