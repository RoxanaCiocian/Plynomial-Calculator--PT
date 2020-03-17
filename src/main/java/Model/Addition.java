package Model;

import java.util.ArrayList;
import java.util.List;

public class Addition {
    public void sum(Monom m1, Monom m2, Monom m3){
        float a = m1.getCoef();
        float b = m2.getCoef();
        float c = a + b;
        m3.setCoef(c);
    }
    public Polinom add(Polinom pol1, Polinom pol2, Polinom pol3){
        List<Monom> polynomial1 = pol1.getMonom();
        List<Monom> polynomial2 = pol2.getMonom();
        int i = 0, j = 0;
        while(i < polynomial1.size() && j < polynomial2.size()){
            if(polynomial1.get(i).getPower() == polynomial2.get(j).getPower()){
                Monom c =  new Monom(0,0);
                sum(polynomial1.get(i), polynomial2.get(j),c);
                if (c.getCoef() != 0)
                    pol3.add( new Monom(c.getCoef(),polynomial1.get(i).getPower()));
                i++;
                j++;
            } else if (polynomial1.get(i).getPower() > polynomial2.get(j).getPower()){
                Monom c = polynomial1.get(i);
                pol3.add(new Monom(c.getCoef(),polynomial1.get(i).getPower()));
                i++;
            } else {Monom c = polynomial2.get(j);
                pol3.add(new Monom(c.getCoef(), polynomial2.get(j).getPower()));
                j++;}

        }while (i < polynomial1.size()){
            Monom c = polynomial1.get(i);
            pol3.add(new Monom(c.getCoef(), polynomial1.get(i).getPower()));
            i++;
        }while (j < polynomial2.size()){
            Monom c = polynomial2.get(j);
            pol3.add(new Monom(c.getCoef(), polynomial2.get(j).getPower()));
            j++;
        }
        return pol3;
    }

}
