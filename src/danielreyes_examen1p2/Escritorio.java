
package danielreyes_examen1p2;


public class Escritorio extends Pc{
    private int capram;
    private int capalmacen;
    private String tipo;
    private boolean tarjetagrafica;

    public Escritorio() {
        super();
    }

    public Escritorio(int capram, int capalmacen, String tipo, boolean tarjetagrafica, String direccionIp, String mascaraRed, String hostname) {
        super(direccionIp, mascaraRed, hostname);
        this.capram = capram;
        this.capalmacen = capalmacen;
        this.tipo = tipo;
        this.tarjetagrafica = tarjetagrafica;
    }

    public int getCapram() {
        return capram;
    }

    public void setCapram(int capram) {
        this.capram = capram;
    }

    public int getCapalmacen() {
        return capalmacen;
    }

    public void setCapalmacen(int capalmacen) {
        this.capalmacen = capalmacen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTarjetagrafica() {
        return tarjetagrafica;
    }

    public void setTarjetagrafica(boolean tarjetagrafica) {
        this.tarjetagrafica = tarjetagrafica;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTipo: "+ tipo+"\nRam: " + capram +"GB"+ "\nAlmacenamiento: " + capalmacen + "GB";
    }
    
    
    
}
