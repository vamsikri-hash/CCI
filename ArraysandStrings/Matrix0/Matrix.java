
import java.io.*;
import java.util.*;
class Matrix{

    public static void make0(int arr[][],int m,int n){
        int rows[]=new int[m];
        int col[] = new int[n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    rows[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if(rows[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }
        System.out.println("-------");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){   
                    System.out.println(arr[i][j]);               
            }
        }
        
    }

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
            int m = Integer.parseInt(br.readLine().trim());
            int n = Integer.parseInt(br.readLine().trim());
            int arr[][]=new int[m][n];

            for(int j=0;j<m;j++){
                for(int i=0;i<n;i++){
                    arr[j][i]=Integer.parseInt(br.readLine().trim());
                }
            }
            make0(arr,m,n);
            
		}
	}
}



