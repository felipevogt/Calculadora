package testcarrito;
import java.util.Scanner;

public class Calculadora {
    static Scanner entrada = new Scanner(System.in);
    
    //Atributos
    private int numb1;
    private int numb2;

    //Setter y Getter
    public double getNumb1() {
        return numb1;
    }
    public void setNumb1(int numb1) {
        this.numb1 = numb1;
    }
    public double getNumb2() {
        return numb2;
    }
    public void setNumb2(int numb2) {
        this.numb2 = numb2;
    }

    //Metodos
    public int sumar(){
        return (this.numb1 + this.numb2);
    }
    public int restar(){
        return (this.numb1 - this.numb2);
    }
    public int multiplicar(){
        return (this.numb1 * this.numb2);
    }
    public int dividir(){
        return (this.numb1 / this.numb2);
    }
    
}
