package model;


public class ErrorSlot extends Slot {
	
	public ErrorSlot() {}

	public String toString(){
		return "";
	}

	public double value(Environment env) {
		throw new XLException("circular dependency");
	}
}
