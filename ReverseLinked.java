
public class ReverseLinked {
  public static void main(String[] args) {
    ListNode ls = new ListNode(7, new ListNode(4, new ListNode(9)));
    System.out.println(reverse(ls));

  }

  static ListNode reverse(ListNode head) {
    ListNode new_head = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = new_head;
      new_head = head;
      head = next;
    }
    return new_head;
  }
}

class ListNode {
  int data;
  ListNode next;

  ListNode() {}

  ListNode(int data) {
    this.data = data;
  }

  ListNode(int data, ListNode next) {
    this.data = data;
    this.next = next;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder(String.valueOf(this.data));
    ListNode curr = next;
    while (curr != null) {
      sb.append(" -> ");
      sb.append(String.valueOf(curr.data));
      curr = curr.next;
    }
    return sb.toString();
  }
}
