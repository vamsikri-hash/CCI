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
    
  public void searchN(int n) {
     Node first= head,second=head;
      for(int i=0;i<n;i++){
             if(second.next==null) {
                 if (i == n - 1)  
                    System.out.println(head.val+" is the nth node element in the list");
                     return; 
             }
             second=second.next;
         }
          while (second.next != null) { 
            first = first.next; 
            second = second.next; 
        }
        System.out.println(first.next.val+ " is the nth node element in the list");
  }
  }
  
  
class NfromE
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
    System.out.println("Enter the nth node:");
    int n=sc.nextInt();
    if(n>ls.length) {
      System.out.println("There is no nth node in the list");
    } else {
     ls.searchN(n); 
    }
    
    
      
  }
}
