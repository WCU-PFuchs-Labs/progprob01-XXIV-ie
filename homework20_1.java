/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
public class homework20_1
{
   public static void main(String[] args)
   {
      
Scanner sc = new Scaner (System.in);
LinkedList llist = new LinkedList();
      for (int i=0; i<5; i++){
         int x = sc.nextInt();
         llist.insertSorted(x);
      
   }
      deleteDuplicates(list);
      System.out.println(llist);
   }
   public static void deleteDuplicates(LinkedList llist)
   {
      ListNode cur = llist.head;
      while (cur != null && cur.next != null){
         if (cur.value == cur.next.value){
            cur.next = cur.next.next;

   }else{
            cur=cur.ext;

}
      }
   }
}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
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
