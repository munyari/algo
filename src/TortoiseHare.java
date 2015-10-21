package algo.src;

public class TortoiseHare
{
  public Boolean isCyclic(ListNode head)
  {
    if (head == null || head.next == null)
    {
        return false;
    }

    ListNode tortoise = head;
    ListNode hare = head;
    do
    {
        tortoise = tortoise.next;
        if (hare != null)
            hare = (hare.next == null) ? null : hare.next.next;
    } while (hare != null && hare != tortoise);

    return tortoise == hare;
  }
}
