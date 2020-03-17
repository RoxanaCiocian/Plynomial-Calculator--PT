package Model;

import java.util.List;

public class Derivative {
    public Polinom derivative(Polinom pol1, Polinom pol2){
        List<Monom> polynomial1 = pol1.getMonom();
        for(Monom mon : polynomial1){
            float c = mon.getCoef();
            int p = mon.getPower();
            c = c * p;
            p--;
            pol2.add(new Monom(c,p));
        }
        return pol2;
    }
}
