package com.modelo;

import com.conexion.Conexion;
import java.sql.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Nombre de la clase: DaoEmpleado
 * Fecha de creacion: 21-4-2018
 * CopyRight: FuturoDesarrollador de S.A de C.V.
 * Version: 1.0
 * @author Ernesto Rosales
 */
public class DaoEmpleado extends Conexion {

    //<editor-fold defaultstate="collapsed" desc="Metodo Insertar Empleado">
    public void insertar(Empleado emp) {
        try {
            this.conectar();
            //insert into empleado values(1,'Nombre','Dui','Nit',1,'Direccion','tel');
            String sql="insert into empleado values(?,?,?,?,?,?,?)";
            PreparedStatement ps=this.getCon().prepareStatement(sql);
            ps.setInt(1, emp.getIdempleado());
            ps.setString(2, emp.getNombre());
            ps.setString(3, emp.getDui());
            ps.setString(4, emp.getNit());
            ps.setInt(5, emp.getLicencia());
            ps.setString(6, emp.getDireccion());
            ps.setString(7, emp.getTel());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        } finally {
            this.desconectar();
        }
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodo Actualizar Empleado">
    public void actualizar(Empleado emp){
        try {
            this.conectar();
            //update empleado set nombre='Pedro', dui='123',nit='4587', licencia=1,direccion='San Salvador',tel='2323-0252' where idempleado=1;
            String sql="update empleado set nombre=?, dui=?,nit=?, licencia=?,direccion=?,tel=? where idempleado=?";
            PreparedStatement ps=this.getCon().prepareStatement(sql);
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getDireccion());
            ps.setString(3, emp.getDui());
            ps.setString(4, emp.getNit());
            ps.setInt(5, emp.getLicencia());
            ps.setString(6, emp.getTel());
            ps.setInt(7, emp.getIdempleado());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }finally{
        this.desconectar();
        }
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodo Eliminar Empleado">
    public void eliminar(Empleado emp){
        try {
            this.conectar();
            //delete from empleado where idempleado =1;
            String sql="delete from empleado where idempleado =? ";
            PreparedStatement ps=this.getCon().prepareStatement(sql);
            ps.setInt(1, emp.getIdempleado());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }finally{
        this.desconectar();
        }
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodo Mostrar Empleados">
    public List<Empleado> mostrar(){
        this.conectar();
        List lisE=new ArrayList();
        
        try {
        Empleado emp;
        String sql="select * from empleado";
        PreparedStatement ps=this.getCon().prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        
            while (rs.next()) {                
            emp=new Empleado();
            
            emp.setIdempleado(rs.getInt("idempleado"));
            emp.setDui(rs.getString("dui"));
            emp.setNit(rs.getString("nit"));
            emp.setLicencia(rs.getInt("licencia"));
            emp.setDireccion(rs.getString("direccion"));
            emp.setTel(rs.getString("tel"));
            
            lisE.add(emp);
            }
            
        } catch (Exception e) {
        }finally{
        this.desconectar();
        }
        return lisE;
    }
//</editor-fold>
}
