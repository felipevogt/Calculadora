package maquinapga;

public class Calculadora {   
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
}
