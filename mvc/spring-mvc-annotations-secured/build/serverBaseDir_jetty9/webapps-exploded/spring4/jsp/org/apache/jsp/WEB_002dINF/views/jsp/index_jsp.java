package org.apache.jsp.WEB_002dINF.views.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_security_authentication_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_security_authentication_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_security_authentication_property_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Gradle + Spring MVC</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Project Name</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<a href=\"logout\">logout</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("HELLO ! ");
      if (_jspx_meth_security_authentication_0(_jspx_page_context))
        return;
      out.write(" !!\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <p>\n");
      out.write("            <a class=\"btn btn-primary btn-lg\"\n");
      out.write("               href=\"#\" role=\"button\">Learn more</a>\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <h2>Heading</h2>\n");
      out.write("            <p>ABC</p>\n");
      out.write("            <p>\n");
      out.write("                <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <h2>Heading</h2>\n");
      out.write("            <p>ABC</p>\n");
      out.write("            <p>\n");
      out.write("                <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <h2>Heading</h2>\n");
      out.write("            <p>ABC</p>\n");
      out.write("            <p>\n");
      out.write("                <a class=\"btn btn-default\" href=\"#\" role=\"button\">View details</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_security_authentication_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_authentication_0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _jspx_tagPool_security_authentication_property_nobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_authentication_0.setPageContext(_jspx_page_context);
    _jspx_th_security_authentication_0.setParent(null);
    _jspx_th_security_authentication_0.setProperty("principal.username");
    int _jspx_eval_security_authentication_0 = _jspx_th_security_authentication_0.doStartTag();
    if (_jspx_th_security_authentication_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authentication_property_nobody.reuse(_jspx_th_security_authentication_0);
      return true;
    }
    _jspx_tagPool_security_authentication_property_nobody.reuse(_jspx_th_security_authentication_0);
    return false;
  }
}
