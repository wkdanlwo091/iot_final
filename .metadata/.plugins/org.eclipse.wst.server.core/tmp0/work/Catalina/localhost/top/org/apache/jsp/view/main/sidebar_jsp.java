/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2020-04-25 06:56:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!-- Sidebar START -->\n");
      out.write("<div class=\"sidebar\">\n");
      out.write("\n");
      out.write("\t<div class=\"sidebar-background\"></div>\n");
      out.write("\t<div class=\"sidebar-wrapper scrollbar-inner\">\n");
      out.write("\t\t<div class=\"sidebar-content\">\n");
      out.write("\t\t\t<div class=\"user\">\n");
      out.write("\t\t\t\t<div class=\"avatar-sm float-left mr-2\">\n");
      out.write("\t\t\t\t\t<img src=\"assets/img/profile.jpg\" alt=\"...\"\n");
      out.write("\t\t\t\t\t\tclass=\"avatar-img rounded-circle\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"info\">\n");
      out.write("\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#collapseExample\"\n");
      out.write("\t\t\t\t\t\taria-expanded=\"true\"> <span> Hizrian <span\n");
      out.write("\t\t\t\t\t\t\tclass=\"user-level\">Administrator</span> <span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"collapse in\" id=\"collapseExample\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#profile\"> <span class=\"link-collapse\">My\n");
      out.write("\t\t\t\t\t\t\t\t\t\tProfile</span>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#edit\"> <span class=\"link-collapse\">Edit\n");
      out.write("\t\t\t\t\t\t\t\t\t\tProfile</span>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#settings\"> <span class=\"link-collapse\">Settings</span>\n");
      out.write("\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<!-- MENU START HERE -->\n");
      out.write("\t\t\t<ul class=\"nav\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- HOME -->\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a href=\"index.html\"> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fas fa-home\"></i>\n");
      out.write("\t\t\t\t\t\t<p>HOME</p> <!-- <span class=\"badge badge-count\">5</span> -->\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Menu -->\n");
      out.write("\t\t\t\t<li class=\"nav-section\"><span class=\"sidebar-mini-icon\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-ellipsis-h\"></i>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t<h4 class=\"text-section\">Menu</h4></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Inventory Management -->\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a data-toggle=\"collapse\" href=\"#base\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-layer-group\"></i>\n");
      out.write("\t\t\t\t\t\t<p>Inventory</p>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Delivery Status -->\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a data-toggle=\"collapse\" href=\"#forms\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-pen-square\"></i>\n");
      out.write("\t\t\t\t\t\t<p>Delivery Status</p>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Chain Access Management -->\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a data-toggle=\"collapse\" href=\"#tables\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-table\"></i>\n");
      out.write("\t\t\t\t\t\t<p>Chain Access</p>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a data-toggle=\"collapse\" onclick = \"popup()\">\n");
      out.write("\t\t\t\t\t\t<i class=\"far fa-chart-bar\"></i>\n");
      out.write("\t\t\t\t\t\t<p>Order</p>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<!-- A/S Center -->\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a data-toggle=\"collapse\" href=\"#maps\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Orders</p>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"collapse\" id=\"maps\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav nav-collapse\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"main.top\"  onclick = \"popup()\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sub-item\">Orders</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"orderStatus.top\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sub-item\">Order Status</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- Sidebar END -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}