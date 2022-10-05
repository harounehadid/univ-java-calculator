import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.awt.GridBagConstraints;

/**
 * App
 */
public class App {

    private JFrame frame;
    private JPanel panel;
    private GridBagLayout grid;
    private GridBagConstraints gbc = new GridBagConstraints();
    private ArrayList <JButton> numBtns;

    public App() {
        frame = new JFrame();
        panel = new JPanel();
        grid = new GridBagLayout(); // 7, 4

        // panel.setBorder(BorderFactory.createEmptyBorder(300, 360, 180, 360));
        panel.setLayout(new GridBagLayout());

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Test Frame");
        frame.setSize(500, 500);

        numBtns = new ArrayList <JButton>();

        String[] calculatorCharacters = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        JButton newBtn = setGridBagBtn("expension", panel, 0, 0, 'h', 7);
        JButton btn0 = setGridBagBtn(calculatorCharacters[0], panel, 0, 1, ' ', 0);
        JButton btn1 = setGridBagBtn(calculatorCharacters[1], panel, 1, 1, ' ', 0);
        JButton btn2 = setGridBagBtn(calculatorCharacters[2], panel, 2, 1, ' ', 0);
        JButton btn3 = setGridBagBtn(calculatorCharacters[3], panel, 3, 1, ' ', 0);

        // for (int i = 0; i < numBtns.length; i++) {
        //     String btnName = Integer.toString(i);
        //     numBtns[i].setText("h");
        //     frame.add(numBtns[i]);
        // }  


        JButton btnPeriod = new JButton(".");
        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnMulti = new JButton("*");
        JButton btnDiv = new JButton("/");
        JButton btnReset = new JButton("C");
        
        frame.setVisible(true);
    }  
    
    private JButton setGridBagBtn(String btnText, JPanel panel, int xPos, int yPos, char axis, int expansionAmount) {
        JButton btn = new JButton(btnText);
        
        gbc.gridx = xPos;
        gbc.gridy = yPos;

        if (axis != ' ' && expansionAmount > 0) {
            if (axis == 'v') {
                gbc.gridwidth = expansionAmount;
                gbc.fill = GridBagConstraints.VERTICAL;
            } 
            else if (axis == 'h') {
                gbc.gridheight = expansionAmount;
                gbc.fill = GridBagConstraints.HORIZONTAL;
            }
        }

        panel.add(btn, gbc);

        return btn;
    }
    
    public static void main(String[] args) {
        new App();
    }
}