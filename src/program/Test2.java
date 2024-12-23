package program;

public class Test2 {

	public static void main(String[] args) {

		String name = "Shailesh Kumar";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (!(ch == 'a' || ch == 'A' || ch == 'e' | ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U')) {
				System.out.print(ch);

			}
		}
	}

}
