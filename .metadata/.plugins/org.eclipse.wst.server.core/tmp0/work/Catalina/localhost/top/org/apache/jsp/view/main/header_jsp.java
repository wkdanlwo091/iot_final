/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2020-04-27 23:09:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--\n");
      out.write("\t\t\tTip 1: You can change the background color of the main header using: data-background-color=\"blue | purple | light-blue | green | orange | red\"\n");
      out.write("\t\t-->\n");
      out.write("\n");
      out.write("<div class=\"main-header\" data-background-color=\"red\">\n");
      out.write("\t<!-- Logo Header -->\n");
      out.write("\t<div class=\"logo-header\">\n");
      out.write("\n");
      out.write("\t\t<a href=\"index.html\" class=\"logo\">\n");
      out.write("\t\t\t<h3 class=\"navbar-brand\">WATCHER\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<button class=\"navbar-toggler sidenav-toggler ml-auto\" type=\"button\"\n");
      out.write("\t\t\tdata-toggle=\"collapse\" data-target=\"collapse\" aria-expanded=\"false\"\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"> <i class=\"fa fa-bars\"></i>\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t</button>\n");
      out.write("\t\t<button class=\"topbar-toggler more\">\n");
      out.write("\t\t\t<i class=\"fa fa-ellipsis-v\"></i>\n");
      out.write("\t\t</button>\n");
      out.write("\t\t<div class=\"navbar-minimize\">\n");
      out.write("\t\t\t<button class=\"btn btn-minimize btn-rounded\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-bars\"></i>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End Logo Header -->\n");
      out.write("\n");
      out.write("\t<!-- Navbar Header -->\n");
      out.write("\t<nav class=\"navbar navbar-header navbar-expand-lg\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t<div class=\"collapse\" id=\"search-nav\">\n");
      out.write("\t\t\t\t<form class=\"navbar-left navbar-form nav-search mr-md-3\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-search pr-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-search search-icon\"></i>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search ...\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<ul class=\"navbar-nav topbar-nav ml-md-auto align-items-center\">\n");
      out.write("\t\t\t\t<li class=\"nav-item toggle-nav-search hidden-caret\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link\" data-toggle=\"collapse\" href=\"#search-nav\"\n");
      out.write("\t\t\t\t\trole=\"button\" aria-expanded=\"false\" aria-controls=\"search-nav\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Notification -->\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown hidden-caret\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"notifDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <i class=\"fa fa-bell\"></i> <span\n");
      out.write("\t\t\t\t\t\tclass=\"notification\">4</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu messages-notif-box animated fadeIn\"\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"messageDropdown\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-title\">You have 4 new notification</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"message-notif-scroll scrollbar-outer\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"notif-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-icon notif-primary\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user-plus\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"block\"> New user registered </span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"time\">5 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a> <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-icon notif-success\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-comment\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"block\"> Rahmad commented on Admin </span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"time\">12 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a> <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"assets/img/profile2.jpg\" alt=\"Img Profile\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"block\"> Reza send messages to you </span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"time\">12 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a> <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-icon notif-danger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-heart\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"block\"> Farrah liked Admin </span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"time\">17 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a> </a> <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-icon notif-danger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-heart\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"block\"> Farrah liked Admin </span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"time\">17 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a> </a> <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-icon notif-danger\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-heart\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"notif-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"block\"> Farrah liked Admin </span> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"time\">17 minutes ago</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"see-all\" href=\"javascript:void(0);\">See all\n");
      out.write("\t\t\t\t\t\t\t\tnotifications<i class=\"fa fa-angle-right\"></i>\n");
      out.write("\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- MyPage -->\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown hidden-caret\"><a\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle profile-pic\" data-toggle=\"dropdown\" href=\"#\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t<div class=\"avatar-sm\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"assets/img/profile.jpg\" alt=\"...\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"avatar-img rounded-circle\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-user animated fadeIn\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"user-box\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"avatar-lg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"assets/img/profile.jpg\" alt=\"image profile\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"avatar-img rounded\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"u-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Hizrian</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"text-muted\">hello@example.com</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"profile.html\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-rounded btn-danger btn-sm\">View Profile</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"#\">My Profile</a> <a class=\"dropdown-item\" href=\"#\">My\n");
      out.write("\t\t\t\t\t\t\t\tBalance</a> <a class=\"dropdown-item\" href=\"#\">Inbox</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"#\">Account Setting</a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-divider\"></div> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"#\">Logout</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"logo\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"navbar-brand\">TOP</h3>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<!-- End Navbar -->\n");
      out.write("</div>");
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
