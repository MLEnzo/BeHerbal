package emsyrpc.beherbal.entidades;

/**
 * Created by Pablo on 27/07/2017.
 */

public class estaturaU {

    private Integer idEstatura;
    private Double estatura;

    //constructores
    public estaturaU() {
    }

    public estaturaU(Integer idEstatura, Double estatura) {
        this.idEstatura = idEstatura;
        this.estatura = estatura;
    }

    //get and set


    public Integer getIdEstatura() {
        return idEstatura;
    }

    public void setIdEstatura(Integer idEstatura) {
        this.idEstatura = idEstatura;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
}
