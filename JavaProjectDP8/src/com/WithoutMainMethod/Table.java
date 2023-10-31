package com.WithoutMainMethod;

import java.util.Scanner;

public class Table {
	public void TableOfAnyNum(int a) {
		int table;
		for (int i = 1; i <= 10; i++) {
			table = i * a;
			System.out.println(table);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num = sc.nextInt();
		Table obj = new Table();
		obj.TableOfAnyNum(num);

	}

}
