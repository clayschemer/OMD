package instruction;

import program.Address;
import program.Memory;
import program.ProgramCounter;

public class Print implements Instruction {
	
	private Address address;

	public Print(Address address) {
		this.address = address;
	}
	
	public String toString(){
		return "PRT " + address;
	}

	public void execute(Memory memory, ProgramCounter pc) {
		pc.incrementCounter();
		System.out.println(address.getWord(memory));
	}
}
