package Tetris;

public class Tetromino extends Cell {

	Cell[] cells;

	public Tetromino() {
		cells = new Cell[4];
	}

	// ˳ʱ���ӡ����С�������
	public void print() {
		String str = "";
		for (int i = 0; i < cells.length; i++) {
			str += cells[i].getCellInfo() + " ";
		}
		System.out.println(str);
	}

	public void drop() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].drop();
		}
	}

	public void moveLeft() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].moveLeft();
		}
	}

	public void moveRight() {
		for (int i = 0; i < cells.length; i++) {
			cells[i].moveRight();
		}
	}

	public static void printTet(Tetromino tetromino) {
		int totalRow = 20;
		int totalCol = 10;
		// ��ȡ������״�д洢���ĸ�С�������
		Cell[] cells = tetromino.cells;

		for (int row = 1; row <= totalRow; row++) {
			for (int col = 1; col <= totalCol; col++) {

				// �����жϸ�λ���Ƿ������cells������
				boolean isIncells = false;
				for (int i = 0; i < cells.length; i++) {
					if (cells[i].getRow() == row && cells[i].getCol() == col) {
						System.out.print("��" + " ");
						isIncells = true;
						break;
					}
				}
				if (!isIncells) {
					System.out.print("��" + " ");
				}
			}
			System.out.print(row + "\n");
		}
	}
	
	public static void main(String[] args) {
		Tetromino t = new Z(1, 1);
		printTet(t);
		t.drop();
		printTet(t);
	}

}
