package instruction;

import program.Operand;
import program.Address;
import program.Word;

public class Mul extends Operator {

	public Mul(Operand op1, Operand op2, Address address) {
		super(op1, op2, address);
	}
	
	protected void operation(Word w1, Word w2, Word w3) {
		w3.mul(w1, w2);
	}
	
	public String toString(){
		return "MUL " + op1 + " " + op2 + " " + address;
	}
}
