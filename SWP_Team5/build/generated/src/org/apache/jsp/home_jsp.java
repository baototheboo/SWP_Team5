package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/style_Homepage.css\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <!--FORM IMAGE \"GETTING STARTED\"-->  \n");
      out.write("        <header id=\"i08k\" class=\"header-banner\">\n");
      out.write("            <div class=\"container-width\">\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lead-title\">Build your templates without coding\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sub-lead-title\">All text blocks could be edited easily with double clicking on it. You can create new text blocks with the command from the left panel\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lead-btn\">Hover me\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-------------------------------> \n");
      out.write("\n");
      out.write("        <section class=\"flex-sect\">\n");
      out.write("            <div class=\"container-width\">\n");
      out.write("                <div class=\"flex-title\">Flex is the new black\n");
      out.write("                </div>\n");
      out.write("                <div class=\"flex-desc\">With flexbox system you&#039;re able to build complex layouts easily and with free responsivity\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cards\">\n");
      out.write("\n");
      out.write("                    <!--FORM IMAGE EACH CARD--> \n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"card-title\">Title one\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-sub-title\">Subtitle one\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-desc\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!------------------------------->\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header ch2\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"card-title\">Title two\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-sub-title\">Subtitle two\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-desc\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header ch3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"card-title\">Title three\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-sub-title\">Subtitle three\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-desc\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header ch4\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"card-title\">Title four\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-sub-title\">Subtitle four\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-desc\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header ch5\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"card-title\">Title five\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-sub-title\">Subtitle five\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-desc\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header ch6\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"card-title\">Title six\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-sub-title\">Subtitle six\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-desc\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
