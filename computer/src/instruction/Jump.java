package instruction;

import program.Memory;
import program.ProgramCounter;

public class Jump implements Instruction {
	
	protected int index;

	public Jump(int index) {
		this.index = index;
	}

	public void execute(Memory memory, ProgramCounter pc) {
		pc.setCounter(index);
	}
	
	public String toString() {
		return "JMP " + index;
	}
}
