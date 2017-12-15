package emsyrpc.beherbal.entidades;

import android.widget.ImageView;

import java.sql.Blob;

/**
 * Created by Pablo on 27/07/2017.
 */

public class Usuario {

    private Integer idUsuario;
    private String nombre;
    private String apellido;
    private Blob fotoUsuario;
    private Double pesoActual;
    private Double grasaAc;
    private Double imc;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombre, String apellido, Blob fotoUsuario, Double pesoActual, Double grasaAc, Double imc) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fotoUsuario = fotoUsuario;
        this.pesoActual = pesoActual;
        this.grasaAc = grasaAc;
        this.imc = imc;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Blob getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(Blob fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    public Double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(Double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Double getGrasaAc() {
        return grasaAc;
    }

    public void setGrasaAc(Double grasaAc) {
        this.grasaAc = grasaAc;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }
}
