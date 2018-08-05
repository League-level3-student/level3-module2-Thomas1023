package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int i = 0;

		for (String string : eggs) {
			if (string.equals("cracked")) {
				i = eggs.indexOf(string);
				return i;
			}
		}
		return i;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int i = 0;
		for (Boolean b : oysters) {
			if (b) {
				i++;
			}
		}
		return i;
	}

	public static double findTallest(List<Double> peeps) {
		Double temp = 0.0;
		for (Double d : peeps) {
			if (d > temp) {
				temp = d;
			}
		}
		return temp;
	}

	public static Object findLongestWord(List<String> words) {
		int temp = 0;
		int index = 0;
		for (String s : words) {
			System.out.println(s);
			if (s.length() > temp) {
				temp = s.length();
				System.err.println(s);
				index = words.indexOf(s);
			}
		}
		return words.get(index);
	}

	public static Object containsSOS(List<String> message1) {
		for (String s : message1) {
			if(s.contains(s)) {
				return true;
			}
		}
return false;
	}

	public static List<String> sortWords(List<String> words) {
		int temp=0;
		String str="";
		for (String a : words) {
			for (String b : words) {
				if(a.charAt(0)<b.charAt(0)) {
					str=a;
					words.set(words.indexOf(a), b);
					words.set(words.indexOf(b), str);
				}
			}
		}
		System.out.println(words);
		return words;
	}

	public static List<String> sortScores(List<Double> results) {

		return null;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < ((CharSequence) unsortedSequences).length(); i++) {
			
		}
		return null;
	}
}
