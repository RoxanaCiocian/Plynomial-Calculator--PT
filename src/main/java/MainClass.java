import Controller.Control;
import View.GUI;

public class MainClass {
    public static void main (String[] args){
        GUI pannel = new GUI();
        Control control = new Control(pannel);
        pannel.setVisible(true);
    }
}
