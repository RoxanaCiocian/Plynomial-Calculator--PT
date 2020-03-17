package Tests;

import Controller.Control;
import View.GUI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DerivationTest {
    @Test
    public void test1(){
        GUI view = new GUI();
        Control control = new Control(view);
        view.polynomial1.setText("3x^2+2");
        view.getDerivative().doClick();
        assertEquals("6x", view.getPol3().getText());
    }

    @Test
    public void test2(){
        GUI view = new GUI();
        Control control = new Control(view);
        view.polynomial1.setText("3x^3-4x^2-8x+2");
        view.getDerivative().doClick();
        assertEquals("9x^2-8x-8", view.getPol3().getText());
    }

}
