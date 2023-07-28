
package lab2p2_alejandrocardona;

public class Mesero {
    
    private String nombre , turno;
    private int edad;
    private double sueldo , propina;

    public Mesero(String nombre, String turno, int edad, double sueldo, double propina) {
        this.nombre = nombre;
        this.turno = turno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.propina = propina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }
    
    @Override
    public String toString(){
        String meseroString = getNombre()+" \n   "+getEdad()+" años\n   "+getPropina()+" Propina\n   "+ "Turno - "+getTurno()+"\n   "+getSueldo()+" Sueldo\n";
        
        
        return meseroString;
    }
    
    
}
