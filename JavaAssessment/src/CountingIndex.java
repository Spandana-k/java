import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class CountingIndex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");  
		String str= scanner.nextLine();
		System.out.println(getCharCountArray(str));
	}

	public static char getCharCountArray(String word) {
		Set<Character> repeating = new HashSet<Character>();
		List<Character> nonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) { 
			char letter = word.charAt(i); 
			if (repeating.contains(letter)) {
				continue; 
			}
			if (nonRepeating.contains(letter)) {
				nonRepeating.remove((Character) letter);
				repeating.add(letter); 
			} else {
				nonRepeating.add(letter); } } 
		return nonRepeating.get(0);
	}
}
