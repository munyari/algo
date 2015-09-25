// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtMiddle(ListNode head, int position) {
    // Add your code below this line. Do not modify any other code.    
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
    // Add your code above this line. Do not modify any other code.
}