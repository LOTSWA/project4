package hw4.maze.Grid;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import hw4.maze.Cell.Cell;
import hw4.maze.Cell.Side;
import hw4.maze.CellComponents.CellComponents;
import hw4.maze.Row.Row;

public class Grid {
	
	private final List<Row> rows;
	private final int size;
	private final Random random;
	
	public Grid() {
		random = new Random();
		size = 3 + random.nextInt(5);
		
		rows = new ArrayList<>();
		
		for(int i = 0; i<size; i++) {
			rows.add(new Row(size));
		}
		generateComponents();
	}
	
	private void generateComponents() {
		
		int exitRow = random.nextInt(size);
		Cell exitCell = rows.get(exitRow).GetCell(0);
		exitCell.setComponent(Side.LEFT, CellComponents.EXIT);
		
		for (int i = 0; i < size; i++) {
			
			Row row = rows.get(i);
			for ( int j = 0; j<size; j++) {
				Cell cell = row.GetCell(j);
				if(j != 0 || i != exitRow) {
					apertureCheck(cell);
				}
			}
		}
		
	}

	private void apertureCheck(Cell cell) {
		Side[] sides = Side.values();
		Side dir = sides[random.nextInt(sides.length)];
		cell.setComponent(dir, CellComponents.APERTURE);
		
	}
	
	public Cell getCell(int row, int col) {
		return rows.get(row).GetCell(col);
	}
	
	public int size() {
		return size;
	}
	
	public List<Row> getRows(){
		return rows;
	}
	
	public void printGrid(int agentRow, int agentCol) {
		
		for (int i= 0; i< size; i++) {
			Row row = rows.get(i);
			for (int j = 0; j < size; j++) {
				if(i == agentRow && j == agentCol) {
					System.out.print("A");
				}
				else {
					Cell cell = row.GetCell(i);
					CellComponents left = cell.getComponent(Side.LEFT);
					System.out.print(left == CellComponents.EXIT ? "E" : "S");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
