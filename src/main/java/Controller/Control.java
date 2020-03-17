package Controller;

import Model.*;
import View.GUI;
import java.awt.event.*;

public class Control {
    private GUI view;
    public Control(GUI view){
        this.view = view;
        view.addAddListener(new AddListener());
        view.addSubsListener(new SubstarctListener());
        view.addDerivListener(new DeriveListener());
        view.addIntegListener(new IntegrateListener());
        view.addMultListener(new MultiplyListener());
        view.addClearListener(new ClearListener());
    }
    class AddListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Addition add = new Addition();
            Parse parse = new Parse();
            Polinom pol1 = new Polinom();
            String s1 = view.polynomial1.getText();
            if(!parse.parsePolynom(s1, pol1)){
                return;
            }
            Polinom pol2 = new Polinom();
            String s2 = view.polynomial2.getText();
            if (!parse.parsePolynom(s2, pol2)){
                return;
            }
            Polinom pol3 = new Polinom();
            add.add(pol1, pol2, pol3);
            view.polynomial3.setText(pol3.toString());
        }
    }
    class SubstarctListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Substraction sub = new Substraction();
            Parse parse = new Parse();
            Polinom pol1 = new Polinom();
            String s1 = view.polynomial1.getText();
            if(!parse.parsePolynom(s1, pol1)){
                return;
            }
            Polinom pol2 = new Polinom();
            String s2 = view.polynomial2.getText();
            if (!parse.parsePolynom(s2, pol2)){
                return;
            }
            Polinom pol3 = new Polinom();
            sub.substract(pol1, pol2, pol3);
            view.polynomial3.setText(pol3.toString());

        }
    }
    class DeriveListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            Derivative der = new Derivative();
            Parse parse = new Parse();
            Polinom pol1 = new Polinom();
            String s1 = view.polynomial1.getText();
            if(!parse.parsePolynom(s1, pol1)){
                return;
            }
            Polinom pol2 = new Polinom();
            der.derivative(pol1, pol2);
            view.polynomial3.setText(pol2.toString());
        }
    }
    class IntegrateListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Integration integ = new Integration();
            Parse parse = new Parse();
            Polinom pol1 = new Polinom();
            String s1 = view.polynomial1.getText();
            if(!parse.parsePolynom(s1, pol1)){
                return;
            }
            Polinom pol2 = new Polinom();
            integ.integrate(pol1, pol2);
            view.polynomial3.setText(pol2.toString());
        }
    }
    class MultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Multiplication mul = new Multiplication();
            Parse parse = new Parse();
            Polinom pol1 = new Polinom();
            String s1 = view.polynomial1.getText();
            if(!parse.parsePolynom(s1, pol1)){
                return;
            }
            Polinom pol2 = new Polinom();
            String s2 = view.polynomial2.getText();
            if (!parse.parsePolynom(s2, pol2)){
                return;
            }
            Polinom pol3 = new Polinom();
            mul.multiply(pol1, pol2, pol3);
            view.polynomial3.setText(pol3.toString());
        }
    }
    class ClearListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            view.polynomial1.setText("");
            view.polynomial2.setText("");
            view.polynomial3.setText("");
        }
    }

}
