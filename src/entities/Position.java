package entities;

import java.util.*;

public abstract class Position {
	
	protected int[][] matriz;
	protected int rows;
	protected int columns;
	private ArrayList<Integer> position;

	public ArrayList<Integer> getPositionOfElement(int element) {
		ArrayList<Integer> res = new ArrayList<>();
		for(int i = 0; i < matriz.length; i++) {
			for(int y = 0; y < matriz[i].length; y++) {
				if(matriz[i][y] == element) {
					//row
					res.add(i);
					//column
					res.add(y);
				}
			}
		}
		this.position = res;
		return this.position;
	}
	
	public int getLeftPositionOfElement() {
		int position = this.position.get(1) - 1;
		int row = this.position.get(0);
		if(position >= 0) {
			return matriz[row][position];
		} 
		return -1;
	}
	
	public int getRightPositionOfElement() {
		int position = this.position.get(1) + 1;
		int row = this.position.get(0);
		if(position <= columns - 1) {
			return matriz[row][position];
		} 
		return -1;
	}
	
	public int getTopPositionOfElement() {
		int position = this.position.get(0) - 1;
		int column = this.position.get(1);
		if(position >= 0) {
			return matriz[position][column];
		} 		
		return -1;
	}
	
	public int getBottomPositionOfElement() {
		int position = this.position.get(0) + 1;
		int column = this.position.get(1);
		if(position <= rows - 1) {
			return matriz[position][column];
		} 			
		return -1;
	}	
	
	public void nextPosition() {
		this.position.remove(0);
		this.position.remove(0);
	}
	
}
