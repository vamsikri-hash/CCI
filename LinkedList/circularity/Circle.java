import java.util.*;
class LinkedList {
     int length;
    Node head;
    class Node {
        int val;
        Node next;
        Node(int x) {
            this.val = x;
        }    
    }
    
    public LinkedList(){
        this.length = 0;
        this.head = null;
    }
    
    public void append(int val) {
      Node nn = new Node(val);
      Node temp =head;
      if(temp==null){
        head=nn;
      } else {
         while(temp.next!=null) {
        temp=temp.next;
      }
        temp.next=nn;
      } 
      this.length++;
    }
  
   public Node  Iscircular(){
      Node n1 = head;
      Node n2 = head;
    
     while (n2.next != null) {
     n1 = n1.next;
     n2 = n2.next.next;
     if (n1 == n2) {
     break;
     }
     }
    
    
     if (n2.next == null) {
       return null;
     }

     n1 = head;
     while (n1 != n2) {
     n1 = n1.next;
     n2 = n2.next;
     }

     return n2;
   }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
          System.out.println(temp.val);
          temp=temp.next;
        }
     }
  }
  
  
class Circle
{  
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    LinkedList ls = new LinkedList();
    int e;
    do{
      e=sc.nextInt();
      if(e>-1){
        ls.append(e);
      }
    } 
    while(e>-1);
    System.out.println(ls.Iscircular());
   
  }
}
