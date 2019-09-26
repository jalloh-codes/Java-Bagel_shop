import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OrderCalc extends JFrame{
    
    private BagelPanel bagels;
    private CoffePanel coffee;
    private LabelPanel banner;
    private ToppingBagel topping;
    private JButton calcButton;
    private JPanel holdButton;
    private JButton exitButton;
    private final double TAX_RATE = 0.06;
    
    public OrderCalc(){
        setTitle("Bagel Shop");
        
        //set close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //border manager
        setLayout(new BorderLayout());
        
        //custom panel
        bagels = new BagelPanel();
        coffee = new CoffePanel();
        topping = new ToppingBagel();
        banner = new LabelPanel();
        
        //button panel
        buildButtonPanel();
        
        //adding it to the panel
        add(banner, BorderLayout.NORTH);
        add(bagels, BorderLayout.WEST);
        add(topping, BorderLayout.CENTER);
        add(coffee, BorderLayout.EAST);
        add(holdButton, BorderLayout.SOUTH);
        
        //add up the contente and display
        pack();
        setVisible(true);
    }

    private void buildButtonPanel(){
        holdButton = new JPanel();
        
        calcButton = new JButton("Calculate");
        exitButton = new  JButton("Exit");
        
        calcButton.addActionListener(new CalcButtonListener());
        exitButton.addActionListener(new ExitButtonListener());
        
        holdButton.add(calcButton);
        holdButton.add(exitButton);    
        
    }
    private class CalcButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {  
            double subtotal, tax, total;
            subtotal = bagels.getBagelCost() + topping.getToppingCost() + coffee.getCoffeeCost();
        
            tax = subtotal * TAX_RATE; 
        
            total = subtotal + tax;
           JOptionPane.showMessageDialog(null, String.format("Subtotal: $%,.2f\n" +  "Tax: $%,.2f\n" + "Total: $%,.2f", subtotal, tax, total)); 
        


        }
    }

    private class ExitButtonListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
            
        } 
    }

    public static void main(String[] args){
            new OrderCalc();
        
    }
}
