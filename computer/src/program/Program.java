package program;

import instruction.Instruction;
import java.util.ArrayList;

public class Program extends ArrayList<Instruction> {
	private static final long serialVersionUID = -6942936302006761758L;

	public Program() { }
	
	public void run(Memory memory, ProgramCounter pc) {
		while(pc.getIndex() > -1) {
			get(pc.getIndex()).execute(memory, pc);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size(); i++) {
			sb.append(i + " ");
			sb.append(get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
