package Tests;

import Controller.Control;
import View.GUI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {
    @Test
    public void test1(){
        GUI view = new GUI();
        Control control = new Control(view);
        view.polynomial1.setText("3x^2+2");
        view.getIntegration().doClick();
        assertEquals("x^3+2x", view.getPol3().getText());
    }

    @Test
    public void test2(){
        GUI view = new GUI();
        Control control = new Control(view);
        view.polynomial1.setText("3x^3-4x^2-8x+2");
        view.getIntegration().doClick();
        assertEquals("0.75x^4-1.33x^3-4x^2+2x", view.getPol3().getText());
    }

}
