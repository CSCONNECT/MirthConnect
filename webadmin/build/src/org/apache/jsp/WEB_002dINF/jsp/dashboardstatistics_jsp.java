package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboardstatistics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:replace", org.apache.taglibs.standard.functions.Functions.class, "replace", new Class[] {java.lang.String.class, java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/common/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_layout$1render_title_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_layout$1component_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_layout$1render_title_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_layout$1component_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_s_layout$1render_title_name.release();
    _jspx_tagPool_s_layout$1component_name.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      if (_jspx_meth_s_layout$1render_0(_jspx_page_context))
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

  private boolean _jspx_meth_s_layout$1render_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:layout-render
    net.sourceforge.stripes.tag.layout.LayoutRenderTag _jspx_th_s_layout$1render_0 = (net.sourceforge.stripes.tag.layout.LayoutRenderTag) _jspx_tagPool_s_layout$1render_title_name.get(net.sourceforge.stripes.tag.layout.LayoutRenderTag.class);
    _jspx_th_s_layout$1render_0.setPageContext(_jspx_page_context);
    _jspx_th_s_layout$1render_0.setParent(null);
    _jspx_th_s_layout$1render_0.setName("/WEB-INF/jsp/common/layoutmain.jsp");
    _jspx_th_s_layout$1render_0.setDynamicAttribute(null, "title", new String("Dashboard Statistics"));
    int _jspx_eval_s_layout$1render_0 = _jspx_th_s_layout$1render_0.doStartTag();
    if (_jspx_eval_s_layout$1render_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_layout$1render_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_layout$1render_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_layout$1render_0.doInitBody();
      }
      do {
        out.write("\r\n    ");
        if (_jspx_meth_s_layout$1component_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1render_0, _jspx_page_context))
          return true;
        out.write("\r\n\r\n    ");
        if (_jspx_meth_s_layout$1component_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1render_0, _jspx_page_context))
          return true;
        out.write("\r\n\r\n    ");
        if (_jspx_meth_s_layout$1component_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1render_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_s_layout$1render_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_layout$1render_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_layout$1render_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_layout$1render_title_name.reuse(_jspx_th_s_layout$1render_0);
      return true;
    }
    _jspx_tagPool_s_layout$1render_title_name.reuse(_jspx_th_s_layout$1render_0);
    return false;
  }

  private boolean _jspx_meth_s_layout$1component_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1render_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_s_layout$1component_0 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _jspx_tagPool_s_layout$1component_name.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_s_layout$1component_0.setPageContext(_jspx_page_context);
    _jspx_th_s_layout$1component_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1render_0);
    _jspx_th_s_layout$1component_0.setName("head");
    int _jspx_eval_s_layout$1component_0 = _jspx_th_s_layout$1component_0.doStartTag();
    if (_jspx_eval_s_layout$1component_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/jquery.treeTable.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n\r\n        <!-- Hack to fix CSS spacing conflict between tablesorter and bootstrap -->\r\n        <style type=\"text/css\">\r\n            .header div {\r\n            \tfloat: left;\r\n            }\r\n        </style>\r\n    ");
    }
    if (_jspx_th_s_layout$1component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_layout$1component_name.reuse(_jspx_th_s_layout$1component_0);
      return true;
    }
    _jspx_tagPool_s_layout$1component_name.reuse(_jspx_th_s_layout$1component_0);
    return false;
  }

  private boolean _jspx_meth_s_layout$1component_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1render_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_s_layout$1component_1 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _jspx_tagPool_s_layout$1component_name.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_s_layout$1component_1.setPageContext(_jspx_page_context);
    _jspx_th_s_layout$1component_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1render_0);
    _jspx_th_s_layout$1component_1.setName("body");
    int _jspx_eval_s_layout$1component_1 = _jspx_th_s_layout$1component_1.doStartTag();
    if (_jspx_eval_s_layout$1component_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n        <div id=\"errorAlert\" class=\"alert alert-error hide fade in\" data-alert=\"alert\" style= \"width:380px; margin-left:auto; margin-right:auto;\">\r\n            <a class=\"close\" data-dismiss=\"alert\" href=\"#\">&times;</a>\r\n            <p><strong>Error connecting to Server</strong>. Refresh the page or <a href=\"Index.action\">Login</a></p>\r\n        </div>\r\n\r\n        <ul id=\"myTab\" class=\"nav nav-tabs\">\r\n            <li class=\"active\"><a id=\"current\" href=\"#\" data-toggle=\"tab\">Current Statistics</a></li>\r\n            <li><a id=\"lifetime\" href=\"#\" data-toggle=\"tab\">Lifetime Statistics</a></li>\r\n        </ul>\r\n\r\n        <table class=\"table table-striped table-bordered table-condensed tablesorter\" style=\"width: 98%;\" id=\"treeTable\">\r\n            <thead>\r\n                <tr>\r\n                    <th>Name</th>\r\n                    <th>Status</th>\r\n                    <th>Received</th>\r\n                    <th>Filtered</th>\r\n                    <th>Queued</th>\r\n                    <th>Sent</th>\r\n                    <th>Errored</th>\r\n");
      out.write("                </tr>\r\n            </thead>\r\n            <tbody>\r\n                ");
      if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_layout$1component_1, _jspx_page_context))
        return true;
      out.write("\r\n            </tbody>\r\n        </table>\r\n    ");
    }
    if (_jspx_th_s_layout$1component_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_layout$1component_name.reuse(_jspx_th_s_layout$1component_1);
      return true;
    }
    _jspx_tagPool_s_layout$1component_name.reuse(_jspx_th_s_layout$1component_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1component_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1component_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${actionBean.dashboardStatusList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("dashboardStatus");
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                    <tr id=\"node-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n                        <td class=\"parent\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.statistics[RECEIVED]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.statistics[FILTERED]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.queued}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.statistics[SENT]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                        <td class=\"errors\" ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.statistics[ERROR]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                    </tr>\r\n\r\n                    ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.statistics[ERROR] != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" style=\"background-color:LightPink;\" ");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dashboardStatus.childStatuses}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("childStatus");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                        ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n                        ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n\r\n                        <tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${trimName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('-');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"child-of-node-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" expand-child\">\r\n                            <td class=\"child\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.statistics[RECEIVED]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.statistics[FILTERED]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.queued}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.statistics[SENT]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                            <td class=\"errors\" ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write('>');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.statistics[ERROR]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n                        </tr>\r\n                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_1.setVar("childName");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_set_2.setVar("trimName");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:replace(childName,' ','-')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childStatus.statistics[ERROR] != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" style=\"background-color:LightPink;\" ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_s_layout$1component_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_layout$1render_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:layout-component
    net.sourceforge.stripes.tag.layout.LayoutComponentTag _jspx_th_s_layout$1component_2 = (net.sourceforge.stripes.tag.layout.LayoutComponentTag) _jspx_tagPool_s_layout$1component_name.get(net.sourceforge.stripes.tag.layout.LayoutComponentTag.class);
    _jspx_th_s_layout$1component_2.setPageContext(_jspx_page_context);
    _jspx_th_s_layout$1component_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_layout$1render_0);
    _jspx_th_s_layout$1component_2.setName("scripts");
    int _jspx_eval_s_layout$1component_2 = _jspx_th_s_layout$1component_2.doStartTag();
    if (_jspx_eval_s_layout$1component_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery.treeTable.js\"></script>\r\n        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/persist-min.js\"></script>\r\n        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery.tablesorter.min.js\"></script>\r\n        <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery.tablesorter.widgets.min.js\"></script>\r\n\r\n        <!-- Script to update stats dynamically every x seconds via ajax -->\r\n        <script type=\"text/javascript\">\r\n            var timeout = 5000;\r\n            var showLifetimeStats = false;\r\n            var updateTimeout;\r\n\r\n            function updateStats() {\r\n                $.get('DashboardStatistics.action?getStats&showLifetimeStats=' + showLifetimeStats, function(nodes) {\r\n\t\t\t\t\tvar showAlert = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${actionBean.showAlert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n\r\n                    // Refresh\r\n                    if (nodes == \"0\") {\r\n                        document.location.reload(true);\r\n                        return;\r\n                    }\r\n\r\n                    if (showAlert) {\r\n                        $(\"#errorAlert\").show();\r\n                    } else {\r\n                        $(\"#errorAlert\").hide();\r\n                    }\r\n\r\n                    for (var i = 0; i < nodes.length; i++) {\r\n                        var node = nodes[i];\r\n                        var row = $('#' + node.id);\r\n\r\n                        checkAndUpdateError(node);\r\n\r\n                        row.children().eq(1).text(node.status);\r\n                        row.children().eq(2).text(node.received);\r\n                        row.children().eq(3).text(node.filtered);\r\n                        row.children().eq(4).text(node.queued);\r\n                        row.children().eq(5).text(node.sent);\r\n                        row.children().eq(6).text(node.errored);\r\n                    }\r\n                    \r\n");
      out.write("                    $('.result').html(nodes);\r\n                }, \"json\");\r\n                \r\n                updateTimeout = setTimeout(updateStats, timeout);\r\n            }\r\n\r\n            function checkAndUpdateError(node) {\r\n                var row = $('#' + node.id);\r\n\r\n                if (node.errored > 0) {\r\n                    row.children().eq(6).css(\"background-color\", \"LightPink\");\r\n                } else {\r\n                    // Even rows paint cell background transparent\r\n                    if (row.index() % 2 == 0) {\r\n                        row.children().eq(6).css(\"background-color\", \"#F9F9F9\");\r\n                    }\r\n\r\n                    // Odd rows paint cell background grey\r\n                    else {\r\n                        row.children().eq(6).css(\"background-color\", \"transparent\");\r\n                    }\r\n                }\r\n            }\r\n\r\n            $(document).ready(function() {\r\n                updateTimeout = setTimeout(updateStats, timeout);\r\n            });\r\n        </script>\r\n");
      out.write("\r\n        <!-- Enable Bootstrap Javascript Tabs -->\r\n        <script type=\"text/javascript\">\r\n            $(document).ready(function() {\r\n                $('#myTab a').click(function(e) {\r\n                    e.preventDefault();\r\n\r\n                    if ($(this).attr(\"id\") == \"current\") {\r\n                        showLifetimeStats = false;\r\n                        clearTimeout(updateTimeout);\r\n                    } else {\r\n                        showLifetimeStats = true;\r\n                        clearTimeout(updateTimeout);\r\n                    }\r\n                    updateStats();\r\n                    $(this).tab('show');\r\n                });\r\n            });\r\n        </script>\r\n\r\n        <!-- TreeTable plugin -->\r\n        <script type=\"text/javascript\">\r\n            $(document).ready(function() {\r\n                $(\"#treeTable\").treeTable({\r\n                    initialState : \"collapsed\",\r\n                    clickableNodeNames : true,\r\n                    persist : true\r\n                // Persist node expanded/collapsed state\r\n");
      out.write("                });\r\n            });\r\n        </script>\r\n\r\n        <!-- TableSorter plugin -->\r\n        <script type=\"text/javascript\">\r\n            $(document).ready(function() {\r\n                $(\"#treeTable\").tablesorter({\r\n                    // Persist sorting state\r\n                    widgets : [ \"saveSort\" ],\r\n\r\n                    // Override tablesorter CSS to use bootstrap styling\r\n                    cssHeader : \"header\",\r\n                    cssAsc : \"headerSortDown\",\r\n                    cssDesc : \"headerSortUp\"\r\n                });\r\n            });\r\n        </script>\r\n\r\n        <!-- Script to highlight errored cells pink whenever value > 0 -->\r\n        <script type=\"text/javascript\">\r\n            $(document).ready(function() {\r\n                if (Number($(this).text()) > 0) {\r\n                    $(this).css(\"background-color\", \"LightPink\");\r\n                }\r\n            });\r\n        </script>\r\n\r\n        <!-- Hack to fix CSS extra arrow conflict between tablesorter and bootstrap -->\r\n        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function() {\r\n                $(\"#body table thead tr\").removeAttr(\"class\");\r\n            });\r\n        </script>\r\n    ");
    }
    if (_jspx_th_s_layout$1component_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_layout$1component_name.reuse(_jspx_th_s_layout$1component_2);
      return true;
    }
    _jspx_tagPool_s_layout$1component_name.reuse(_jspx_th_s_layout$1component_2);
    return false;
  }
}
