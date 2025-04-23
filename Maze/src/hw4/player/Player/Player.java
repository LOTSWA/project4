package hw4.player.Player;

import hw4.maze.Cell.Cell;
import hw4.maze.Cell.Side;
import hw4.maze.CellComponents.CellComponents;
import hw4.maze.Grid.Grid;

public class Player {
	private int row, col;
	private final Grid grid;
	
	
	
	public Player(Grid grid) {
		this.grid = grid;
		this.row = grid.size() -1;
	}
	
	public boolean move(Side dir) {
		Cell
		 current = grid.getCell(row, col);
		if (current.getComponent(dir)== CellComponents.WALL) 
		{
			return false;
		}
		
		switch (dir) {//undertale
		case UP:
			if(row > 0) row--;
			break;
		case DOWN:
			if(row< grid.size() - 1) row++;
			break;
		case LEFT:
			if(col> 0) col--;
			else if (current.getComponent(Side.LEFT)== CellComponents.EXIT) return true;
			break;
		case RIGHT:
			if (col<grid.size()-1) col++;
			break;
		
		}
		return false;
	}

	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
}
