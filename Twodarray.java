
import java.util.*;

public class Twodarray{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();	
	int[][] a = new int[n][m];

	//store input
	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			a[i][j] = sc.nextInt();
		}
			
	}

	// how to print
	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	
	}



	}


}