import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.TextAction;


public class order_function {
	 private JComboBox<String> orderComboBox;
	    private JButton okButton, cancelButton,addButton;
private JLabel quantity;
private int price = 10;
}
	//add products and show 

	
public static void main(String[] args) {
JFrame frame = new JFrame("quantity");

//define the data model
String [] items = {"calender","coffee mug","note pad ","pen","water bottle","keychain","TOTE BAG ","desk lamp" });
// create a combo box with the defined data model
JComboBox<String> comboBox = new JComboBox<String>(items);
comboBox.setEditable(true);
JPanel comboPanel = new JPanel();
comboPanel.add(comboBox);
frame.add(comboPanel, BorderLayout.NORTH);
TextAction.setPreferredSize( new Dimension , 400,200));//size
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}

   
    okButton = new JButton("OK");
    cancelButton = new JButton("Cancel");

    add(okButton);
    add(cancelButton);
    
    okButton.addActionListener(e -> {
    	String product  = (String)orderComboBox.getSelectedItem();
    	
    }
    //quantity -add and show 
    add(new JLabel("quantity:"));
    
    addButton = new JButton("add");
    
    
    //sums 
    totalvalue = quantity*price;
    rate = customerType;

    totalDiscount = totalvalue*discount_rate*0.01;
}

