
public ListNode deleteAtMiddle(ListNode head, int position) {
    if (position == 1)
    {
        return head.next;
    }
    if (head == null)
    {
        return null;
    }
    int index = 1;
    ListNode curr = head;
    ListNode prev = null;
    while (index++ < position && curr != null)
    {
        prev = curr;
        curr = curr.next;
    }
    if (curr != null) {
        prev.next = curr.next;
        curr.next = null;
    }
    
    
    return head;
}
