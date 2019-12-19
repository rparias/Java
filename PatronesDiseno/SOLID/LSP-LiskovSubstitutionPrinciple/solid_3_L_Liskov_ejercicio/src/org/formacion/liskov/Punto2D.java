package org.formacion.liskov;

public class Punto2D {

	protected final int x;
	protected final int y;
	
	public Punto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Punto2D other = (Punto2D) obj;
		return x == other.x && y == other.y;
	}
	
	public double distancia (Punto2D otro) {
		int distX = x - otro.x;
		int distY = y - otro.y;
		return Math.sqrt( distX * distX + distY * distY);
	}

	@Override
	public String toString() {
		return "Punto2D [x=" + x + ", y=" + y + "]";
	}
	
	
}
