package q_three;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class QuestionThree {
	static int a = 5, b = 3;

	public static void main(String[] args) {
		System.out.println(alphaFormat());
	}

	static String alphaFormat() {
		
       String full_str=generateStr();
		List<String> characters = Arrays.asList(full_str.split(""));
		Collections.shuffle(characters);
		full_str = "";
		for (String character : characters) {
			full_str += character;
		}
		if (full_str.contains("aaa") || full_str.contains("bbb")) {
		
			return alphaFormat();
		}
		return full_str;
	}

	private static String generateStr() {
		StringBuilder abuilder = new StringBuilder();
		for (int x = 0; x < a; x++) {
			abuilder.append("a");
		}
		StringBuilder bbuilder = new StringBuilder();
		for (int x = 0; x < b; x++) {
			bbuilder.append("b");
		}
		return  abuilder.toString() + bbuilder.toString();
	
	}
}
