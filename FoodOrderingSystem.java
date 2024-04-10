import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FoodOrderingSystem extends JFrame {
    double BURGER_PRICE = 99;
     double PIZZA_PRICE = 500;
    private static final double PASTA_PRICE = 60;
    public FoodOrderingSystem() {
        // Set up the frame
        setTitle("Food Ordering System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());

        // Create components
        JLabel titleLabel = new JLabel("Select your items:");
      final  JCheckBox burgerCheckBox = new JCheckBox("Burger - " + BURGER_PRICE);
      final  JCheckBox pizzaCheckBox = new JCheckBox("Pizza - " + PIZZA_PRICE);
       final JCheckBox pastaCheckBox = new JCheckBox("Pasta - " + PASTA_PRICE);
       JPanel p=new JPanel();
       final JButton btn = new JButton("Show Total");
       final JTextArea ta = new JTextArea(5, 30);
        ta.setEditable(false);

        // Add action listener to the show total button
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                double total = 0;

                if (burgerCheckBox.isSelected()) {
                    total += BURGER_PRICE;
                }
                if (pizzaCheckBox.isSelected()) {
                    total += PIZZA_PRICE;
                }
                if (pastaCheckBox.isSelected()) {
                    total += PASTA_PRICE;
                }
        
                // Display the total bill
                ta.setText("Total Bill: " + total);
         

            }
        });


        

        // Add components to the frame
        add(titleLabel);
        add(burgerCheckBox);
        add(pizzaCheckBox);
        add(pastaCheckBox);
      p.add(btn);
        add(ta);

        // Set frame visibility
        setVisible(true);
    }

   
    public static void main(String[] args) {
        // SwingUtilities.invokeLater(new Runnable() {
        //     public void run() {
                new FoodOrderingSystem();
            }
        //});
    //}
}
