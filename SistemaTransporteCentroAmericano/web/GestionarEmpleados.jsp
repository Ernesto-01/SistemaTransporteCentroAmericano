<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : GestionarEmpleados
    Created on : 04-21-2018, 08:14:41 PM
    Author     : Ernesto
--%>

<%@page import="com.modelo.DaoEmpleado" %>
<%@page import="com.modelo.Empleado" %>
<%@page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            
            DaoEmpleado daoEmpleado = new DaoEmpleado();
        %>
        <script >
            function llenar(id, nombre, dui, nit, licencia, direccion, telefono) {
                document.frm.txtId.value = id;
                document.frm.txtNombre.value = nombre;
                document.frm.txtDui.value = dui;
                document.frm.txtNit.value = nit;
                document.frm.txtLicencia.value = licencia;
                document.frm.txtDireccion.value = direccion;
                document.frm.txtTelefono.value = telefono;
            }
        </script>
        <%
            if (request.getAttribute("msj") != null) {
        %>
        <script>
            alert('<%= request.getAttribute("msj")%>')
        </script>
        <%
            }
        %>
    </head>
    <body>
    <center>
        <h1>Gestionar Motoristas</h1>
        <form name="frm" action="procesarEmpleado" method="POST">

            <table >
                <tr>
                    <td>ID</td><td><input type="text" name="txtId"></td>
                </tr>
                <tr>
                    <td>Nombre</td><td><input type="text" name="txtNombre"></td>
                </tr>
                <tr>
                    <td>DUI</td><td><input type="text" name="txtDui"></td>
                </tr>
                <tr>
                    <td>NIT</td><td><input type="text" name="txtNit"></td>
                </tr>
                <tr>
                    <td>Licencia</td><td>
                <select name="txtLicencia">
                    <option value="0">No</option>
                    <option value="1">Liviana</option>
                    <option value="2">Pesada</option>
                    <option value="3">Pesada T</option>
                </select>

                </td>
                </tr>
                <tr>
                    <td>Direccion</td><td><input type="text" name="txtDireccion"></td>
                </tr>
                <tr>
                    <td>Telefono<td><input type="text" name="txtTelefono"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="btnInsertar" value="Insertar">
                        <input type="submit" name="btnModificar" value="Modificar">
                        <input type="submit" name="btnEliminar" value="Eliminar">
                        <input type="reset" name="btnNuevo" value="Nuevo">
                    </td>
                </tr>



            </table>
        </form>
        <br><hr><br>

        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>DUI</th>
                    <th>NIT</th>
                    <th>Licencia</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                        List<Empleado> lisE = daoEmpleado.mostrar();
                        for (Empleado em : lisE) {
                    %>
                    <td><%= em.getIdempleado()%></td>
                    <td><%= em.getNombre()%></td>
                    <td><%= em.getDui()%></td>
                    <td><%= em.getNit()%></td>                    
                    <td><%= em.getLicencia()%></td>
                    <td><%= em.getDireccion()%></td>
                    <td><%= em.getTel()%></td>
                    <td>
                        <a href="javascript:llenar(<%= em.getIdempleado()%>,'<%= em.getNombre()%>','<%= em.getDui()%>','<%= em.getNit()%>',<%= em.getLicencia()%>,'<%= em.getDireccion()%>','<%= em.getTel()%>')">Seleccionar</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </center>
</body>
</html>
