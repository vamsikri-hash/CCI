
import java.io.*;
import java.util.*;
class HASUNIQUE {
    public static boolean has_unique(String s){
        boolean arr[]= new boolean[256];
        for(char c: s.toCharArray()){
            if(arr[c]) return false;
            arr[c]=true;
        }
        return true;
    }

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            System.out.println(has_unique(inputLine[0]));
		}
	}
}



