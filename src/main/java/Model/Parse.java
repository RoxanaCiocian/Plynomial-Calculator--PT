package Model;

import javax.swing.*;


//this class is used to get the user input from a string into a polynomial
public class Parse {
    public boolean parsePolynom(String s1, Polinom pol1) {
        int i = 0, coef = 0, power = 0, k = 0, sign = 1;
        if(s1.equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "Input can't be empty",
                    "Dialog", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        while (i < s1.length()) {
            if(!(s1.charAt(i) >= '0' && s1.charAt(i) <= '9') &&
                    s1.charAt(i) != 'x' && s1.charAt(i) != '^' &&
                    s1.charAt(i) != '+' && s1.charAt(i) != '-')
            {
                JOptionPane.showMessageDialog(new JFrame(), "Invalid input characters",
                        "Dialog", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (k == 0) {
                if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                    coef = coef * 10 + (s1.charAt(i) - '0');
                    i++;
                } else { if (s1.charAt(i) == '-')
                    sign = -1;
                else { i++;
                    if(i < s1.length() && s1.charAt(i) == '^'){
                        i++;
                    }else k=2;
                    k++; }
                }continue; }
            if (k == 1){
                if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9'){
                    power = power * 10 + (s1.charAt(i) - '0');
                    i++;
                }else k++;
                continue; }
            if (coef == 0) coef = 1;
            if(s1.charAt(i - 1) == 'x') power = 1;
            Monom m = new Monom(coef * sign, power);
            pol1.add(m);
            coef = 0; power = 0 ; k = 0;
            if (s1.charAt(i) == '-')
                sign = -1;
            else sign = 1;
            i++; }
        if (coef == 0) coef = 1;
        if(s1.charAt(i - 1) == 'x') power = 1;
        Monom m = new Monom(coef * sign, power);
        pol1.add(m);
        return true; }
}
