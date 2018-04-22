
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Nombre de la clase: Conexion
 * Fecha de creacion: 21-4-2018
 * CopyRight: FuturoDesarrollador de S.A de C.V.
 * Version: 1.0
 * @author Ernesto Rosales
 */
public class Conexion {
    //<editor-fold defaultstate="collapsed" desc="Declaracion de variable">
    private Connection con;
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Ocultacion de datos">
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("postgres", "jdbc:postgresql://localhost:5432/db_v3", "123");   
        } catch (Exception e) {
        }
    }
    
    public void desconectar(){
        try {
            if (con!=null && con.isClosed()==false) {
                con.close();
            }
        } catch (Exception e) {
        }
    }
//</editor-fold>
}
