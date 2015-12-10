package model;

public class TextSlot extends Slot {
	
	private String s;
	
	public TextSlot(String s) {
		content = s.substring(1);
	}
	
	public String toString() {
		return content;
	}

	public double value(Environment env) {
		return 0;
	}
}
