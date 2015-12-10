package program;

public class Address implements Operand {
	
	private long address;

	public Address(long address) {
		this.address = address;	
	}
	
	public String toString(){
		return "[" + address + "]";
	}
	
	public Word getWord(Memory memory){
		return memory.read((int) address);
	}
}
