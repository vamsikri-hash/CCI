import java.util.*;

class SortStack{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int e;
       Stack<Integer> st = new Stack<>();
      do {
        e=sc.nextInt();
        if(e>-1) {
         st.push(e); 
        }
      } 
      while(e>-1);
       
      Stack<Integer> buf = new Stack<>();
      while(!st.isEmpty()){
          int temp=st.pop();

          while(!buf.isEmpty() && temp>buf.peek()){
              st.push(buf.pop());
          }
          buf.push(temp);
      }

      while(!buf.isEmpty()){
          System.out.println(buf.pop());
      }
      
    }
}

