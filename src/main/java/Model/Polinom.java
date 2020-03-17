package Model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Polinom {
    private ArrayList<Monom> monom;
    public Polinom(){
        monom = new ArrayList<Monom>();
    }
    public void add(Monom mon) {this.monom.add(mon);}

    public String toString(){
        String result = "";
        DecimalFormat sample;
        for (Monom mon: this.monom){
            if (mon.getCoef() == (int)mon.getCoef())
                sample = new DecimalFormat("0");
            else sample = new DecimalFormat("0.00");
            if(mon.getCoef() > 0)
                if(!result.equals(""))
                    result = result + "+";
            if(mon.getCoef() != 1 && mon.getCoef() != 0 && mon.getCoef() != -1)
                result= result + sample.format(mon.getCoef());
            else {
                if (mon.getPower() == 0)
                    if (mon.getCoef() != 0)
                        result = result + sample.format(mon.getCoef());

                if (mon.getPower() >= 1)
                    if (mon.getCoef() != 0)
                        if (mon.getCoef() < 0)
                            result = result + "-";
            }if (mon.getPower()>=2)
                result=result+"x^" + mon.getPower();

            if (mon.getPower()==1)
                result=result+"x";

        }if (result.equals(""))
            return "0";
        return result;
    }
    public List<Monom> getMonom(){return monom;}
}

