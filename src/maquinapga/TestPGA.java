//https://github.com/felipevogt
package maquinapga;
import java.util.Scanner;

public class TestPGA {
static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args) {
        MaquinaPGA mpga = new MaquinaPGA();
        Calculadora c = new Calculadora();
        
        //Ingresar cantidad de asignaturas, con validación para que sean mayor a 0
        while (mpga.getCantidadAsignaturas() <= 0){
            System.out.println("ingrese la cantidad de asignaturas");
            mpga.setCantidadAsignaturas(entrada.nextInt());
            if (mpga.getCantidadAsignaturas() <= 0){
                System.out.println("Ingrese un numero valido");
            }
        }
        
        mpga.largoArreglos(); //Establece el largo de los arreglos promedioAsignatura[], horasAsignatura[] y pesoAsignatura[].
        
        //Ingresar el promedio de cada asignatura, entre los valores 1 y 7
        for (int i = 0; i < mpga.getCantidadAsignaturas(); i++){
            while (mpga.getPromedioAsignatura(i) < 1 || mpga.getPromedioAsignatura(i) > 7){
                System.out.println("ingrese el promedio de la asignatura " + (i + 1));
                mpga.setPromedioAsignatura(i, entrada.nextDouble());
                if (mpga.getPromedioAsignatura(i) < 1 || mpga.getPromedioAsignatura(i) > 7){
                    System.out.println("Ingrese un promedio entre 1 y 7");
                }
            }
        }
        
        //Ingresar las horas semanales para cada asignatura, con valores mayot a 0
        for (int i = 0; i < mpga.getCantidadAsignaturas(); i++){
            while (mpga.getHorasAsignatura(i) <= 0){
                System.out.println("Ingrese el numero de horas para la asignatura " + (i + 1));
                mpga.setHorasAsignatura(i, entrada.nextInt());
                if (mpga.getHorasAsignatura(i) <= 0){
                    System.out.println("Ingrese un numero correcto de horas");
                }
            }
        }
        
        //Calcula el total de horas.
        for (int i = 0; i < mpga.getCantidadAsignaturas(); i++){
            c.setNumb1(mpga.getHorasAsignatura(i));
            c.setNumb2(mpga.getTotalHoras());
            mpga.setTotalHoras((int) c.sumar());
        }
        
        //Calcula el peso de las asignaturas y llena el arreglo pesoAsignatura[]
        for (int i = 0; i < mpga.getCantidadAsignaturas(); i++){
            c.setNumb1(mpga.getHorasAsignatura(i));
            c.setNumb2(mpga.getTotalHoras());
            mpga.setPesoAsignatura(i, c.dividir());
        }
        
        //Calcula el PGA
        for (int i = 0; i < mpga.getCantidadAsignaturas(); i++){
            c.setNumb1(mpga.getPromedioAsignatura(i));
            c.setNumb2(mpga.getPesoAsignatura(i));
            c.setNumb1(c.multiplicar());
            c.setNumb2(mpga.getPromedioGeneralAcumulado());
            mpga.setPromedioGeneralAcumulado(c.sumar());           
        }
        
        System.out.println("El PGA es de " + mpga.getPromedioGeneralAcumulado());
            
    }
    
}
