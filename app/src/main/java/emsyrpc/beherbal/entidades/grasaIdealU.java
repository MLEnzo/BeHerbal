package emsyrpc.beherbal.entidades;

/**
 * Created by Pablo on 27/07/2017.
 */

public class grasaIdealU {

    private Integer idGrasaIdeal;
    private Double gr_min;
    private Double gr_med;
    private Double gr_max;


    public grasaIdealU() {
    }

    public grasaIdealU(Integer idGrasaIdeal, Double gr_min, Double gr_med, Double gr_max) {
        this.idGrasaIdeal = idGrasaIdeal;
        this.gr_min = gr_min;
        this.gr_med = gr_med;
        this.gr_max = gr_max;
    }

    public Integer getIdGrasaIdeal() {
        return idGrasaIdeal;
    }

    public void setIdGrasaIdeal(Integer idGrasaIdeal) {
        this.idGrasaIdeal = idGrasaIdeal;
    }

    public Double getGr_min() {
        return gr_min;
    }

    public void setGr_min(Double gr_min) {
        this.gr_min = gr_min;
    }

    public Double getGr_med() {
        return gr_med;
    }

    public void setGr_med(Double gr_med) {
        this.gr_med = gr_med;
    }

    public Double getGr_max() {
        return gr_max;
    }

    public void setGr_max(Double gr_max) {
        this.gr_max = gr_max;
    }
}
