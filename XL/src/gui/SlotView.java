package gui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

import model.Address;
import model.Storage;


public class SlotView extends JLabel implements Observer, MouseListener {
	public static SlotView lastSlot;
	private Storage storage;
	private Address address;

	public SlotView(Storage storage, Address address) {
        super("                    ", RIGHT);
        this.storage = storage;
        this.address = address;
        setBackground(Color.WHITE);
        setOpaque(true);
        addMouseListener(this);
        lastSlot = this;
        storage.addObserver(this);
    }

	public void update(Observable observable, Object object) {
		setText(storage.toView(address));
	}
	
	public void mouseClicked(MouseEvent e) {
		lastSlot.setBackground(Color.WHITE);
		e.getComponent().setBackground(Color.YELLOW);
		lastSlot = this;
		storage.setCurrent(address.toString());
	}
	
	public void mouseEntered(MouseEvent arg0) { }

	public void mouseExited(MouseEvent arg0) { }

	public void mousePressed(MouseEvent arg0) { }

	public void mouseReleased(MouseEvent arg0) { }  
    
}