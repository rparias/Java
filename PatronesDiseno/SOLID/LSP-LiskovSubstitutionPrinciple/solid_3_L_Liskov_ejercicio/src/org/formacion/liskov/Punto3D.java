package org.formacion.liskov;

public class Punto3D extends Punto2D {

	private final int z;
	
	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	
	public double distancia (Punto3D otro) {
		int distX = x - otro.x;
		int distY = y - otro.y;
		int distZ = z - otro.z;
		return Math.sqrt( distX * distX + distY * distY + distZ * distZ);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + x;
		result = prime * result + y;
		result = prime * result + z;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		return x == other.x && y == other.y && z == other.z;
	}


	@Override
	public String toString() {
		return "Punto3D [x=" + x + ", y=" + y + ", z = " + z + "]";
	}
	
	

}
