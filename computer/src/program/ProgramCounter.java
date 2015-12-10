package program;

public class ProgramCounter {
	
	private int index;
	
	public ProgramCounter() {
		index = 0;
	}
	
	public void incrementCounter() {
		index++;
	}
	
	public void setCounter(int newCount) {
		index = newCount;
	}
	
	public int getIndex() {
		return index;
	}
}
