package instruction;

import program.Memory;
import program.Operand;
import program.ProgramCounter;

public class JumpEq extends Jump {

	private Operand op1, op2;
	
	public JumpEq(int index, Operand op1, Operand op2) {
		super(index);
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public void execute(Memory memory, ProgramCounter pc) {
		if ((op1.getWord(memory)).equals(op2.getWord(memory))) {
			pc.setCounter(index);
		} else {
			pc.incrementCounter();
		}
	}
	
	public String toString(){
		return "JEQ " + index + " " + op1 + " " + op2;
	}
}
