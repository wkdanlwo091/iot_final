/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2020-04-25 07:29:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/wkdan/Desktop/final_iot/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/top/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1575513783315L));
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.3/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://code.highcharts.com/highcharts.js\"></script>\r\n");
      out.write("<script src=\"https://code.highcharts.com/modules/exporting.js\"></script>\r\n");
      out.write("<script src=\"https://code.highcharts.com/modules/export-data.js\"></script>\r\n");
      out.write("<script src=\"https://code.highcharts.com/modules/accessibility.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: Helvetica;\r\n");
      out.write("\t-webkit-font-smoothing: antialiased;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tpadding: 30px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Table Styles */\r\n");
      out.write(".table-wrapper {\r\n");
      out.write("\tmargin: 10px 70px 70px;\r\n");
      out.write("\tbox-shadow: 0px 35px 50px rgba(0, 0, 0, 0.2);\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fl-table {\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tmax-width: 100%;\r\n");
      out.write("\twhite-space: nowrap;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fl-table td, .fl-table th {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fl-table td {\r\n");
      out.write("\tborder-right: 1px solid #f8f8f8;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fl-table thead th {\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\tbackground: #4FC3A1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fl-table thead th:nth-child(odd) {\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\tbackground: #324960;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".fl-table tr:nth-child(even) {\r\n");
      out.write("\tbackground: #F8F8F8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responsive */\r\n");
      out.write("@media ( max-width : 767px) {\r\n");
      out.write("\t.fl-table {\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.table-wrapper:before {\r\n");
      out.write("\t\tcontent: \"Scroll horizontally >\";\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t\ttext-align: right;\r\n");
      out.write("\t\tfont-size: 11px;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tpadding: 0 0 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table thead, .fl-table tbody, .fl-table thead th {\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table thead th:last-child {\r\n");
      out.write("\t\tborder-bottom: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table thead {\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table tbody {\r\n");
      out.write("\t\twidth: auto;\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t\toverflow-x: auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table td, .fl-table th {\r\n");
      out.write("\t\tpadding: 20px .625em .625em .625em;\r\n");
      out.write("\t\theight: 60px;\r\n");
      out.write("\t\tvertical-align: middle;\r\n");
      out.write("\t\tbox-sizing: border-box;\r\n");
      out.write("\t\toverflow-x: hidden;\r\n");
      out.write("\t\toverflow-y: auto;\r\n");
      out.write("\t\twidth: 120px;\r\n");
      out.write("\t\tfont-size: 13px;\r\n");
      out.write("\t\ttext-overflow: ellipsis;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table thead th {\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("\t\tborder-bottom: 1px solid #f7f7f9;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table tbody tr {\r\n");
      out.write("\t\tdisplay: table-cell;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table tbody tr:nth-child(odd) {\r\n");
      out.write("\t\tbackground: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table tr:nth-child(even) {\r\n");
      out.write("\t\tbackground: transparent;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table tr td:nth-child(odd) {\r\n");
      out.write("\t\tbackground: #F8F8F8;\r\n");
      out.write("\t\tborder-right: 1px solid #E6E4E4;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table tr td:nth-child(even) {\r\n");
      out.write("\t\tborder-right: 1px solid #E6E4E4;\r\n");
      out.write("\t}\r\n");
      out.write("\t.fl-table tbody td {\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("var orderStatusData;\r\n");
      out.write("\r\n");
      out.write("function orderStatusData(chainOrHQ) {\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\t\t\turl : 'orderStatusData.top',\r\n");
      out.write("\t\t        type: \"get\",\r\n");
      out.write("\t\t        data : { \"chainOrHQ\" : chainOrHQ },\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t//디비에 보낼 데이터를 저장한다.\r\n");
      out.write("\t\t\t\t\tmyObject = {};\r\n");
      out.write("\t\t\t\t\tsendToDBData = data;\r\n");
      out.write("\t\t\t\t\tconsole.log(data + \" data length \" + data.length\r\n");
      out.write("\t\t\t\t\t\t\t+ \"data type is \" + typeof (data));\r\n");
      out.write("\t\t\t\t\t// draw graph;\r\n");
      out.write("\t\t\t\t\tvar myTable = \"\";\r\n");
      out.write("\t\t\t\t\tmyTable += \"<div id=\\\"rowC\\\" class=\\\"col-xs-8 col-xs-offset-2 well\\\">\";\r\n");
      out.write("\t\t\t\t\tmyTable += \"<table class=\\\"table table-scroll table-striped\\\">\";\r\n");
      out.write("\t\t\t\t\tmyTable += \"<thead><tr><th>#</th><th>HQ</th><th>CHAIN</th><th>container ID</th><th>ID</th>\";\r\n");
      out.write("\t\t\t\t\tmyTable += \"<th>재료 이름 </th><th>재료 가격</th><th>재료 단위</th><th>재료 무게</th><th>수량</th><th>주문 상태</th></tr></thead><tbody id = \\\"myTable\\\"><tbody></table></div>\";\r\n");
      out.write("\t\t\t\t\t$('#template > div.col-12.panel-body.basket-body').append(myTable);\r\n");
      out.write("\t\t\t\t\tvar myTemp;\r\n");
      out.write("\t\t\t\t\tmyTemp += \"\";\r\n");
      out.write("\t\t\t\t\tfor (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t\t\t\t\t\tif(i == 0){\r\n");
      out.write("\t\t\t\t\t\t\tcurrentOrderID = data[i].OrderID;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + i + 1 + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].HqName + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].ChainName + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].ConID + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].UserName + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].IngName + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].IngPrice + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].IngUnit + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].IngWeight + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].IngQuantity + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"<td>\" + data[i].OrderState+ \"</td>\";\r\n");
      out.write("\t\t\t\t\t\tmyTemp += \"</tr>\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$('#myTable').append(myTemp);  \r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror : function(request, status, error) {\r\n");
      out.write("\t\t\t\t\tconsole.log(\"error!\" + request.status\r\n");
      out.write("\t\t\t\t\t\t\t+ \"\\n\\n message = \" + request.responseText\r\n");
      out.write("\t\t\t\t\t\t\t+ \" \\n\\nerror = \" + error);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function getDataDrawTable() {\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:'orderStatusData.top',\r\n");
      out.write("\t\tsuccess:function(data){\r\n");
      out.write("\t\t\torderStatusData = data;\r\n");
      out.write("\t\t\tconsole.log(data + \" data length \" + data.length + \"data type is \" + typeof(data));\r\n");
      out.write("\t\t\t// draw graph;\r\n");
      out.write("\t\t\tvar myTemp;\r\n");
      out.write("\t\t\tmyTemp += \"\";\r\n");
      out.write("\t\t\tfor(var i =  0; i < data.length; i++){\r\n");
      out.write("\t\t\t\tmyTemp += \"<tr>\";\r\n");
      out.write("\t\t\t\tmyTemp += \"<td>\"+ data[i].OrderChainID +\"</td>\";\r\n");
      out.write("\t\t\t\tmyTemp += \"<td>\"+ data[i].OrderOrderID +\"</td>\";\r\n");
      out.write("\t\t\t\tmyTemp += \"<td>\"+ data[i].OrderPayment +\"</td>\";\r\n");
      out.write("\t\t\t\tmyTemp += \"<td>\"+ data[i].OrderDate +\"</td>\";\r\n");
      out.write("\t\t\t\tmyTemp += \"<td>\"+ data[i].OrderDeliveryState +\"</td>\";\r\n");
      out.write("\t\t\t\tmyTemp += \"<td>\"+ data[i].OrderOrderState +\"</td>\";\r\n");
      out.write("\t\t\t\tmyTemp += \"</tr>\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}      \r\n");
      out.write("\t\t\t$('#myTable').append(myTemp);  \r\n");
      out.write("\t\t}, \r\n");
      out.write("\t\terror : function(request, status, error){\r\n");
      out.write("\t\t\tconsole.log(\"error!\" + request.status + \"\\n\\n message = \" + request.responseText + \" \\n\\nerror = \" + error );\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("$( document ).ready(function() {\r\n");
      out.write("\tvar loginId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t///기업용인지 사용자용인지에 따라서 뽑는 데이터 달라진다. \r\n");
      out.write("\tvar chainOrHq = 0;\r\n");
      out.write("\tif(loginId.includes(\"chainID\")){// 체인의 가맹점용\r\n");
      out.write("\t\tchainOrHq = 0;\r\n");
      out.write("\t}else if(loginId.includes(\"hq\")){// 체인의 헤드쿼터용\r\n");
      out.write("\t\tchainOrHq = 1;\r\n");
      out.write("\t}\r\n");
      out.write("\torderStatusData(chainOrHq);\r\n");
      out.write("\t//getDataDrawTable();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<h1 class=\"page-title\">Order Status</h1>\r\n");
      out.write("<div class=\"card\">\r\n");
      out.write("\t<div class=\"card-body\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-7 col-md-8\" style = \"width : 100% !important; max-width: 100%; flex : 0 0 100% !important \">\r\n");
      out.write("\t\t\t\t<form class=\"navbar-left navbar-form nav-search mr-md-3\" style = \"width : 100%\">\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-search pr-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-search search-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search ...\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"table-wrapper\">\r\n");
      out.write("\t\t\t\t<table class=\"fl-table\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>순번</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>헤드쿼터</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>체인이름</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>컨테이너ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>사용자명</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>재료명</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>가격</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>재료 단위</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>재료 무게</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>재료 수량</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>주문 상태</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody id = \"myTable\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
