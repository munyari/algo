public class StringPermutations {
	public static ArrayList<String> getPermutations(String s) {
		ArrayList<String> permutations = new ArrayList<String>();
		if (s == null)
			return null;
		if (s.length() == 0)
			permutations.add("");
			return permutations;
		}

		char first = s.charAt(0);
		String remainder = s.substring(1);
		ArrayList<String> words = getPermutations(remainder);
		for (String word : words) {
			for (int j = 0; j <= words.length(); j++)
				permutations.add(insertCharAt(word, first, j));
			}
		}
		return permutations;
	}

	public static String insertCharAt(String word, char c, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + c + end;
	}
}
