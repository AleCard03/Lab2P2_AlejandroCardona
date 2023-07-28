
package lab2p2_alejandrocardona;

public class Mesa {
    
    private int platos , utensilios;
    private double precioTotal;

    public Mesa(int platos, int utensilios, double precioTotal) {
        this.platos = platos;
        this.utensilios = utensilios;
        this.precioTotal = precioTotal;
    }

    public int getPlatos() {
        return platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }

    public int getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(int utensilios) {
        this.utensilios = utensilios;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    @Override
    public String toString (){
        
        String mesaString = getUtensilios()+" Utensilios \n"+getPlatos()+" platos\n   "+getPrecioTotal()+" Precio Total\n";
        
        return mesaString;
    }
    
}
