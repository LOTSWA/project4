package hw4.game.Game;

import java.util.Scanner;

import hw4.maze.Cell.Side;
import hw4.maze.Grid.Grid;
import hw4.player.Player.Player;

public class Game {

	public static void main(String[]args)
	{
		Grid grid = new Grid();
		Player player = new Player(grid);
		Scanner scanner = new Scanner(System.in);
		
		boolean Escape = false;
		System.out.println("initial Grid:");
		grid.printGrid(player.getRow(), player.getCol());
		
		while (!Escape) {
			System.out.print("Use WASD to move");
			String input = scanner.nextLine();
			Side dir = null;
			
			switch (input) {
			
			case "w": dir = Side.UP; break;
			case "s": dir = Side.DOWN; break;
			case "a": dir = Side.LEFT; break;
			case "d": dir = Side.RIGHT; break;
			}
			
			if (dir != null) {
				boolean exit = player.move(dir);
				grid.printGrid(player.getRow(), player.getCol());
				if (exit) {
					System.out.println("you got out");
					Escape = true;
				}
				else {
					System.out.println("Invalid input. try using WASD.");
				}
			}
			scanner.close();
		}
		
	}
}
