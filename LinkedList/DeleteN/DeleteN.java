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
    public void rem(Node node){


        Node nex=node.next;
        node.data=nex.data;
        node.next=nex.next;
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
    
    
    
      
  }
}
