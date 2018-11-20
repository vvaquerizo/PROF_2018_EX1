package aaa;

public class MyString {
	String string;
	
	public MyString(String string) {
		this.string = string;
	}
	
	public String getString() {
		return this.string;
	}
	
	public int compareTo(MyString anotherString) {
		// Nodo 1
		for (int k = 0; k < Math.min(this.string.length(), anotherString.getString().length()); k++) {
			// Nodo 2
			int diff = this.string.charAt(k) - anotherString.getString().charAt(k);
			if (diff != 0) {
				//Nodo 3
				return diff;
			}
		}
		// Nodo 4
		if (this.string.length() != anotherString.getString().length()) {
			// Nodo 5
			return this.string.length() - anotherString.getString().length();
		}
		// Nodo 6
		return 0;
	}
}
