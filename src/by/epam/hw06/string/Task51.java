package by.epam.hw06.string;

import java.util.Random;

/* 51. Дана строка. Вставить после каждого символа два случайных символа. */

public class Task51 {

	public static void main(String[] args) {
		
		String str = "hello";
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			// добавили случайные символы юникода от 33-го до 64-го
			sb.append(str.charAt(i)).append((char)(new Random().nextInt(31)+33)).append((char)(new Random().nextInt(31)+33));
		}
		
		System.out.println(new String(sb));

	}

}
