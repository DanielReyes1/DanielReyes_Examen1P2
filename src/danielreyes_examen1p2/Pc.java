
package danielreyes_examen1p2;


public class Pc {
    private String direccionIp;
    private String mascaraRed;
    private String hostname;

    public Pc() {
    }

    public Pc(String direccionIp, String mascaraRed, String hostname) {
        this.direccionIp = direccionIp;
        this.mascaraRed = mascaraRed;
        this.hostname = hostname;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public String getMascaraRed() {
        return mascaraRed;
    }

    public void setMascaraRed(String mascaraRed) {
        this.mascaraRed = mascaraRed;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public String toString() {
        return "Host: "+hostname+"\nIp: " + direccionIp + "\nMask: " + mascaraRed ;
    }
    
    
}
