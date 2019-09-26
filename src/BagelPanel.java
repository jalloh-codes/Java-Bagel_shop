import javax.swing.*;
import java.awt.*;
/** Allow the user select the white or wheat */
public class BagelPanel extends JPanel{
    //set the price of wheat and white
    
    public final double WHITE_BAGEL = 1.20;
    public final double WHEAT_BAGEL = 1.50;
    
    private JRadioButton whiteBagel; //to select
    private JRadioButton wheatBagel; // to select
    private ButtonGroup bg;
    
    public BagelPanel(){
        //Creating a GridLayout
        
        //create two rows and columns 
        setLayout(new GridLayout(2, 1));
        
        //creating button
        whiteBagel = new JRadioButton("White", true);
        wheatBagel = new JRadioButton("Wheat");
        
        //Grouping the radio button in to bg variable
        bg = new ButtonGroup();
        bg.add(whiteBagel);
        bg.add(wheatBagel);
        
        //adding a boder around the panel 
        setBorder(BorderFactory.createTitledBorder("Bagel"));
        
        //Adding to the panel
        add(whiteBagel);
        add(wheatBagel);
    }
    // return bagel cost 
    public double getBagelCost(){
        double bagelCost = 0.0;
        if(whiteBagel.isSelected()){
            bagelCost = WHITE_BAGEL;
        }else
            bagelCost = WHEAT_BAGEL;
        return bagelCost;
        
    }
}
