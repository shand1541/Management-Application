import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JSpinner.DateEditor;

import sun.util.resources.CalendarData;

@SuppressWarnings("serial")
public class add_review extends JDialog  {
	
	private JButton submitButton;
	 private JTextField commentField;
	 
	public add_review(JFrame parent, final ArrayList<adds> adds) {
        super(parent, "add_review", true);
        setLayout(new GridLayout(4, 2, 10, 10));
        setSize(300, 200);
        
        //date 
    
        add(new JLabel("review date "), BorderLayout.WEST);
        add(spinner, BorderLayout.CENTER);
        JSpinner spinner = new JSpinner(model);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        return Date object
        spinner.setEditor(new JSpinner.DateEditor(spinner,"MM/yyyy"));

        //comment 
        add(new JLabel("comment "), BorderLayout.WEST);
        add(commentField,BorderLayout.CENTER);
           commentField = new JTextField();
          
      //slider
    	JPanel sliderPanel = new JPanel();
    	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 5, 3);
    	slider.setMajorTickSpacing(5);
    	slider.setMinorTickSpacing(5);
    	slider.setPaintTicks(true);
    	
    	//submit 
    	submitButton = new JButton("submit");

        add(submitButton);
        submitButton.addActionListener(e -> {
        	String comment = commentField.getText().trim();
        	
        	adds.add(new adds(date,comment,rate));
            JOptionPane.showMessageDialog(this, "added");
            dispose();
        	
        	
        }
}

}
