package hust.soict.hedspi.lab01.object;

public class FirstDegreeEquation {
    private double a;
    private  double b;

    public FirstDegreeEquation(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String resolve(double a, double b){
        if (a==0 && b==0) return ("The equation has countless solutions.");
        else if (a!=0) return ("The equation has the solution: " + -b/a + ".");
        else return ("The equation has no solution.");
    }
}
