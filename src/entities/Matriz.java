package entities;

import java.util.Scanner;

public class Matriz extends Position {
	
	public Matriz(int rows, int columns) {
		Scanner sca = new Scanner(System.in);
		/*rows e columns serao utilizadas para localizar a posicao do elemento */
		this.rows = rows;
		this.columns = columns;
		
		matriz = new int[rows][columns];
		for(int i = 0; i < matriz.length; i++) {
			for(int y = 0; y < matriz[i].length; y++) {
				System.out.printf("Digite o valor para a posição [%d][%d]: ", i, y);
				int value = sca.nextInt();
				System.out.println();
				matriz[i][y] = value;
			}
		}
		
		
	}	
	
	public void getMatriz() {
		System.out.print('[');
		for(int i = 0; i < matriz.length; i++ ) {
			
			System.out.println();
			
			for(int y = 0; y < matriz[i].length; y++ ) {
				System.out.printf(" %d ", matriz[i][y]);
			}
			
		}
		System.out.println();
		System.out.print(']');
		System.out.println();
	}
	
}
