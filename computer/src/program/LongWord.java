package program;

public class LongWord extends Word {

	private long word;
	
	public LongWord(long word) {
		this.word = word;
	}

	public void add(Word w1, Word w2) {
		word = ((LongWord) w1).word + ((LongWord) w2).word;
	}

	public void mul(Word w1, Word w2) {
		word = ((LongWord) w1).word * ((LongWord) w2).word;
	}
	
	public void copy(Word w){
		word = ((LongWord) w).word;
	}

	public boolean equals(Object obj) {
		if (obj instanceof LongWord) {
			return word - ((LongWord) obj).word == 0;
		}
		return false;
	}

	public String toString() {
		return String.valueOf(word);
	}	
}
