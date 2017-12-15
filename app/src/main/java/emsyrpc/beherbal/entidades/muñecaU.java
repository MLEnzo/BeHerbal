package emsyrpc.beherbal.entidades;

/**
 * Created by Pablo on 27/07/2017.
 */

public class muñecaU {

    private Integer idMuñeca;
    private String tamaño;

    public muñecaU() {
    }

    public muñecaU(Integer idMuñeca, String tamaño) {
        this.idMuñeca = idMuñeca;
        this.tamaño = tamaño;
    }

    public Integer getIdMuñeca() {
        return idMuñeca;
    }

    public void setIdMuñeca(Integer idMuñeca) {
        this.idMuñeca = idMuñeca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
