package program;

public abstract class Word implements Operand {
	
	public Word() { }
	
	public abstract String toString();
	
	public Word getWord(Memory memory){
		return this;
	}
	
	public abstract boolean equals(Object obj);
	
	public abstract void add(Word w1, Word w2);
	
	public abstract void mul(Word w1, Word w2);
	
	public abstract void copy(Word word);
	
}
