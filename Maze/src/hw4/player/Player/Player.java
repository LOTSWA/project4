package hw4.player.Player;

import hw4.maze.Grid.Grid;

public class Player {
	private int row, col;
	private final Grid grid;
	
	
	
	public Player(Grid grid) {
		this.grid = grid;
		this.row = grid.size() -1;
	}

}
