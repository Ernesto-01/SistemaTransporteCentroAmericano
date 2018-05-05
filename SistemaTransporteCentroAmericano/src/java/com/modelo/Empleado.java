
package com.modelo;

/**
 * Nombre de la clase: Empleado
 * Fecha de creacion: 21-4-2018
 * CopyRight: FuturoDesarrollador de S.A de C.V.
 * Version: 1.0
 * @author Ernesto Rosales
 */
public class Empleado {
    //<editor-fold defaultstate="collapsed" desc="Declaracion de bariables">
    
    private int idempleado;
    private String nombre;
    private String dui;
    private String nit;
    private int licencia;
    private String direccion;
    private String tel;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    
    public Empleado() {
    
    }
    
    public Empleado(int idempleado, String nombre, String dui, String nit, int licencia, String direccion, String tel) {
        this.idempleado = idempleado;
        this.nombre = nombre;
        this.dui = dui;
        this.nit = nit;
        this.licencia = licencia;
        this.direccion = direccion;
        this.tel = tel;
    }
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Ocultacion de datos(Getters and setters)">
    
    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
//</editor-fold>
    
}
