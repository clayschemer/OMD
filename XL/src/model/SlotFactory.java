package model;

public class SlotFactory {
	private Environment env;

	public SlotFactory(Environment env) {
		this.env = env;
	}
	
	public Slot slotBuilder(String s) {
		try {
			if (s.charAt(0) == '#') {
				return new TextSlot(s);
			}
			return new ExprSlot(env, s);
		} catch (XLException e) {
			throw e;
		}
	}

}
