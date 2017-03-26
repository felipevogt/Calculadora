package testcarrito;
public class CarritoCompra {
    
    //Atributos
    private int Cantidad[] = new int [5];
    private int Precio[] = {1500,2000,3000,1000,500};
    private int cantidadPorPrecio[] = new int [5];
    private int montoFinal = 0;
    
    //Setter & Getter
    public void setCantidad(int i, int Cantidad) {
        this.Cantidad[i] = Cantidad;
    }
    public int getCantidad(int i) {
        return Cantidad[i];
    }
    public int getPrecio(int i) {
        return Precio[i];
    }
    public int getCantidadPorPrecio(int i) {
        return cantidadPorPrecio[i];
    }
    public void setCantidadPorPrecio(int i, int cantidadPorPrecio) {
        this.cantidadPorPrecio[i] = cantidadPorPrecio;
    }
    public int getMontoFinal() {
        return montoFinal;
    }
    public void setMontoFinal(int montoFinal) {
        this.montoFinal = montoFinal;
    }
    
    //Metodos
    public void agregarProducto(int i, int Agregado){
        Cantidad[i] = Cantidad[i] + Agregado;
    }
    public void quitarProducto(int i, int Agregado){
        Cantidad[i] = Cantidad[i] + Agregado;
    }
    

}
