
import java.io.*;
import java.util.*;
class Anagrams{

    public static boolean isAnagrams(String s1,String s2){
            if(s1.length()!=s2.length()) return false;
             int arr[]=new int[256];
             for(int i=0;i<s1.length();i++){
                 char c=s1.charAt(i);
                 char cc=s2.charAt(i);
                 arr[c]++;
                 arr[c]--;
             }

             for(int j=0;j<256;j++){
                 if(arr[j]!=0) return false;
             }
             return true;
    }

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            System.out.println(isAnagrams(inputLine[0],inputLine[1]));
		}
	}
}



