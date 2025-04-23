package hw4.maze.Cell;
/*cell for the map
 * 
 * */
import java.util.EnumMap;
import java.util.Map;

import hw4.maze.CellComponents.CellComponents;

public class Cell {
		
	
		private final Map<Side, CellComponents> components;
		
		public Cell() {
			components = new EnumMap<>(Side.class);
			for (Side dir : Side.values()) {
				
				components.put(dir, CellComponents.WALL);
			}
			
		}
		
		public void setComponent(Side dir, CellComponents type) {
			
			components.put(dir, type);
		}
		
		public CellComponents getComponent(Side dir) {
			return components.get(dir);
		}
		
		public boolean hasAperture() {
			for (CellComponents type : components.values()) {
				if(type == CellComponents.APERTURE || type == CellComponents.EXIT)
					return true;
			}
			return false;
			
			
		}

}
