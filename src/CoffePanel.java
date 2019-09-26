import javax.swing.*;
import java.awt.*;

public class CoffePanel extends JPanel{
    //prices of coffe
    public final double NO_COFFEE = 0.0;
    public final double REGULAR_COFFEE = 1.25;
    public final double DECAF_COFFEE = 1.25;
    public final double CAPPUCCINO = 2.00;
    
    private JRadioButton noCoffee;
    private JRadioButton regularCoffee;
    private JRadioButton decafCoffee;
    private JRadioButton cappuccino;
    private ButtonGroup bg;
    
    public CoffePanel(){
        //set layout 4 rows and 1 column
        setLayout(new GridLayout(4, 1));
        
        //creating radio button
        noCoffee = new JRadioButton("None");
        regularCoffee = new JRadioButton("Regular coffee", true);
        decafCoffee = new JRadioButton("Decaf coffee");
        cappuccino = new JRadioButton("Cappuccino");
        
        //gouping the button to bg
        bg = new ButtonGroup();
        bg.add(noCoffee);
        bg.add(regularCoffee);
        bg.add(decafCoffee);
        bg.add(cappuccino);
        
        //border Title
        setBorder(BorderFactory.createTitledBorder("Coffee"));
        
        //add radio button to panel
        add(noCoffee);
        add(regularCoffee);
        add(decafCoffee);
        add(cappuccino);
        
    }
    //return cost of coffee
    public double getCoffeeCost(){
        double coffeeCost = 0.0;
        if(noCoffee.isSelected())
            coffeeCost += NO_COFFEE;
        if(regularCoffee.isSelected())
            coffeeCost += REGULAR_COFFEE;
        if(decafCoffee.isSelected())
            coffeeCost += DECAF_COFFEE;
        if(cappuccino.isSelected())
            coffeeCost += CAPPUCCINO;
        return coffeeCost;
    }
}
