package emsyrpc.beherbal.entidades;

/**
 * Created by Pablo on 26/07/2017.
 */

public class EdadU {

    private Integer idEdad;
    private Integer edad;

    public EdadU(Integer idEdad, Integer edad) {
        this.idEdad = idEdad;
        this.edad = edad;
    }

    public EdadU() {
    }


    public Integer getIdEdad() {
        return idEdad;
    }

    public void setIdEdad(Integer idEdad) {
        this.idEdad = idEdad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
