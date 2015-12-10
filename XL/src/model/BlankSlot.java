package model;

public class BlankSlot extends Slot {
	
	public BlankSlot() {}
	
	public String toString() {
		return "";
	}

	public double value(Environment env) {
		return 0;
	}
}
