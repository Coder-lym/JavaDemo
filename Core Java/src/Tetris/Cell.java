package Tetris;

public class Cell {
    private int row;
    private int col;
    
    public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Cell() {
    	this(1,1);
    }
    
    public Cell(int row, int col) {
		this.row=row;
		this.col=col;
	}
    
	public Cell(Cell cell) {
		this(cell.row,cell.col);
	}
	
	
	//����
    public void drop() {
    	row++;
    }
    
    //����
    public void moveLeft() {
    	col--;
    }
    
    //����
    public void moveRight() {
    	col++;
    }
    
    public String getCellInfo() {
		return "��ǰλ�ã�("+row + "," + col+")";
    	
    }
}
