package calculadora;
import java.util.Scanner;

public class Calculadora {
    static Scanner entrada = new Scanner(System.in);
    
    //Atributos
    private double numb1;
    private double numb2;

    
    //Setter y Getter
    public double getNumb1() {
        return numb1;
    }
    public void setNumb1(double numb1) {
        this.numb1 = numb1;
    }
    public double getNumb2() {
        return numb2;
    }
    public void setNumb2(double numb2) {
        this.numb2 = numb2;
    }

    //Metodos
    public double sumar(){
        return (this.numb1 + this.numb2);
    }
    public double restar(){
        return (this.numb1 - this.numb2);
    }
    public double multiplicar(){
        return (this.numb1 * this.numb2);
    }
    public double dividir(){
        return (this.numb1 / this.numb2);
    }
    public void mostrar(){
        System.out.println("El resultado de la suma es: " + sumar());
        System.out.println("El resultado de la resta es: " + restar());
        System.out.println("El resultado de la multiplicación es: " + multiplicar());
        System.out.println("El resultado de la división es: " + dividir());  
    }

    public static void main(String[] args) {
     
        Calculadora c = new Calculadora();
        System.out.println("Ingrese numero 1");
        c.setNumb1(entrada.nextDouble());
        System.out.println("Ingrese numero 2");
        c.setNumb2(entrada.nextDouble());
        c.mostrar();

    }
    
}
