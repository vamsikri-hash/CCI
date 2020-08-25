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
  
  public void removeN() {
    HashSet<Integer> hs = new HashSet<>();
    Node temp =head;
    Node prev=null;
    while(temp!=null) {
     if(hs.contains(temp.val)) {
       prev.next=temp.next;
     } else {
      hs.add(temp.val);
       prev=temp;
     }
     
     temp=temp.next;
    }
}
    public void removeWithoutBuffer() {
       if(head==null) return;

       Node prev = head;
       Node curr=prev.next;

       while(curr!=null){
           Node scan=head;
           while(scan!=curr){
               if(scan.val==curr.val){
                   Node tmp=curr.next;
                   prev.next=curr.next;
                   curr=tmp;
                   break;
               }
               scan=scan.next;
               
           }
           if(scan==curr){
            prev=curr;
            curr=curr.next;
           }
       }
  }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
          System.out.println(temp.val);
          temp=temp.next;
        }
     }
  }
  
  
class RemoveD
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
    System.out.println("Linked list before removal of duplicates");
    ls.display();
    System.out.println("Linked list after removal of duplicates");
    ls.removeWithoutBuffer();
    ls.display();
  }
}
