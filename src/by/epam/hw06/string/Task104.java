package by.epam.hw06.string;

/* 104. Определить самое длинное общее слово двух заданных предложений. */

public class Task104 {

	public static void main(String[] args) {
		
		String s1 = "Ok, Google!";
		String s2 = "Hello, Google.";
		
		System.out.println("Дано:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("================================================");
		
		String[] s1Words = s1.split("[,.!?\\s]+");
		String[] s2Words = s2.split("[,.!?\\s]+");
		
		int maxLen = s1Words[0].length();
		String s1MaxLenWord = "";
		for (int i = 1; i < s1Words.length; i++) {
			if(s1Words[i].length() > maxLen) {
				maxLen = s1Words[i].length();
				s1MaxLenWord += (s1Words[i]);
			}
		}
		
		int flag = 0;
		String s2MaxLenWord = ""; 
		for (int i = 0; i < s2Words.length; i++) {
			if(s2Words[i].equals(s1MaxLenWord)) {
				s2MaxLenWord += s2Words[i];
				flag++;
				break;
			}
		}
		
		if(flag > 0) {
			System.out.printf("Самое длинное общее слово -> [%s]\n", s2MaxLenWord);
		}else {
			System.out.println("Не обнаружено искомое слово!");
		}
		
		

	}

}
