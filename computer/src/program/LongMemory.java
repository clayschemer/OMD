package program;

public class LongMemory extends Memory {

	public LongMemory(int size) {
		super(size);
		for (int i = 0; i < size; i++) {
			memory[i] = new LongWord(0);
		}
	}

	public Word read(int address) {
		return memory[address];
	}
}