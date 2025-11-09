import java.util.Scanner;

public class homework20_1
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      LinkedList llist = new LinkedList();

      for (int i = 0; i < 5; i++) {
         int x = sc.nextInt();
         llist.insertSorted(x);
      }

      deleteDuplicates(llist);

      System.out.println(llist);
   }

   public static void deleteDuplicates(LinkedList llist)
   {
      ListNode cur = llist.head;
      while (cur != null && cur.next != null) {
         if (cur.value == cur.next.value) {
            cur.next = cur.next.next;
         } else {
            cur = cur.next;
         }
      }
   }
}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){ value = v; }
}

class LinkedList
{
   ListNode head;

   public void insertSorted(int v) {
      ListNode node = new ListNode(v);
      if (head == null || v <= head.value) {
         node.next = head;
         head = node;
         return;
      }
      ListNode prev = head;
      while (prev.next != null && prev.next.value <= v) {
         prev = prev.next;
      }
      node.next = prev.next;
      prev.next = node;
   }

   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
