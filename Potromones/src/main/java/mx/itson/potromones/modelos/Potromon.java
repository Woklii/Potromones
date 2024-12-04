package mx.itson.potromones.modelos;

/**
 *
 * @author Genius Lab
 */
public class Potromon {

    private int id;
    private String nombre;
    private String poder1;
    private String poder2;
    private String poder3;
    private String poder4;
    private String desc;
    private int nivelPoder;
    private String entrenador;

     //      ******* Constructor *******
    public Potromon(int id, String nombre, String poder1, String poder2, String poder3, String poder4, int nivelPoder, String entrenador){
        this.nombre = nombre;
        this.poder1 = poder1;
        this.poder2 = poder2;
        this.poder3 = poder3;
        this.poder4 = poder4;
        this.nivelPoder = nivelPoder;
        this.entrenador = entrenador;
    }
    
    public Potromon(){
    
    }
    
    //      ******* Getter & Setters *******
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the poder1
     */
    public String getPoder1() {
        return poder1;
    }

    /**
     * @param poder1 the poder1 to set
     */
    public void setPoder1(String poder1) {
        this.poder1 = poder1;
    }

    /**
     * @return the poder2
     */
    public String getPoder2() {
        return poder2;
    }

    /**
     * @param poder2 the poder2 to set
     */
    public void setPoder2(String poder2) {
        this.poder2 = poder2;
    }

    /**
     * @return the poder3
     */
    public String getPoder3() {
        return poder3;
    }

    /**
     * @param poder3 the poder3 to set
     */
    public void setPoder3(String poder3) {
        this.poder3 = poder3;
    }

    /**
     * @return the poder4
     */
    public String getPoder4() {
        return poder4;
    }

    /**
     * @param poder4 the poder4 to set
     */
    public void setPoder4(String poder4) {
        this.poder4 = poder4;
    }

    /**
     * @return the nivelPoder
     */
    public int getNivelPoder() {
        return nivelPoder;
    }

    /**
     * @param nivelPoder the nivelPoder to set
     */
    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    @Override
    public String toString(){
        return "Potromon{" +
                "nombre='" + nombre + '\'' +
                ", nivelPoder=" + nivelPoder +
                '}';
    }

    /**
     * @return the entrenador
     */
    public String getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
