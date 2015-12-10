package program;

public abstract class Memory{
	
	protected Word[] memory;
	
	public Memory(int size){
		memory = new Word[size];
	}
	
	public abstract Word read(int address);
	
}
