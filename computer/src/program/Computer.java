package program;

public class Computer {
	
	private Program program;
	private Memory memory;
	private ProgramCounter pc;

	public Computer(Memory memory) {
		this.memory = memory;
		pc = new ProgramCounter(); 
	}
	
	public void load(Program program){
		this.program = program; 
	}

	public void run(){
		program.run(memory, pc);
	}
}
