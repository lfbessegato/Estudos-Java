package course.capitulo5.application;

import java.util.Scanner;

public class Exemplo_Matrix01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i=0;i<n;i++) {
			System.out.print(mat[i][i]+ " ");
		}
		
		System.out.println();
		int count = 0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("Negative Number: " + count);
		sc.close();
	}

}
