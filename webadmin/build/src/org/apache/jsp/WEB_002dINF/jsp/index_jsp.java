package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/common/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("\r\n<!doctype html>\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n        <meta http-equiv=\"x-ua-compatible\" content=\"IE=edge\">\r\n        \r\n        <title>Mirth Connect Administrator</title>\r\n        \r\n        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/favicon.ico\" />\r\n        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\r\n        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\" />\r\n        \r\n        <script type=\"text/javascript\">\r\n            /* Break out of frame if inside a frame. */\r\n            if (window != window.top) {\r\n                window.top.location = window.location;\r\n            }\r\n        </script>\r\n        \r\n        <script type=\"text/javascript\" src=\"js/jquery-1.8.0.js\"></script>\r\n    </head>\r\n    \r\n    <body id=\"body\" style=\"display: none;\" class=\"subpage\" ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(">\r\n        <div id=\"centerWrapper\">\r\n            <div class=\"row\">\r\n                <div id=\"mirthLogoWrapper\">\r\n                    <img id=\"mirthLogo\" src=\"images/mirthconnectlogowide.png\" />\r\n                </div>\r\n    \r\n                <div id=\"mcadministrator\" class=\"span4\">\r\n                    <h1 style=\"text-align: center;\">Mirth Connect Administrator</h1>\r\n    \t\t\t\t\r\n    \t\t\t\t<div id=\"overviewwebstart\">\r\n\t    \t\t\t\t<div class=\"help-block\">\r\n\t                        <strong>Overview of Web Start:</strong><br /> Java Web Start is a framework developed by Sun Microsystems that enables launching Java applications directly from a browser. Unlike Java applets, Web Start applications do not run inside the browser.\r\n\t                    </div>\r\n\t                    <div class=\"help-block\">\r\n\t                        <br />Click the big green button below to launch the Mirth Connect Administrator using Java Web Start.\r\n\t                    </div>\r\n    \t\t\t\t</div>\r\n\r\n                    <div style=\"text-align: center;\">\r\n");
      out.write("                        <a class=\"btn btn-large btn-themebutton\" href=\"javascript:launchAdministrator()\">Launch Mirth Connect Administrator</a>\r\n                    </div>\r\n                </div>\r\n    \r\n                <div id=\"webdashboardsignin\" class=\"span4 offset1\">\r\n                    <h1 style=\"text-align: center;\">Web Dashboard Sign in</h1>\r\n    \t\t\t\t    \t\t\t\t\r\n    \t\t\t\t");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div id=\"smallSubPage\">\r\n        \t<p>&copy; 2013 Mirth Corporation | Mirth Connect</p>\r\n        </div>\r\n    \r\n        <script type=\"text/javascript\">\r\n            $(document).ready(\r\n                    function detectMobile() {\r\n                        /**\r\n                         * jQuery.browser.mobile (http://detectmobilebrowser.com/)\r\n                         * jQuery.browser.mobile will be true if the browser is a mobile device\r\n                         **/\r\n                        (function(a) {\r\n                            jQuery.browser.mobile = /android.+mobile|avantgo|bada\\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\\/|plucker|pocket|psp|symbian|treo|up\\.(browser|link)|vodafone|wap|windows (ce|phone)|xda|xiino/i.test(a) || /1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\\-(n|u)|c55\\/|capi|ccwa|cdm\\-|cell|chtm|cldc|cmd\\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\\-s|devi|dica|dmob|do(c|p)o|ds(12|\\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\\-|_)|g1 u|g560|gene|gf\\-5|g\\-mo|go(\\.w|od)|gr(ad|un)|haie|hcit|hd\\-(m|p|t)|hei\\-|hi(pt|ta)|hp( i|ip)|hs\\-c|ht(c(\\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\\-(20|go|ma)|i230|iac( |\\-|\\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\\/)|klon|kpt |kwc\\-|kyo(c|k)|le(no|xi)|lg( g|\\/(k|l|u)|50|54|e\\-|e\\/|\\-[a-w])|libw|lynx|m1\\-w|m3ga|m50\\/|ma(te|ui|xo)|mc(01|21|ca)|m\\-cr|me(di|rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\\-2|po(ck|rt|se)|prox|psio|pt\\-g|qa\\-a|qc(07|12|21|32|60|\\-[2-7]|i\\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\\-|oo|p\\-)|sdk\\/|se(c(\\-|0|1)|47|mc|nd|ri)|sgh\\-|shar|sie(\\-|m)|sk\\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\\-|v\\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\\-|tdg\\-|tel(i|m)|tim\\-|t\\-mo|to(pl|sh)|ts(70|m\\-|m3|m5)|tx\\-9|up(\\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|xda(\\-|2|g)|yas\\-|your|zeto|zte\\-/i.test(a.substr(0, 4))\r\n");
      out.write("                        })(navigator.userAgent || navigator.vendor || window.opera);\r\n\r\n                        if (jQuery.browser.mobile) {\r\n                            $(\"#mcadministrator\").hide();\r\n\r\n                            $(\"#centerWrapper\").css(\"margin\", \"0\");\r\n                            $(\"#centerWrapper\").css(\"padding\", \"0\");\r\n                            $(\"#centerWrapper\").css(\"border\", \"none\");\r\n                            $(\"#centerWrapper\").css(\"width\", \"100%\");\r\n\r\n                            $(\"#webdashboardsignin\").css(\"border-left\", \"0\");\r\n                            $(\"#webdashboardsignin\").css(\"margin-left\", \"0\");\r\n                            $(\"#webdashboardsignin\").css(\"padding-left\", \"0\");\r\n                            $(\"#webdashboardsignin\").css(\"width\", \"100%\");\r\n\r\n                            $(\"#username\").css(\"width\", \"100%\");\r\n                            $(\"#password\").css(\"width\", \"100%\");\r\n\r\n                            $(\"#securesiteaccess\").css(\"margin-left\", \"30px\");\r\n    \r\n                            // Set viewport meta tag\r\n");
      out.write("                            var mt = $('meta[name=viewport]');\r\n            \t\t\t\tmt = mt.length ? mt : $('<meta name=\"viewport\" />').appendTo('head');\r\n            \t\t\t\tmt.attr('content', 'initial-scale=.8,maximum-scale=.8,user-scalable=no,width=device-width');\r\n                        } else {\r\n                            $(\"#mcadministrator\").show();\r\n                        }\r\n                        $(\"#body\").css(\"display\", \"inline\");\r\n                    });\r\n        </script>\r\n        <script type=\"text/javascript\">\r\n            var showAlert = false;\r\n            $(document).ready(function() {\r\n                $.urlParam = function(name) {\r\n                    var results = new RegExp('[\\\\?&]' + name + '=([^&#]*)').exec(window.location.href);\r\n                    if (results != null) {\r\n                        return results[1] || 0;\r\n                    }\r\n                }\r\n                showAlert = $.urlParam('showAlert');\r\n\r\n                if (showAlert) {\r\n                    $(\"#loginErrorAlert\").show();\r\n");
      out.write("                    return false;\r\n                } else {\r\n                    $(\"#loginErrorAlert\").hide();\r\n                    return true;\r\n                }\r\n            });\r\n        </script>\r\n        <script type=\"text/javascript\">\r\n       \t\tfunction launchAdministrator(){\r\n        \t\twindow.location.href = '../webstart.jnlp?time=' + new Date().getTime(); \r\n       \t\t}\r\n        </script>\r\n    </body>\r\n</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${actionBean.secureHttps == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("onload=\"document.loginform.username.focus();\"");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n    \t\t\t\t \t");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n\t\t              \t");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${actionBean.secureHttps == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\t\t                     <form id=\"webLoginForm\" name=\"loginform\" action=\"Login.action\" method=\"post\">\r\n\t\t                        <div id=\"loginErrorAlert\" class=\"alert alert-error hide fade in\" data-alert=\"alert\">\r\n\t\t\t                    \t<p>Invalid login credentials</p>\r\n\t\t\t                    </div>\r\n\t\t\t                    <div id=\"webLoginWrapper\">\r\n\t\t\t    \t\t\t\t\t<div id=\"webLogin\">\r\n\t\t\t                            <input type=\"hidden\" name=\"op\" value=\"login\" /> <input type=\"hidden\" name=\"version\" value=\"0.0.0\" /> <label for=\"username\">Username</label>\r\n\t\t\t                            <input id=\"username\" type=\"text\" name=\"username\" autocomplete=\"off\" maxlength=\"32\" /> <label for=\"password\">Password</label>\r\n\t\t\t                            <input id=\"password\" type=\"password\" name=\"password\" autocomplete=\"off\" />\r\n\t\t\t                            <div class=\"help-block\">\r\n\t\t\t                                <strong>Security Reminder:</strong><br /> Sign out of your account when you finish your session.\r\n\t\t\t                            </div>\r\n");
        out.write("\t\t\t\t                    </div>\r\n\t\t\t                    </div>\r\n\t\t\t                    <div id=\"webLoginButton\">\r\n\t\t\t\t                \t<input class=\"btn btn-large btn-themebutton\" type=\"submit\" value=\"Sign in\"/>\r\n\t\t\t\t                </div>\r\n\t\t\t\t        \t</form>\r\n\t\t            \t");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\t\t              \t\t<div id=\"securesiteaccess\">\r\n\t\t              \t\t\t<p>The Mirth Connect Web Dashboard must be accessed over HTTPS. Click below button to switch to the secure site.</p>\r\n\t\t                   \t\t<div class=\"help-block\">\r\n\t\t                \t        <br/><strong>Note:</strong><br/> You may see a certificate error if your server is using a <a href=\"http://en.wikipedia.org/wiki/Self-signed_certificate\" target=\"_blank\">self-signed certificate</a>. To prevent further warnings, you can add this certificate to your browser or operating system.\r\n\t\t                        </div>\r\n\t\t\t                </div>\r\n\t\t                    <div style=\"text-align: center;\">\r\n\t\t                    \t<a class=\"btn btn-large btn-themebutton\" href=\"SecureAccess.action\">Access Secure Site</a>\r\n\t\t                    </div> \r\n  \t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
