
import java.io.*;
import java.util.*;

class Stack {
    public int[] arr;
    public int top;
 
    Stack() {
         arr=new int[5];
         top=-1;
    }
 
    public void push(int val){
        top++;
        arr[top]=val; 
    }

    public void pop() {
        if(top==-1) {
          System.out.println("Stack Underflow");
          return ;
        }
        System.out.println("The popped element is " +arr[top]);
        top--; 
    }

    public boolean IsEmpty(){
        return top==-1;
    }
    public boolean IsFull(){
        return top==arr.length-1;
    }
 
    public void display() {
        int i= top;
      if(i==-1) {
       System.out.println("Stack is empty");
        return;
      } 
       System.out.println("Stack elements are:");
        while(i>-1) {
         System.out.print(arr[i]);
          System.out.print(" ");
         i--;
        }
    } 
 }

class StackSet {
   

    ArrayList<Stack> ss;
    StackSet(){
       ss=new ArrayList<Stack>();
       ss.add(new Stack());
    }

    public void push(int val) {
      Stack last = ss.get(ss.size()-1);
      if(last.IsFull()){
          ss.add(new Stack());
          ss.get(ss.size()-1).push(val);
      } else{
          last.push(val);
      }
    }
    public void pop() {
        Stack last = ss.get(ss.size()-1);
        if(last.IsEmpty()){
            ss.remove(ss.size()-1);
        } else{
            last.pop();
        }
    }
    public void display(){
        for(int i=0;i<ss.size();i++) {
            ss.get(i).display();
            System.out.println("---------");
        }
    }
}
class SetOfStack{

	public static void main (String[] args) throws IOException {
          Scanner sc = new Scanner(System.in);
          StackSet st = new StackSet();
          int t=sc.nextInt();
          while(t-->0) {
             st.push(sc.nextInt());
          }
          st.display();
	}
}



