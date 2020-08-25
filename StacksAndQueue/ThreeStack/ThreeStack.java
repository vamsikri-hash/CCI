
import java.io.*;
import java.util.*;
//one way
class Stack {
    int top1;
    int top2;
    int top3;
    int arr[]=new arr[1000];
    Stack() {
        top1=-1;
        top2=500;
        top3=1000;
    }

   public void push1 (int val) {
      if(top1<top2){
          arr[++top1]=val;
      } else{
          System.out.println("stack is full");
      }
    }
   public void push2 (int val) {
    if(top2<top3){
        arr[++top2]=val;
    } else{
        System.out.println("stack is full");
    }
    }
   public void push3 () {
    if(top2<top3){
        arr[--top3]=val;
    } else{
        System.out.println("stack is full");
    }
    }
    public void pop1 () {
       if(top1==-1){
           System.out.println("Stack is empty");
       } else {
        System.out.println(arr[top1--]);
       }
    }
   public void pop2 () {
    if(top2==500){
        System.out.println("Stack is empty");
    } else {
        System.out.println(arr[top2--]);
    }
    }
   public void pop3 () {
    if(top3==1000){
        System.out.println("Stack is empty");
    } else {
        System.out.println(arr[top3++]);
    }
    }
}

class Stack2 {
    int stacksize;
    int stackpointer;
    int buffer[];
    Stack2(int siz){
        int stacksize=siz;
        int stackpointer[]={0,0,0};
        int buffer[]=new int[3*stacksize];
    }

    public void push(int stnum,int val) {
        stackpointer[stnum]++;
        int ind=stnum*stacksize+stackpointer[stnum];
        buffer[ind]=val;
    }

    public int pop(int stnum) {
        int ind=stnum*stacksize+stackpointer[stnum];
        stackpointer[stnum]--;
        int value=buffer[ind];
        buffer[ind]=0;
        return value;
    }

    public int peek(int stnum) {
        int ind=stnum*stacksize+stackpointer[stnum];
        return buffer[ind];
    }

    public boolean isEmpty(int stnum) {
        return stackpointer[stnum]==0;
    }
    public boolean isFull(int stnum) {
        return stackpointer[stnum]==(stnum+1)*stacksize;
    }
}
class ThreeStack{
    

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
		}
	}
}



