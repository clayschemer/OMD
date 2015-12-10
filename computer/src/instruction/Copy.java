package instruction;

import program.Address;
import program.Memory;
import program.Operand;
import program.ProgramCounter;

public class Copy implements Instruction {
	private Operand op;
	private Address address;
	
	public Copy(Operand op, Address address) {
		this.op = op;
		this.address = address;
	}

	public void execute(Memory memory, ProgramCounter pc) {
		address.getWord(memory).copy(op.getWord(memory));
		pc.incrementCounter();
	}

	public String toString(){
		return "CPY" + " " + op + " " + address;
	}
}
