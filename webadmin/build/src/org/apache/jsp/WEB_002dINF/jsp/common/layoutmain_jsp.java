package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class layoutmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/common/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_layout$1definition;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_layout$1component_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_link_beanclass;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_layout$1definition = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_layout$1component_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_link_beanclass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_s_layout$1definition.release();
    _jspx_tagPool_s_layout$1component_name_nobody.release();
    _jspx_tagPool_s_link_beanclass.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

    String ua = request.getHeader("User-Agent").toLowerCase();
	boolean mobile = ua.matches("(?i).*(android.+mobile|avantgo|bada\\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|meego.+mobile|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino).*") || ua.substring(0, 4).matches("(?i)1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\\-(n|u)|c55\\/|capi|ccwa|cdm\\-|cell|chtm|cldc|cmd\\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\\-s|devi|dica|dmob|do(c|p)o|ds(12|\\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\\-|_)|g1 u|g560|gene|gf\\-5|g\\-mo|go(\\.w|od)|gr(ad|un)|haie|hcit|hd\\-(m|p|t)|hei\\-|hi(pt|ta)|hp( i|ip)|hs\\-c|ht(c(\\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\\-(20|go|ma)|i230|iac( |\\-|\\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\\/)|klon|kpt |kwc\\-|kyo(c|k)|le(no|xi)|lg( g|\\/(k|l|u)|50|54|\\-[a-w])|libw|lynx|m1\\-w|m3ga|m50\\/|ma(te|ui|xo)|mc(01|21|ca)|m\\-cr|me(di|rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\\-2|po(ck|rt|se)|prox|psio|pt\\-g|qa\\-a|qc(07|12|21|32|60|\\-[2-7]|i\\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\\-|oo|p\\-)|sdk\\/|se(c(\\-|0|1)|47|mc|nd|ri)|sgh\\-|shar|sie(\\-|m)|sk\\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\\-|v\\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\\-|tdg\\-|tel(i|m)|tim\\-|t\\-mo|to(pl|sh)|ts(70|m\\-|m3|m5)|tx\\-9|up(\\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\\-|your|zeto|zte\\-");
	pageContext.setAttribute("mobile", mobile);

      out.write("\r\n\r\n");
      if (_jspx_meth_s_layout$1definition_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("contextPath");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_s_layout$1definition_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:layout-definition
    net.sourceforge.stripes.tag.layout.LayoutDefinitionTag _jspx_th_s_layout$1definition_0 = (net.sourceforge.stripes.tag.layout.LayoutDefinitionTag) _jspx_tagPool_s_layout$1definition.get(net.sourceforge.stripes.tag.layout.LayoutDefinitionTag.class);
    _jspx_th_s_layout$1definition_0.setPageContext(_jspx_page_context);
    _jspx_th_s_layout$1definition_0.setParent(null);
    int _jspx_eval_s_layout$1definition_0 = _jspx_th_s_layout$1definition_0.doStartTag();
    if (_jspx_eval_s_layout$1definition_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n    <!DOCTYPE html>\r\n    <html>\r\n        <head>\r\n            <title>Mirth Connect Web Administrator</title>\r\n            <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\" />\r\n            <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.css\" />\r\n            ");
      if (_jspx_meth_s_layout$1component_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1definition_0, _jspx_page_context))
        return true;
      out.write("\r\n        </head>\r\n\r\n        <body>\r\n            <div id=\"header\" class=\"navbar navbar-fixed-top\">\r\n                <div class=\"navbar-inner\">\r\n                    <div class=\"container\" style=\"width: 98%;\">\r\n                        <a class=\"brand\"> <img alt=\"Mirth Connect\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/mirthconnectlogowide.png\" style=\"height: 30px\"></a>\r\n                        <ul class=\"nav\">\r\n                            <li id=\"li_dashboardstatistics\">");
      if (_jspx_meth_s_link_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1definition_0, _jspx_page_context))
        return true;
      out.write("</li>\r\n                        </ul>\r\n        \r\n                        <div class=\"nav btn-group pull-right\" style=\"margin-top: 5px;\">\r\n                            <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"> <i class=\"icon-user\"></i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <span class=\"caret\"></span></a>\r\n        \r\n                            <ul class=\"dropdown-menu\">\r\n                                ");
      if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1definition_0, _jspx_page_context))
        return true;
      out.write("\r\n        \r\n                                <li><a href=\"Logout.action\"> <i class=\"icon-share\"></i> Logout</a></li>\r\n                            </ul>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div id=\"body\">\r\n                ");
      if (_jspx_meth_s_layout$1component_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1definition_0, _jspx_page_context))
        return true;
      out.write("\r\n            </div>\r\n        \r\n            <div id=\"footer\"></div>\r\n        \r\n            <!-- Scripts placed at the end of the document so the pages load faster -->\r\n            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.8.0.js\"></script>\r\n            <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n        \r\n            <!-- Script to highlight navbar links as active upon click -->\r\n            <script type=\"text/javascript\">\r\n                function getCurrentPageName() {\r\n                    var pageURL = document.location.href;\r\n                    var pageName = pageURL.substring(pageURL.lastIndexOf('/') + 1);\r\n\r\n                    return pageName.toLowerCase();\r\n                }\r\n\r\n                $(document).ready(function() {\r\n                    var currPage = getCurrentPageName();\r\n\r\n                    switch (currPage) {\r\n                    case 'dashboardstatistics.action':\r\n                        $('#li_dashboardstatistics').addClass('active');\r\n                        break;\r\n                    }\r\n                });\r\n            </script>\r\n            \r\n            <script type=\"text/javascript\">\r\n\t       \t\tfunction launchAdministrator(){\r\n\t        \t\twindow.location.href= '../webstart.jnlp?time=' + new Date().getTime(); \r\n\t       \t\t}\r\n       \t\t</script>\r\n");
      out.write("        \r\n            ");
      if (_jspx_meth_s_layout$1component_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1definition_0, _jspx_page_context))
        return true;
      out.write("\r\n        </body>\r\n    </html>\r\n");
    }
    if (_jspx_th_s_layout$1definition_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_layout$1definition.reuse(_jspx_th_s_layout$1definition_0);
      return true;
    }
    _jspx_tagPool_s_layout$1definition.reuse(_jspx_th_s_layout$1definition_0);
    return false;
  }

  private boolean _jspx_meth_s_layout$1component_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1definition_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_s_layout$1component_0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _jspx_tagPool_s_layout$1component_name_nobody.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_s_layout$1component_0.setPageContext(_jspx_page_context);
    _jspx_th_s_layout$1component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1definition_0);
    _jspx_th_s_layout$1component_0.setName("head");
    int _jspx_eval_s_layout$1component_0 = _jspx_th_s_layout$1component_0.doStartTag();
    if (_jspx_th_s_layout$1component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_layout$1component_name_nobody.reuse(_jspx_th_s_layout$1component_0);
      return true;
    }
    _jspx_tagPool_s_layout$1component_name_nobody.reuse(_jspx_th_s_layout$1component_0);
    return false;
  }

  private boolean _jspx_meth_s_link_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1definition_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:link
    net.sourceforge.stripes.tag.LinkTag _jspx_th_s_link_0 = (net.sourceforge.stripes.tag.LinkTag) _jspx_tagPool_s_link_beanclass.get(net.sourceforge.stripes.tag.LinkTag.class);
    _jspx_th_s_link_0.setPageContext(_jspx_page_context);
    _jspx_th_s_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1definition_0);
    _jspx_th_s_link_0.setBeanclass(new String("com.mirth.connect.webadmin.action.DashboardStatisticsActionBean"));
    int _jspx_eval_s_link_0 = _jspx_th_s_link_0.doStartTag();
    if (_jspx_eval_s_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_link_0.doInitBody();
      }
      do {
        out.write("Dashboard Statistics");
        int evalDoAfterBody = _jspx_th_s_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_link_beanclass.reuse(_jspx_th_s_link_0);
      return true;
    }
    _jspx_tagPool_s_link_beanclass.reuse(_jspx_th_s_link_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1definition_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1definition_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not mobile}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                    <li><a href=\"#\" onClick=\"launchAdministrator()\"> <i class=\"icon-upload\"></i> Launch Administrator</a></li>\r\n                                    <li class=\"divider\"></li>\r\n                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_s_layout$1component_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1definition_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_s_layout$1component_1 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _jspx_tagPool_s_layout$1component_name_nobody.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_s_layout$1component_1.setPageContext(_jspx_page_context);
    _jspx_th_s_layout$1component_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1definition_0);
    _jspx_th_s_layout$1component_1.setName("body");
    int _jspx_eval_s_layout$1component_1 = _jspx_th_s_layout$1component_1.doStartTag();
    if (_jspx_th_s_layout$1component_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_layout$1component_name_nobody.reuse(_jspx_th_s_layout$1component_1);
      return true;
    }
    _jspx_tagPool_s_layout$1component_name_nobody.reuse(_jspx_th_s_layout$1component_1);
    return false;
  }

  private boolean _jspx_meth_s_layout$1component_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1definition_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_s_layout$1component_2 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _jspx_tagPool_s_layout$1component_name_nobody.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_s_layout$1component_2.setPageContext(_jspx_page_context);
    _jspx_th_s_layout$1component_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1definition_0);
    _jspx_th_s_layout$1component_2.setName("scripts");
    int _jspx_eval_s_layout$1component_2 = _jspx_th_s_layout$1component_2.doStartTag();
    if (_jspx_th_s_layout$1component_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_layout$1component_name_nobody.reuse(_jspx_th_s_layout$1component_2);
      return true;
    }
    _jspx_tagPool_s_layout$1component_name_nobody.reuse(_jspx_th_s_layout$1component_2);
    return false;
  }
}
