package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.modelo.DaoEmpleado;
import com.modelo.Empleado;
import java.util.List;

public final class GestionarEmpleados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");


            DaoEmpleado daoEmpleado = new DaoEmpleado();
        
      out.write("\n");
      out.write("        <script >\n");
      out.write("            function llenar(id, nombre, dui, nit, licencia, direccion, telefono) {\n");
      out.write("                document.frm.txtId.value = id;\n");
      out.write("                document.frm.txtNombre.value = nombre;\n");
      out.write("                document.frm.txtDui.value = dui;\n");
      out.write("                document.frm.txtNit.value = nit;\n");
      out.write("                document.frm.txtLicencia.value = licencia;\n");
      out.write("                document.frm.txtDireccion.value = direccion;\n");
      out.write("                document.frm.txtTelefono.value = telefono;\n");
      out.write("            }\n");
      out.write("            function m(){\n");
      out.write("                alert(\"dfsjkljsalk\");\n");
      out.write("            }\n");
      out.write("            function Valdui() {\n");
      out.write("                // var dui = document.frm.txtDui;\n");
      out.write("                var dui = document.getElementById(\"iddui\").value;\n");
      out.write("                if (!(/^\\d{8}-\\d{1}$/.test(dui))) {\n");
      out.write("                        alert('DUI no valido');\n");
      out.write("                        return fal - se;\n");
      out.write("                        /^\\d{4}\n");
      out.write("                }\n");
      out.write("                //http://librosweb.es/libro/javascript/capitulo_7/validacion.html\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");

            if (request.getAttribute("msj") != null) {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert('");
      out.print( request.getAttribute("msj"));
      out.write("');\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        ");

            }

        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Gestionar Motoristas</h1>\n");
      out.write("        <form name=\"frm\" action=\"procesarEmpleado\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <table >\n");
      out.write("                <tr>\n");
      out.write("                    <td>ID</td><td><input type=\"text\" name=\"txtId\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nombre</td><td><input type=\"text\" name=\"txtNombre\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>DUI</td><td><input type=\"text\" name=\"txtDui\" id=\"iddui\" onblur=\"Valdui()\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>NIT</td><td><input type=\"text\" name=\"txtNit\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Licencia</td>\n");
      out.write("                    <td><select name=\"txtLicencia\">\n");
      out.write("                    ");

                    List<Empleado> listEmp1=daoEmpleado.mostrar();
                    for (Empleado e : listEmp1) {
                        
      out.write("<option value=\"");
      out.print( e.getLicencia() );
      out.write("\">\n");
      out.write("                            </option>");

                        }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                            <option value=\"0\">No</option>\n");
      out.write("                            <option value=\"1\">Liviana</option>\n");
      out.write("                            <option value=\"2\">Pesada</option>\n");
      out.write("                            <option value=\"3\">Pesada T</option>\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Direccion</td><td><input type=\"text\" name=\"txtDireccion\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Telefono<td><input type=\"text\" name=\"txtTelefono\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" name=\"btnInsertar\" value=\"Insertar\">\n");
      out.write("                        <input type=\"submit\" name=\"btnModificar\" value=\"Modificar\">\n");
      out.write("                        <input type=\"submit\" name=\"btnEliminar\" value=\"Eliminar\">\n");
      out.write("                        <input type=\"reset\" name=\"btnNuevo\" value=\"Nuevo\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <a href=\"javascript:m()\">msj</a>\n");
      out.write("        <br><hr><br>\n");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>DUI</th>\n");
      out.write("                    <th>NIT</th>\n");
      out.write("                    <th>Licencia</th>\n");
      out.write("                    <th>Direccion</th>\n");
      out.write("                    <th>Telefono</th>\n");
      out.write("                    <th>Opciones</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    ");
                        List<Empleado> lisE = daoEmpleado.mostrar();
                        for (Empleado em : lisE) {
                    
      out.write("\n");
      out.write("                    <td>");
      out.print( em.getIdempleado());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( em.getNombre());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( em.getDui());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( em.getNit());
      out.write("</td>                    \n");
      out.write("                    <td>");
      out.print( em.getLicencia());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( em.getDireccion());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( em.getTel());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"javascript:llenar(");
      out.print( em.getIdempleado());
      out.write(',');
      out.write('\'');
      out.print( em.getNombre());
      out.write("',\n");
      out.write("                           '");
      out.print( em.getDui());
      out.write("','");
      out.print( em.getNit());
      out.write("',\n");
      out.write("                           ");
      out.print( em.getLicencia());
      out.write(',');
      out.write('\'');
      out.print( em.getDireccion());
      out.write("',\n");
      out.write("                           '");
      out.print( em.getTel());
      out.write("')\">\n");
      out.write("                            Seleccionar\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
