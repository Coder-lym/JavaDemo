package Tetris;

public class T extends Tetromino{
	
	public T(int row,int col) {
		super();
		cells[0] = new Cell(row,col);
		cells[1] = new Cell(row,col+1);
		cells[2] = new Cell(row,col+2);
		cells[3] = new Cell(row+1,col+1);
	}

}
