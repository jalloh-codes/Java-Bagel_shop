import javax.swing.*;
import java.awt.*;
public class ToppingBagel extends JPanel{
    //discribe topping cost 
    public final double CREAM_CHEESE = 0.50;
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75;
    public final double BLUEBERRY_JAM = 0.75;
    
    //TO SELECT TOPPING
    private JCheckBox creamCheese;
    private JCheckBox butter;
    private JCheckBox peachJelly;
    private JCheckBox blueberryJam;
    
    
    public ToppingBagel(){
        /**creating a layout
         with 4 rows and 1 column
        */
        setLayout(new GridLayout(4, 1));
        
        //creating the check boxes
        creamCheese = new JCheckBox("Chream cheese");
        butter = new JCheckBox("Butter");
        peachJelly = new JCheckBox("Peach jelly");
        blueberryJam = new JCheckBox("Blueberry jam");
        
        
        //border title
        setBorder(BorderFactory.createTitledBorder("Topping"));
        //adding to the panel
        add(creamCheese);
        add(butter);
        add(peachJelly);
        add(blueberryJam);
    }
    //return topping cost 
    public double getToppingCost(){
        double toppingCost = 0.0;
        //selecting
        if(creamCheese.isSelected())
            toppingCost += CREAM_CHEESE;
        if(butter.isSelected())
            toppingCost += BUTTER;
        if(peachJelly.isSelected())
            toppingCost += PEACH_JELLY;
        if(blueberryJam.isSelected())
            toppingCost += BLUEBERRY_JAM;
        
        //return cost
        return toppingCost;
    }
    
}
