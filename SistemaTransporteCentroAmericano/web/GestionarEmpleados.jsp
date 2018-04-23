<%-- 
    Document   : index
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
        DaoEmpleado daoEmpleado=new DaoEmpleado();
        %>
    </head>
    <body>
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
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    List<Empleado> lisE=daoEmpleado.mostrar();
                    for (Empleado em : lisE) {
                    %>
                    <td><%= em.getIdempleado() %></td>
                    <td><%= em.getNombre() %></td>
                    <td><%= em.getDui() %></td>
                    <td><%= em.getNit() %></td>                    
                    <td><%= em.getLicencia() %></td>
                    <td><%= em.getDireccion() %></td>
                    <td><%= em.getTel() %></td>
                </tr><%        
                        }
                    %>
            </tbody>
        </table>

    </body>
</html>
