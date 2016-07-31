package IntermediatePrograms;
import java.util.ArrayList;

public class Pali {
	private static ArrayList<Character> list = new ArrayList<Character>();
	private static String a = "Stop! nine myriad murmur. Put up rum, rum, dairymen, in pots.";
	private static String b = "";
	public static void main(String[] args) {
		// will work for most phrases with punctuation 
		toList(a);
		makeString(list);		
		System.out.println(a);
		System.out.println(list);
		System.out.println(b);
		System.out.println(paliNonRec(a));
		System.out.println(paliRec(b));

	}

	public static boolean paliRec(String a) {

		if (a.length() == 0 || a.length() == 1) {
			return true;
		}
		if (a.charAt(0) == a.charAt(a.length() - 1)) {
			return paliRec(a.substring(1, a.length() - 1));
		}
		return false;
	}

	public static boolean paliNonRec(String a) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != list.get(list.size() - (i + 1))) {
				return false;
			}
		}
		return true;
	}

	public static String toList(String a) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != '.' && a.charAt(i) != ' ' && a.charAt(i) != ',' &&
					a.charAt(i) != '?' && a.charAt(i) != '!') {
				list.add(a.toLowerCase().charAt(i));				
			}
		}
		return a;
	}
	
	public static String makeString(ArrayList<Character> list){
		for (int i = 0; i < list.size();i++){
			b += list.get(i);
		}
		b.toLowerCase();
		return b;
	}

}
