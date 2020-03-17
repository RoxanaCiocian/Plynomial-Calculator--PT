package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Multiplication {
    public void sum(Monom m1, Monom m2, Monom m3){
        float a = m1.getCoef();
        float b = m2.getCoef();
        float c = a + b;
        m3.setCoef(c);
    }
    public Polinom multiply(Polinom pol1, Polinom pol2, Polinom pol3){
        List<Monom> polynomial1 = pol1.getMonom();
        List<Monom> polynomial2 = pol2.getMonom();
        List<Monom> polynomial3 = new ArrayList<Monom>();
        Monom mon3;  int i = 0;
        for (Monom mon1 : polynomial1){
            for (Monom mon2 : polynomial2){
                float c = mon1.getCoef() * mon2.getCoef();
                mon3 = new Monom(c,mon1.getPower()+mon2.getPower());
                polynomial3.add(mon3);
            }
        } polynomial3.sort(Comparator.comparing(Monom::getPower).reversed());
        while(i < polynomial3.size()){
            if(i + 1 < polynomial3.size()){
                if(polynomial3.get(i).getPower() == polynomial3.get(i + 1).getPower()){
                    Monom a = new Monom(0,0);
                    sum(polynomial3.get(i), polynomial3.get(i + 1), a);
                    int p = polynomial3.get(i).getPower();
                    if (a.getCoef() != 0){
                        polynomial3.set(i + 1, new Monom(a.getCoef(), p));
                    }
                    else{
                        polynomial3.remove(i+1);
                    }
                }else
                    pol3.add(polynomial3.get(i));
            }i++;
        }
        pol3.add(polynomial3.get(i - 1));
        return pol3;
    }
}

