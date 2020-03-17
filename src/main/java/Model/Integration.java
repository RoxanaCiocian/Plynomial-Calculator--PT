package Model;

import java.util.List;

public class Integration {
    public Polinom integrate(Polinom pol1, Polinom pol2){
        List<Monom> polynomial1 = pol1.getMonom();
        for (Monom mon : polynomial1){
            float c = mon.getCoef();
            int p = mon.getPower();
            pol2.add(new Monom(c/(p + 1),p + 1));
        }
        return pol2;
    }
}
