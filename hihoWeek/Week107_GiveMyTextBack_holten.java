/**
* Created by holten on 2016-07-20.
* Email: holten.ko@gmail.com
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			String[] inputArray = input.split("\\s+");
			StringBuilder stringBuilder = new StringBuilder();
			boolean isNew = true;
			for (int i = 0; i < inputArray.length; i++) {
				String inputWord = inputArray[i].toLowerCase();
				if (isNew) {
					inputWord = captureName(inputWord);
					isNew = false;
				}
				stringBuilder.append(inputWord);
				if (i < inputArray.length - 1 && !",".equals(inputArray[i + 1]) && !".".equals(inputArray[i + 1])) {
					stringBuilder.append(" ");
				}
				if (stringBuilder.lastIndexOf(".") == (stringBuilder.length() - 2))
					isNew = true;
			}
			System.out.println(stringBuilder.toString());
		}
	}

	private static String captureName(String word) {
		char[] cs = word.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);
	}
}
