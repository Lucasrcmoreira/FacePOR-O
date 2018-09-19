package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EsqueciMinhaSenha_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Esqueci minha senha</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            margin-top :20%;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    #campo{\n");
      out.write("        width: 400px;\n");
      out.write("        height: 200px;\n");
      out.write("        background-color: #F2F2F2;\n");
      out.write("        text-align: center;\n");
      out.write("        \n");
      out.write("        font-size: 14px;\n");
      out.write("        }\n");
      out.write("        #email{\n");
      out.write("            width:230px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("        <div id=\"campo\">\n");
      out.write("            <br><br>\n");
      out.write("        <p>Digite seu e-mail para redefinição de senha<p>\n");
      out.write("        <form action=\"EviarEmail\" method=\"get\">\n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" placeholder =\"Digite seu E-mail\"><br><br>   \n");
      out.write("            \n");
      out.write("        <input type=\"submit\" name=\"enviar\" value=\"Enviar\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("\n");
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
