import java.util.*;


class stack {

  class Node {
       int val;
       int minValue;
       Node next;
       Node(int val, int minValue) {
           this.val = val;
           this.minValue = minValue;
       }
   }

   private Node head;
   private int minValue = Integer.MAX_VALUE;
   public stack() {
       head=null;
   }

   public void push(int x) {
       minValue = Math.min(minValue, x);
       Node node = new Node(x, minValue);
       node.next = head;
       head = node;
   }

   public void pop() {
       head = head.next;
       if (head == null) {
           minValue = Integer.MAX_VALUE;
       } else {
           minValue = head.minValue;
       }
   }

   public int top() {
       return head.val;
   }

   public int getMin() {
       return head.minValue;
   }
}
class StackMin{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int e;
       stack st = new stack();
      do {
        e=sc.nextInt();
        if(e>-1) {
         st.push(e); 
        }
      } 
      while(e>-1);
       st.display();
       st.pop();
       st.display();
       System.out.println("---------");
       System.out.println(st.min());
      
    }
}

