package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;


public class Storage extends Observable implements Environment {

	private static final long serialVersionUID = 1L;
	private Map<Address, Slot> map = new HashMap<Address, Slot>();
	private String currentSlot;

	public Storage(int rows, int col) {
		currentSlot = "A1";
	}

	public void add(String addr, String value) {
		SlotFactory fac = new SlotFactory(this);
		Slot oldSlot = map.get(new Address(addr));
		map.put(new Address(addr), new ErrorSlot());
		try {
			Slot newSlot = fac.slotBuilder(value);
			newSlot.value(this);
			map.put(new Address(addr), newSlot);
		} catch (XLException e) {
			map.put(new Address(addr), oldSlot);
			throw e;
		}
		notifyObservers();
		setChanged();
	}

	public String getExpr(String key) {
		String s = "";
		try {
			s = map.get(new Address(key)).toString();
		} catch (Exception e) {}
		return s;
	}

	public double value(Address key) {
		if (map.get(key) == null) {
			return 0;
		}
		return map.get(key).value(this);
	}
	
	public String toView(Address key) {
		if (map.get(key) == null) {
			return "";
		}
		//return String.valueOf(map.get(key).value(this));
		return map.get(key).toString();
	}

	public String currentSlot() {
		return currentSlot;
	}

	public void setCurrent(String s) {
		currentSlot = s;
		notifyObservers();
		setChanged();
	}
	
	public Slot nowSlot() {
		Slot slot = map.get(new Address(currentSlot));
		if (slot == null) {
			return new BlankSlot();
		}
		return slot;
	}
	
	public Map<Address, Slot> map() {
		return map;
	}
	
	public void clearAll() {
		map.clear();
		notifyObservers();
		setChanged();
	}
	
	public void clearCurrent() {
		map.remove(currentSlot);
		notifyObservers();
		setChanged();
	}
}