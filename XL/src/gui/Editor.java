package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JTextField;
import model.XLException;
import model.Slot;
import model.Storage;

public class Editor extends JTextField implements ActionListener, Observer {
    
	private Storage storage;
	private StatusArea statusArea;
	private String addr;
	
	public Editor(Storage storage, StatusArea statusArea) {
        setBackground(Color.WHITE);
        addActionListener(this);
        this.storage = storage;
        this.statusArea = statusArea;
        storage.addObserver(this);
        addr = "A1";
    }

    public void actionPerformed(ActionEvent event) {
        String content = getText();
        String address = storage.currentSlot();
        try {
        	storage.add(address, content);
        	statusArea.setText("");
        } catch (XLException e) {
        	statusArea.setText(e.getMessage());
        }
    }

	public void update(Observable arg0, Object arg1) {
		setText("");
		addr = storage.currentSlot();
		Slot slot = storage.nowSlot();
		System.out.println("från update i editor " + storage.getExpr(addr));
		//setText(storage.getExpr(addr));
		setText(slot.toString());
	}
}