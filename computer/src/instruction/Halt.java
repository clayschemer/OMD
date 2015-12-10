package instruction;

import program.Memory;
import program.ProgramCounter;

public class Halt implements Instruction {

	public Halt() { }
	
	public String toString(){
		return "HLT";
	}
	
	public void execute(Memory memory, ProgramCounter pc) {
		pc.setCounter(-1);
	}
}
