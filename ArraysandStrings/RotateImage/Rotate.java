import java.io.*;
import java.util.*;



class Rotate{
    public static void rotate(int[][] matrix) {
        int res[]=new int[matrix.length*matrix.length];
        int k=0,l=0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=matrix.length-1;j>=0;j--){
                res[k++]=matrix[j][i];
            }
        }
        
         for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=res[l++];
            }
        }
    }

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        int [][]matrix=new int[t][t];
		for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                matrix[i][j]=Integer.parseInt(br.readLine().trim());
            }
        }
        System.out.println("Matrix Before rotation..");
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        rotate(matrix);
        System.out.println("Matrix after rotation..");
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
	}
}



