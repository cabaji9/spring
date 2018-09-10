package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<h1>Login</h1>\n");
      out.write("\n");
      out.write("<form name='f' action=\"login?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.parameterName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method='POST'>\n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td>User:</td>\n");
      out.write("            <td><input type='text' name='username' value=''></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Password:</td>\n");
      out.write("            <td><input type='password' name='password' /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <input id=\"remember_me\" name=\"_spring_security_remember_me\" type=\"checkbox\"/>\n");
      out.write("                <label for=\"remember_me\" class=\"inline\">Remember me</label>\n");
      out.write("\n");
      out.write("            </td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input name=\"submit\" type=\"submit\" value=\"submit\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
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
