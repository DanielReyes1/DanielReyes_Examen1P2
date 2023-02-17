
package danielreyes_examen1p2;


public class Laptops extends Pc{
    private String marca;
    private String defpantalla;
    private boolean RGB;

    public Laptops() {
        super();
    }

    public Laptops(String marca, String defpantalla, boolean RGB, String direccionIp, String mascaraRed, String hostname) {
        super(direccionIp, mascaraRed, hostname);
        this.marca = marca;
        this.defpantalla = defpantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefpantalla() {
        return defpantalla;
    }

    public void setDefpantalla(String defpantalla) {
        this.defpantalla = defpantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMarca: " + marca + "\nDef: " + defpantalla + "\nRGB: " + RGB;
    }
    
    
}
