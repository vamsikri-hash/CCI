
import java.io.*;
import java.util.*;
class RemoveD{
    public static String removed(String s){
        boolean arr[]= new boolean[256];
        StringBuffer sb = new StringBuffer();
        for(char c: s.toCharArray()){
           
             if(!arr[c]) sb.append(c);
             arr[c]=true;
        }
        return sb.toString();
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            System.out.println(removed(inputLine[0]));

		}
	}
}



