package hw4.maze.Row;

import java.util.ArrayList;
import java.util.List;

import hw4.maze.Cell.Cell;


public class Row {

	
	private final List<Cell> cells;
	
	public Row(int size) {
		cells = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			cells.add(new Cell());
		}
	}
	
	public Cell GetCell(int index) {
		return cells.get(index);
	}
	
	public int size() {
		return cells.size();
	}
	
	public List<Cell> getCells(){
		return cells;
	}
}
