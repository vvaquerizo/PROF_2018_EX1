package aaa;

public class MyString {
	String string;
	
	public MyString(String string) {
		this.string = string;
	}
	
	public String getString() {
		return this.string;
	}
	
	public int compareTo(MyString string1, MyString string2) {
		int diff = string1.getString().length() - string2.getString().length();
		if (string1.getString().length() != string2.getString().length()) {
			return diff;
		} else {
			return 0;
		}
	}
}
