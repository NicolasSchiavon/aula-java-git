
package calculadora;

public class Calculadora {
    public double soma(double n1,double n2){
        return n1+n2;
    }

    public double mult(double n1,double n2){
       return n1 * n2; 

    }
    
    public double div(double n1,double n2){
        return n1 / n2;
    }
    
    public double sub(double n1,double n2){
        return n1 - n2;
    }
    
    public static void main (String [] args){
        double n1 = 10;
        double n2 = 5;
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(n1, n2));
        System.out.println(calc.mult(n1, n2));
        System.out.println(calc.div(n1, n2));
        System.out.println(calc.sub(n1, n2));
    }
}
