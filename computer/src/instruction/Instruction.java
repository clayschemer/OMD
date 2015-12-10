package instruction;

import program.Memory;
import program.ProgramCounter;

public interface Instruction {
	
	public String toString();
	
	public void execute(Memory memory, ProgramCounter pc);
	
}
