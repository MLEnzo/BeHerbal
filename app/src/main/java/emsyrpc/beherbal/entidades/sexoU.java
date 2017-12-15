package emsyrpc.beherbal.entidades;

/**
 * Created by Pablo on 26/07/2017.
 */

public class sexoU {


    private Integer IdSexo;
    private String sexo;

    public sexoU(Integer idSexo, String sexo) {
        IdSexo = idSexo;
        this.sexo = sexo;
    }

    public sexoU() {
    }

    public Integer getIdSexo() {
        return IdSexo;
    }

    public void setIdSexo(Integer idSexo) {
        IdSexo = idSexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
