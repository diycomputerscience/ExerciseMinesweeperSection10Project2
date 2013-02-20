package com.diycomputerscience.minesweeper;

public class Point {

	public final int row;
	public final int col;
	
	public Point(int row, int col) {
		this.row = row;
		this.col = col;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "[" + this.row + ", " + this.col + "]";
	}
	
}
