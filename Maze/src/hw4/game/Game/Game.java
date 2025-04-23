package hw4.game.Game;

import java.util.Scanner;

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
		grid.printGrid(player.getRow(), player.getcol());
		
		while (!Escape) {
			System.out.print("Use WASD to move");
			String input = scanner.nextLine();
		}
		
	}
}
