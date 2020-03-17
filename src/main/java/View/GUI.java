package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public JTextField polynomial1 = new JTextField(10);
    public JTextField polynomial2 = new JTextField(10);
    public JTextField polynomial3 = new JTextField(20);
    public JButton addition = new JButton("Add");
    public JButton substraction = new JButton("Subtract");
    public JButton multiplication = new JButton("Multiply");
    public JButton division = new JButton("Divide");
    public JButton derivative = new JButton("Derive 1st P ");
    public JButton integration = new JButton("Integrate 1st P");
    public JButton clear = new JButton("Clear");
    public JLabel label1 = new JLabel("First polynomial: ");
    public JLabel label2 = new JLabel("Second polynomial: ");
    public JLabel label3 = new JLabel("Answer:");

    public GUI(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label1);
        panel.add(polynomial1);

        panel.add(label2);
        panel.add(polynomial2);

        panel.add(label3);
        panel.add(polynomial3);

        panel.add(addition);
        panel.add(substraction);
        panel.add(multiplication);
        panel.add(division);
        panel.add(derivative);
        panel.add(integration);
        panel.add(clear);


        this.setContentPane(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addAddListener(ActionListener add_listener) { addition.addActionListener(add_listener);}
    public void addSubsListener(ActionListener subs_listener) { substraction.addActionListener(subs_listener);}
    public void addMultListener(ActionListener mult_listener) { multiplication.addActionListener(mult_listener);}
    public void addDivListener(ActionListener div_listener) { division.addActionListener(div_listener);}
    public void addDerivListener(ActionListener deriv_listener) { derivative.addActionListener(deriv_listener);}
    public void addIntegListener(ActionListener integ_listener) { integration.addActionListener(integ_listener);}
    public void addClearListener(ActionListener clear_listener) { clear.addActionListener(clear_listener);}

    public JButton getAddition() { return addition;  }
    public JButton getSubstraction() { return substraction; }
    public JButton getMultiplication() { return multiplication; }
    public JButton getDerivative() { return derivative;}
    public JButton getIntegration() { return integration;}
    public JTextField getPol3() {
        return polynomial3;
    }
}
