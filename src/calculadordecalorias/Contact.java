package calculadordecalorias;

/**
 *
 * @author Iván Fuentes; (044) 981 125 1397
 */
public class Contact {
    
    private String nombre;
    private String genero;
    private String edad;
    private String estatura;
    private String peso;
    private String geb;
    private String imc;
    private String eaf;
    private String patologia;

    public Contact(String nombre, String genero, String edad, String estatura, String peso, String geb, String imc, String eaf, String patologia) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.geb = geb;
        this.imc = imc;
        this.eaf = eaf;
        this.patologia = patologia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getPeso() {
        return peso;
    }

    public String getGeb() {
        return geb;
    }

    public void setGeb(String geb) {
        this.geb = geb;
    }
    
    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String getEaf() {
        return eaf;
    }

    public void setEaf(String eaf) {
        this.eaf = eaf;
    }
    
    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }
    
}
