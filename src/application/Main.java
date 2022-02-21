package application;
import java.util.Scanner;

import entities.Matriz;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de rows: ");
		int rows = sc.nextInt();
		System.out.println();
		
		System.out.print("Digite o n�mero de columns: ");
		int columns = sc.nextInt();
		System.out.println();
		
		Matriz mtz = new Matriz(rows, columns);
		mtz.getMatriz();
		System.out.println();
		
		System.out.print("Digite o elemento selecionado dentro da lista: ");
		int el  = sc.nextInt();
		//getPositionOfElement deve ser executada primeiro porque o algoritmo depende da posi��o do elemento para definir as outras;
		int positions = mtz.getPositionOfElement(el).size();
		System.out.println("Posi��o do elemento selecionado: "+ mtz.getPositionOfElement(el));
		for(int i = 0; i < positions ; i+=2) {
			System.out.println();
			//Verificar se existe mult�plas posi��es do elemento no array
			System.out.println("Elemento a esquerda: "+ mtz.getLeftPositionOfElement());
		
			System.out.println("Elemento a direita: "+ mtz.getRightPositionOfElement());
		
			System.out.println("Elemento no topo: "+ mtz.getTopPositionOfElement());
		
			System.out.println("Elemento embaixo: "+ mtz.getBottomPositionOfElement());
			
			System.out.println();
			mtz.nextPosition();
		}
		sc.close();
	}
}
