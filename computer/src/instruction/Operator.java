package instruction;

import program.Memory;
import program.Operand;
import program.Address;
import program.ProgramCounter;
import program.Word;

public abstract class Operator implements Instruction {
	
	protected Operand op1, op2;
	protected Address address;
	
	public Operator(Operand op1, Operand op2, Address address) {
		this.op1 = op1;
		this.op2 = op2;
		this.address = address;	
	}
	
	public void execute(Memory memory, ProgramCounter pc) {
		operation(op1.getWord(memory), op2.getWord(memory), address.getWord(memory));
		pc.incrementCounter();
	}
	
	protected abstract void operation(Word w1, Word w2, Word w3);

}
