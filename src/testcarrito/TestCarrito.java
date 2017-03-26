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
        
        //Agregar, quitar o pagar
        int opcion = 0;
        while (opcion <= 0 || opcion > 3){
                //Inicio del Menu
                System.out.println("El monto total a pagar es de " + cc.getMontoFinal());
                System.out.println("Seleccione una opción: ");
                System.out.println("(1) Agregar productos");
                System.out.println("(2) Quitar productos");
                System.out.println("(3) Pagar");
                opcion = entrada.nextInt();
                if (opcion <= 0 || opcion > 3){
                    System.out.println("Seleccione la opcion correcta");
                }
                else{
                    switch(opcion)
                    {
                    case 1:
                    {
                        //Selección de producto y validación
                        int producto = 0;
                        System.out.println("Seleccione el producto 1, 2, 3, 4 o 5");
                        while (producto <= 0 || producto > 5){
                            producto = entrada.nextInt();
                            if (producto <= 0 || producto > 5){
                                System.out.println("Seleccione el producto correcto");
                            }
                        }
                        //Ingresar cantidad que se desea agregar, con validación
                        System.out.println("Ingrese la cantidad de producto "+ producto + " que desea agregar: ");
                        int cantidad = -1;
                        while (cantidad < 0){
                            cantidad = entrada.nextInt();
                            if (cantidad < 0){
                                System.out.println("Numero no valido");
                            }
                        }
                        //Agregar el monto por agregar productos al MontoFinal
                        cc.agregarProducto(producto - 1, cantidad);
                        c.setNumb1(cantidad);
                        c.setNumb2(cc.getPrecio(producto - 1));
                        c.setNumb1(c.multiplicar());
                        c.setNumb2(cc.getMontoFinal());
                        cc.setMontoFinal(c.sumar());
                        opcion=0;      
                        break;
                    }
                    case 2:
                    {
                        //Selección de productos y validación
                        int producto = 0;
                        System.out.println("Seleccione el producto 1, 2, 3, 4 o 5");
                        while (producto <= 0 || producto > 5){
                            producto = entrada.nextInt();
                            if (producto <= 0 || producto > 5){
                                System.out.println("Seleccione el producto correcto");
                            }
                        }
                        //Cantidad que se desea quitar de algun producto
                        System.out.println("Ingrese la cantidad de producto "+ producto + " que desea quitar: ");
                        int cantidad = -1;
                        while (cantidad < 0 || cantidad > cc.getCantidad(producto - 1)){
                            cantidad = entrada.nextInt();
                            if (cantidad < 0 || cantidad > cc.getCantidad(producto - 1)){
                                System.out.println("Numero no valido");
                            }
                        }  
                        //Quitar al MontoFinal el valor de la cantidad quitada
                        cc.quitarProducto(producto - 1, cantidad);
                        c.setNumb2(cantidad);
                        c.setNumb1(cc.getPrecio(producto - 1));
                        c.setNumb2(c.multiplicar());
                        c.setNumb1(cc.getMontoFinal());
                        cc.setMontoFinal(c.restar());
                        opcion = 0;   
                        break;
                    }
                    case 3:
                    {
                        //Ingresar el efectivo, con validación
                        System.out.println("Ingrese monto a cancelar");
                        int efectivo = 0;
                        while (efectivo <= 0 || efectivo < cc.getMontoFinal()){
                            efectivo = entrada.nextInt();
                            if (efectivo <= 0 || efectivo < cc.getMontoFinal()){
                                System.out.println("Falta dinero, quite algun producto");
                                opcion = 0;
                                break;
                            }
                        }
                        //Terminar de pagar y ver si recibe vuelto
                        if (efectivo >= cc.getMontoFinal()){
                            c.setNumb2(cc.getMontoFinal());
                            c.setNumb1(efectivo);
                            System.out.println("Gracias por su compra, su vuelto es de: "+ c.restar() + " Pesos");
                            break;
                        }
                    } 
                    }
                }
        }
    }    
}
