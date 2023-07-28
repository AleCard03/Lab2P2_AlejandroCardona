/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_alejandrocardona;

/**
 *
 * @author jets
 */
public class Bartender {
    
    private String nombre , turno;
    private int edad , licores;
    private double sueldo ;

    public Bartender(String nombre, String turno, int edad, double sueldo, int licores) {
        this.nombre = nombre;
        this.turno = turno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.licores = licores;
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

    public int getLicores() {
        return licores;
    }

    public void setLicores(int licores) {
        this.licores = licores;
    }

    @Override
    public String toString(){
        String licoresString = getNombre()+" \n   "+getEdad()+" años\n   "+getLicores()+" Licores\n   "+ "Turno - "+getTurno()+"\n   "+getSueldo()+" Sueldo\n";
        
        
        return licoresString;
    }
    
    
    
}
