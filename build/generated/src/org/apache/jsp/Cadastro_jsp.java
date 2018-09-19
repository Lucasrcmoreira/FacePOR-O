package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Cadastro </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" id=\"cadastro\">\n");
      out.write("            \n");
      out.write("            <form action=\"CadastrarUsuario\" method=\"post\"> \n");
      out.write("                Usuario:             <input type=\"text\" name=\"usuario\" placeholder=\"Digite seu usuário\" required=\"\"> <br>\n");
      out.write("                Nome:                <input type=\"text\" name=\"nome\" placeholder=\"Nome\"> <br>\n");
      out.write("                Sobrenome:           <input type=\"text\" name=\"sobrenome\" placeholder=\"Sobrenome\"> <br>\n");
      out.write("                sexo:                <input type=\"radio\" name=\"sexo\" value=\"m\"> Masculino \n");
      out.write("                                     <input type=\"radio\" name=\"sexo\" value=\"f\"> Feminino <br>\n");
      out.write("                Data de nascimento:  <input type=\"date\" name=\"dtnasc\" placeholder=\"dd/mm/aaaa\"> <br>\n");
      out.write("                senha:               <input type=\"password\" name=\"senha\" placeholder=\"Digite sua senha\" required=\"\"> <br>\n");
      out.write("                Confirmar senha:     <input type=\"password\" name=\"confirmarsenha\" placeholder=\"Confirme sua senha\" required=\"\"> <br>\n");
      out.write("                                     <input type=\"submit\" value=\"Inscreva-se\">\n");
      out.write("            </form>  \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
