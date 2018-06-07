package org.cinematics.model;

public class Seat{
	public int row;
	public int col;

	public Seat(int row, int col) {
		this.row = row;
		this.col = col;
	}

	@Override
	public boolean equals(Object o) {
		return (row == ((Seat)o).row && col == ((Seat)o).col);
	}
}