/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

/**
 *
 * @author jeffe
 */
public class Ventana {
private String Nombres;
private String Apellidos;
private String Cedula;
private String Profeccion;
private String Correo;
private String Fecha;
private String Sexo;
private String Nacionalidad;
private String TipoSAngre;
private String Descripcion;
private String Preferencias;
private String CituacionLaboral;
private String Discaspacidad;
private String Residencia;
private String Otro;

    public Ventana(String Nombres, String Apellidos, String Cedula, String Profeccion, String Correo, String Fecha, String Sexo, String Nacionalidad, String TipoSAngre, String Descripcion, String CituacionLaboral, String Discaspacidad, String Residencia) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Profeccion = Profeccion;
        this.Correo = Correo;
        this.Fecha = Fecha;
        this.Sexo = Sexo;
        this.Nacionalidad = Nacionalidad;
        this.TipoSAngre = TipoSAngre;
        this.Descripcion = Descripcion;
        this.CituacionLaboral = CituacionLaboral;
        this.Discaspacidad = Discaspacidad;
        this.Residencia = Residencia;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getProfeccion() {
        return Profeccion;
    }

    public void setProfeccion(String Profeccion) {
        this.Profeccion = Profeccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getTipoSAngre() {
        return TipoSAngre;
    }

    public void setTipoSAngre(String TipoSAngre) {
        this.TipoSAngre = TipoSAngre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPreferencias() {
        return Preferencias;
    }

    public void setPreferencias(String Preferencias) {
        this.Preferencias = Preferencias;
    }

    public String getCituacionLaboral() {
        return CituacionLaboral;
    }

    public void setCituacionLaboral(String CituacionLaboral) {
        this.CituacionLaboral = CituacionLaboral;
    }

    public String getDiscaspacidad() {
        return Discaspacidad;
    }

    public void setDiscaspacidad(String Discaspacidad) {
        this.Discaspacidad = Discaspacidad;
    }

    public String getOtro() {
        return Otro;
    }

    public void setOtro(String Otro) {
        this.Otro = Otro;
    }


        

}
