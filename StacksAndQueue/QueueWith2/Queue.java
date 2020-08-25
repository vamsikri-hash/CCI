class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public MyQueue() {
        
    }
    public void push(int x) {
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(x);
          while(!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
    public int pop() {
      return st1.pop();
    }

    public int peek() {
        return st1.peek();
    }
    public boolean empty() {
        return st1.isEmpty();
    }
}

class Queue{
    

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
		}
	}
}