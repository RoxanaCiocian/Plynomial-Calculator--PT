package Tests;

import Controller.Control;
import View.GUI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    @Test
    public void test1(){
        GUI view = new GUI();
        Control control = new Control(view);
        view.polynomial1.setText("2x^2+2");
        view.polynomial2.setText("x^2-2");
        view.getMultiplication().doClick();
        assertEquals("2x^4-2x^2-4", view.getPol3().getText());
    }

    @Test
    public void test2(){
        GUI view = new GUI();
        Control control = new Control(view);
        view.polynomial1.setText("2x^4+2x^3-2x");
        view.polynomial2.setText("x^3+2x^2+3x");
        view.getMultiplication().doClick();
        assertEquals("2x^7+6x^6+10x^5+4x^4-4x^3-6x^2", view.getPol3().getText());
    }

}
