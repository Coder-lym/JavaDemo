package Tetris;

import java.util.Scanner;

public class CellGame {
	public static Tetromino tetromino;

	// ��������
	public static void method() {

		Scanner scanner = new Scanner(System.in);
		String index = scanner.next();

		switch (index) {
		case "s":
			tetromino.drop();
			System.out.println("----����  Tetromino----");
			Tetromino.printTet(tetromino);
			System.out.println("�����������");
			break;
		case "a":
			tetromino.moveLeft();
			System.out.println("----����  Tetromino----");
			Tetromino.printTet(tetromino);
			System.out.println("�����������");
			break;
		case "d":
			tetromino.moveRight();
			System.out.println("----����  Tetromino----");
			Tetromino.printTet(tetromino);
			System.out.println("�����������");
			break;
		default:
			System.out.println("������Ч�����������룺");
			break;
		}

	}

	public static void main(String[] args) {
		Tetromino t = new T(1, 4);
		tetromino = t;
		System.out.println("----����  Tetromino----");
		Tetromino.printTet(t);
		System.out.println("���������ִ����Ӧ������S-���ƣ�A-���ƣ�D-����");

		while (t.cells[3].getRow() < 20 && t.cells[2].getCol() < 10 && t.cells[0].getCol() > 1) {
			method();
			if (t.cells[3].getRow() == 20) {
				System.out.println("�����ˣ���Ϸ������");
			} else if (t.cells[0].getCol() == 1) {
				System.out.println("�����ˣ���ִ������������");
				method();
			} else if (t.cells[2].getCol() == 10) {
				System.out.println("�����ˣ���ִ������������");
				method();
			} 

		}

	}
}
