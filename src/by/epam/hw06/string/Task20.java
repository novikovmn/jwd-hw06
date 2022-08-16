package by.epam.hw06.string;

/* 20. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов 
 * заменить на одиночные пробелы. Крайние пробелы в строке удалить. */

public class Task20 {

	public static void main(String[] args) {

		String str = " hello  world   nice     car ";

		String trimmedStr = str.trim();

		String result = trimmedStr.replaceAll("\\s{2,}", " ");

		System.out.printf("Было: [%s]\n", str);
		System.out.printf("Стало: [%s]\n", result);

	}

}
