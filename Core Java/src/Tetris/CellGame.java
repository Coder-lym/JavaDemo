package Tetris;

import java.util.Scanner;

public class CellGame {
	public static Tetromino tetromino;

	// 操作方法
	public static void method() {

		Scanner scanner = new Scanner(System.in);
		String index = scanner.next();

		switch (index) {
		case "s":
			tetromino.drop();
			System.out.println("----绘制  Tetromino----");
			Tetromino.printTet(tetromino);
			System.out.println("请继续操作：");
			break;
		case "a":
			tetromino.moveLeft();
			System.out.println("----绘制  Tetromino----");
			Tetromino.printTet(tetromino);
			System.out.println("请继续操作：");
			break;
		case "d":
			tetromino.moveRight();
			System.out.println("----绘制  Tetromino----");
			Tetromino.printTet(tetromino);
			System.out.println("请继续操作：");
			break;
		default:
			System.out.println("输入无效！请重新输入：");
			break;
		}

	}

	public static void main(String[] args) {
		Tetromino t = new T(1, 4);
		tetromino = t;
		System.out.println("----绘制  Tetromino----");
		Tetromino.printTet(t);
		System.out.println("请输入序号执行相应操作：S-下移，A-左移，D-右移");

		while (t.cells[3].getRow() < 20 && t.cells[2].getCol() < 10 && t.cells[0].getCol() > 1) {
			method();
			if (t.cells[3].getRow() == 20) {
				System.out.println("到底了，游戏结束！");
			} else if (t.cells[0].getCol() == 1) {
				System.out.println("到边了！请执行其他操作：");
				method();
			} else if (t.cells[2].getCol() == 10) {
				System.out.println("到边了！请执行其他操作：");
				method();
			} 

		}

	}
}
