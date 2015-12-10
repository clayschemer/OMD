package instruction;

import program.Address;
import program.Operand;
import program.Word;

public class Add extends Operator {
	
	public Add(Operand op1, Operand op2, Address address) {
		super(op1, op2, address);
	}

	protected void operation(Word w1, Word w2, Word w3) {
		w3.add(w1, w2);
	}
	
	public String toString(){
		return "ADD " + op1 + " " + op2 + " " + address;
	}
}
