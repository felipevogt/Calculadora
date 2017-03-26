package testcarrito;
import java.util.Scanner;

public class TestCarrito {
static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        CarritoCompra cc = new CarritoCompra();
        Calculadora c = new Calculadora();
       
        //Ingresar la cantidad de productos
        for (int i=0;i<5;i++){
           System.out.println("Ingrese la cantidad de producto " + (i+1));
           cc.setCantidad(i,entrada.nextInt());
        }
        
        //Multiplicar Productos por su precio y guardarlos en cantidadPorPrecio[]
        for (int i=0;i<5;i++){
            c.setNumb1(cc.getCantidad(i));
            c.setNumb2(cc.getPrecio(i));
            cc.setCantidadPorPrecio(i,c.multiplicar());   
        }
        
        //Sumar CantidadPorPrecio[] para tener el MontoFinal
        for (int i=0;i<5;i++){
            c.setNumb1(cc.getMontoFinal());
            c.setNumb2(cc.getCantidadPorPrecio(i));
            cc.setMontoFinal(c.sumar());
        }
        System.out.println("El monto total a pagar es de " + cc.getMontoFinal());

    }    
}
