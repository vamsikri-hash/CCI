
import java.io.*;
import java.util.*;
class Replace{

    public static String replac(String s1){
        
            return s1.replaceAll("\\s+","%20");

    }

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
            String inputLine = br.readLine().trim();
            System.out.println(replac(inputLine));
		}
	}
}



