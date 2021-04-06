// Program opc2: 

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T != 0){
		    int N = sc.nextInt();
		    int  A[][] = new int[N][N];
		    for(int i=0; i<N; i++){
		        for(int j=0; j<N; j++){
		            A[i][j] = sc.nextInt();
		        }
		    }
		    for(int k=0;k<N; k++){
		        int row=0, col=k;
		        while(col>=0){
		            System.out.print(A[row][col] + " ");
		            row++;
		            col--;
		        }
		    }
		    
		    for(int k=1;  k<N; k++){
		        int row=k, col= N-1;
		        while(row <= N-1){
		            System.out.print(A[row][col] + " ");
		            row++;
		            cow--;
		        }
		    }
		    System.out.println();
		    T--;
		}
		
		
	}
}