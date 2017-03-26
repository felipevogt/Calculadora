package maquinapga;


public class MaquinaPGA {
    //Atributos
    private int cantidadAsignaturas = 0;
    private double promedioAsignatura[];
    private int horasAsignatura[];
    private double pesoAsignatura[];
    private int totalHoras;
    private double promedioGeneralAcumulado;
    
    
    //Setter & Getter
    public void setCantidadAsignaturas(int cantidadAsignaturas){
        this.cantidadAsignaturas = cantidadAsignaturas;
    }
    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }
    
    public double getPromedioAsignatura(int i) {
        return promedioAsignatura[i];
    }
    public void setPromedioAsignatura(int i, double promedioAsignatura) {
        this.promedioAsignatura[i] = promedioAsignatura;
    }
    
    public int getHorasAsignatura(int i) {
        return horasAsignatura[i];
    }
    public void setHorasAsignatura(int i, int horasAsignatura) {
        this.horasAsignatura[i] = horasAsignatura;
    }
    
    public double getPesoAsignatura(int i) {
        return pesoAsignatura[i];
    }
    public void setPesoAsignatura(int i, double pesoAsignatura) {
        this.pesoAsignatura[i] = pesoAsignatura;
    }
    
    public int getTotalHoras() {
        return totalHoras;
    }
    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
    
    public double getPromedioGeneralAcumulado() {
        return promedioGeneralAcumulado;
    }
    public void setPromedioGeneralAcumulado(double promedioGeneralAcumulado) {
        this.promedioGeneralAcumulado = promedioGeneralAcumulado;
    }
    
    //Metodos
    public void largoArreglos(){
        this.promedioAsignatura = new double [this.cantidadAsignaturas];
        this.horasAsignatura = new int [this.cantidadAsignaturas];
        this.pesoAsignatura = new double [this.cantidadAsignaturas];
    }

    
}
