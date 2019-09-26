import javax.swing.*;
public class LabelPanel extends JPanel{
    private JLabel greeting; // Display label
    
    public LabelPanel(){
        //Create label
        greeting = new JLabel("Welcome TO the Bagel-Shop");
        
        //add to the panel
        add(greeting);
    }
}
