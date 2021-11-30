package lgs.lviv.ua;

import java.util.Scanner;

import lgs.lviv.ua.Collection.Forward;

public class IreratorApp {
	public static void main(String[] args) {
		int n;
		Number arr[];
		Scanner in = new Scanner(System.in);
		System.out.print("Введіть размір массиву : ");
		n = in.nextInt();
		arr = new Number[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * n);
		Collection collection = new Collection(arr);
		System.out.println("Вітаємо, масив за вашим розміром " + n + " створено. ");
		for (Number number : arr) {
			System.out.println(number);
		}
		System.out.println("Заміна непарних елементів на нуль ");
		Iterator iteratorforward = collection.createForward();
		while (iteratorforward.hasNext()) {
			Integer next = (Integer) iteratorforward.next();
			if (next % 2 != 0) {
				System.out.println("null");
			} else
				System.out.println(next);
		}

		System.out.println("Вивід від останнього до першого значення через одну цифру.");
		Iterator iteratorbackward = collection.createBackward();
		while (iteratorbackward.hasNext()) {
			Integer next = (Integer) iteratorbackward.next();
			System.out.println(next);
		}

	}
}
