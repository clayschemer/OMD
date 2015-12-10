package gui;

import model.Address;
import model.Slot;
import model.Storage;

public class CurrentSlot {
	
	private Storage storage;
	
	public CurrentSlot(Storage storage) {
		this.storage = storage;
	}
	
	public Slot getSlot(Address address) {
		return storage.nowSlot();
	}
}
