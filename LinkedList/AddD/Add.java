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
    

  }
  
  
class Add
{  
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    LinkedList ls = new LinkedList();
    LinkedList ls2 = new LinkedList();
    int e;
    do{
      e=sc.nextInt();
      if(e>-1){
        ls.append(e);
      }
    } 
    while(e>-1);
    int ee;
    do{
      ee=sc.nextInt();
      if(ee>-1){
        ls2.append(ee);
      }
    } 
    while(ee>-1);
    LinkedList ld = new LinkedList();
    int c=0;
    while(ls.head!=null && ls2.head!=null){

        ld.append((ls.head.val+ls2.head.val)%10+c);
        c=(ls.head.val+ls2.head.val)/10;
        ls.head=ls.head.next;
        ls2.head=ls2.head.next;
    }
    while(ls.head!=null){
        ld.append(ls.head.val);
        ls.head=ls.head.next;
    }
    while(ls2.head!=null){
        ld.append(ls2.head.val);
        ls2.head=ls2.head.next;
    }

    while(ld.head!=null){
        System.out.println(ld.head.val);
        ld.head=ld.head.next;
    }
     
  }
}


