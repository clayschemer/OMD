package model;

public abstract class Slot {
	protected String content;

	public abstract double value(Environment env);
	
	public abstract String toString();
}
