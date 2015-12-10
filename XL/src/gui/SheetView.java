package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Address;
import model.Storage;

public class SheetView extends JPanel {
	private static Adjustment adjustment = new NumberAdjustment(14, 2);
    private SlotView slotView[][];
    private int rows, cols;

    public SheetView(int rows, int cols, Storage storage) {
        this.rows = rows;
        this.cols = cols;
        slotView = new SlotView[rows][cols];
        setLayout(new GridLayout(rows + 1, cols, 2, 2));
        for (int j = 0; j < cols; j++) {
            JLabel lbl = new JLabel(String.valueOf((char) (j + 'A')),
                    SwingConstants.CENTER);
            lbl.setBackground(Color.LIGHT_GRAY);
            lbl.setOpaque(true);
            add(lbl);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                SlotView slotViewIj = new SlotView(storage, new Address(i,j));
                add(slotViewIj);
                slotView[i][j] = slotViewIj;
            }
        }
        slotView[0][0].setBackground(Color.YELLOW);
        setBackground(Color.BLACK);
        SlotView.lastSlot = slotView[0][0];
    }

}
