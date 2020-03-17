package Model;

public class Monom {
    private float coef;
    private int power;
    public Monom(float coef, int power)
    {
        setPower(power);
        setCoef(coef);
    }
    public String toString() {
        return this.coef+"x^"+this.power;}
    public float getCoef() {
        return this.coef;}
    public void setCoef(float coef) {
        this.coef=coef;}
    public int getPower() {
        return this.power;}
    public void setPower(int power2) {
        this.power=power2;}

}
