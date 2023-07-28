/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_alejandrocardona;

/**
 *
 * @author jets
 */
public class Chefs {
    
    private String Nombre , turno;
    private int edad , estrellas ;
    private double sueldo, propina;

    public Chefs(String Nombre, int edad, int estrellas, String turno, double sueldo) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.estrellas = estrellas;
        this.turno = turno;
        this.sueldo = sueldo;
        this.propina = propina;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        String chefString = getNombre()+" \n   "+getEdad()+" años\n   "+getEstrellas()+" Estrellas\n   "+ "Turno - "+getTurno()+"\n   "+getSueldo()+" Sueldo\n";
        
        
        return chefString;
    }
}
