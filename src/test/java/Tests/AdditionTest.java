package Tests;

import static org.junit.Assert.*;
import Controller.Control;
import View.GUI;
import org.junit.Test;

public class AdditionTest {
    @Test
    public void test1(){
        GUI view = new GUI();
        Control control = new Control(view);
        view.polynomial1.setText("3x^2+2");
        view.polynomial2.setText("5x-4");
        view.getAddition().doClick();
        assertEquals("3x^2+5x-2", view.getPol3().getText());
    }

    @Test
    public void test2(){
        GUI view = new GUI();
        Control control = new Control(view);
        view.polynomial1.setText("3x^3-4x^2-8x+2");
        view.polynomial2.setText("5x^4-4");
        view.getAddition().doClick();
        assertEquals("5x^4+3x^3-4x^2-8x-2", view.getPol3().getText());
    }

}
