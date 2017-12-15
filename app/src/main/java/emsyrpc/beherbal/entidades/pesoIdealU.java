package emsyrpc.beherbal.entidades;

/**
 * Created by Pablo on 27/07/2017.
 */

public class pesoIdealU {

    private Integer idPesoIdeal;
    private Double pi_min;
    private Double pi_med;
    private Double pi_max;

    public pesoIdealU() {
    }

    public pesoIdealU(Integer idPesoIdeal, Double pi_min, Double pi_med, Double pi_max) {
        this.idPesoIdeal = idPesoIdeal;
        this.pi_min = pi_min;
        this.pi_med = pi_med;
        this.pi_max = pi_max;
    }

    public Integer getIdPesoIdeal() {
        return idPesoIdeal;
    }

    public void setIdPesoIdeal(Integer idPesoIdeal) {
        this.idPesoIdeal = idPesoIdeal;
    }

    public Double getPi_min() {
        return pi_min;
    }

    public void setPi_min(Double pi_min) {
        this.pi_min = pi_min;
    }

    public Double getPi_med() {
        return pi_med;
    }

    public void setPi_med(Double pi_med) {
        this.pi_med = pi_med;
    }

    public Double getPi_max() {
        return pi_max;
    }

    public void setPi_max(Double pi_max) {
        this.pi_max = pi_max;
    }
}
