package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n,x;
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] mat = new int[m][n];
		for(int i = 0 ; i<mat.length; i++) {
			for(int j = 0; j< mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		x = sc.nextInt();
		for(int i = 0 ; i<mat.length; i++) {
			for(int j = 0; j< mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição "+ i + "," + + j + ":");
					if(j - 1 >= 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if(j+1 < n) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if(i - 1 >= 0) {
						System.out.println("Cima: " + mat[i-1][j]);
					}
					if(i + 1 < m) {
						System.out.println("Baixo: " + mat[i+1][j]);
					}
					
				}
			}
		}
		sc.close();
	}

}
