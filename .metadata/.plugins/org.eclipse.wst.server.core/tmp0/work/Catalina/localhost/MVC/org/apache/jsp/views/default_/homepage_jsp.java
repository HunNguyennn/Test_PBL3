/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.23
 * Generated at: 2024-05-07 20:06:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.default_;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/default/../../../../assets/css/main.css", Long.valueOf(1715111652596L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Feel n Chill</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"main.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- font -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@100..900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- icon -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"main.css\">\r\n");
      out.write("	<style>\r\n");
      out.write("		");
      out.write("body {\n");
      out.write("	background-image: linear-gradient(90deg, #E3DED0, #749C9B, #2B3842);\n");
      out.write("	background-repeat: no-repeat;\n");
      out.write("	overflow-x: hidden;\n");
      out.write("	font-family: \"Inter\", sans-serif;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".logo {\n");
      out.write("	display: flex;\n");
      out.write("	align-items: center;\n");
      out.write("	color: #18324F;\n");
      out.write("\n");
      out.write("	h1 {\n");
      out.write("		margin-left: 1vw;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("	width: 100vw;\n");
      out.write("	position: fixed;\n");
      out.write("	background-image: linear-gradient(90deg, #E3DED0, #749C9B, #2B3842);\n");
      out.write("	z-index: 2;\n");
      out.write("	box-shadow: 0 2px 5px #0000001a;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".h-top {\n");
      out.write("	width: 100vw;\n");
      out.write("	display: inline-flex;\n");
      out.write("	align-items: center;\n");
      out.write("	justify-content: space-evenly;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#search {\n");
      out.write("	width: 30vw;\n");
      out.write("	height: 5vh;\n");
      out.write("	border-radius: 50px;\n");
      out.write("	border: 0cap;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("#btn-search {\n");
      out.write("	border-radius: 50px;\n");
      out.write("	width: 5vw;\n");
      out.write("	height: 5vh;\n");
      out.write("	transform: translateX(-2vw);\n");
      out.write("	background-color: #2A323A;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#regis,\n");
      out.write("#login {\n");
      out.write("	border-radius: 50px;\n");
      out.write("	width: 10vw;\n");
      out.write("	height: 5vh;\n");
      out.write("	background-color: #2A323A;\n");
      out.write("	color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#regis:hover,\n");
      out.write("#login:hover,\n");
      out.write("#btn-search:hover {\n");
      out.write("	box-shadow: 0px 5px 20px #294059;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header-list ul {\n");
      out.write("	list-style: none;\n");
      out.write("	width: 100vw;\n");
      out.write("	margin-top: 4vh;\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: space-evenly;\n");
      out.write("\n");
      out.write("	a {\n");
      out.write("		text-decoration-line: none;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-container {\n");
      out.write("	margin: 0vw 5vw;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slide {\n");
      out.write("	display: none;\n");
      out.write("\n");
      out.write("	img {\n");
      out.write("		width: 90vw;\n");
      out.write("		margin-top: 20vw;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slidedot {\n");
      out.write("	display: flex;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dot {\n");
      out.write("	cursor: pointer;\n");
      out.write("	box-sizing: content-box;\n");
      out.write("	display: block;\n");
      out.write("	border-radius: 50%;\n");
      out.write("	height: 1vw;\n");
      out.write("	width: 1vw;\n");
      out.write("	margin: 0vw 1vw;\n");
      out.write("	background-color: #bbb;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active,\n");
      out.write(".dot:hover {\n");
      out.write("	background-color: #717171;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".change {\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: space-between;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#prev,\n");
      out.write("#next {\n");
      out.write("	cursor: pointer;\n");
      out.write("	margin-left: 1vw;\n");
      out.write("	padding: 1vw;\n");
      out.write("	position: relative;\n");
      out.write("	bottom: 15vw;\n");
      out.write("	font-size: 30px;\n");
      out.write("	color: #749C9B;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#prev:hover,\n");
      out.write("#next:hover {\n");
      out.write("	cursor: pointer;\n");
      out.write("	background-color: #264259;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".slidedot {\n");
      out.write("	transform: translateY(-4vw);\n");
      out.write("	margin-left: 40vw;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".service-container {\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: space-evenly;\n");
      out.write("\n");
      out.write("	h1 {\n");
      out.write("		font-weight: 0.5em;\n");
      out.write("		font-size: 1.2em;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".service {\n");
      out.write("	display: inline-flex;\n");
      out.write("	width: fit-content;\n");
      out.write("	align-items: first baseline;\n");
      out.write("\n");
      out.write("	.fa-solid {\n");
      out.write("		margin-right: 1vw;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".service-content {\n");
      out.write("\n");
      out.write("	width: 15vw;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".brandSort,\n");
      out.write(".itemSort {\n");
      out.write("	margin: 2vw 0vw;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".brand,\n");
      out.write(".item-list {\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: space-evenly;\n");
      out.write("	border-top: 1px solid black;\n");
      out.write("	border-bottom: 1px solid black;\n");
      out.write("	width: fit-content;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".brand ul,\n");
      out.write(".item-list ul,\n");
      out.write(".itemIcon ul {\n");
      out.write("	display: inline-flex;\n");
      out.write("	width: 90vw;\n");
      out.write("	align-items: center;\n");
      out.write("	height: 22vh;\n");
      out.write("	overflow: hidden;\n");
      out.write("\n");
      out.write("	li {\n");
      out.write("		list-style: none;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".itemIcon li {\n");
      out.write("	margin: 0vw 2vw;\n");
      out.write("	display: flex;\n");
      out.write("	flex-direction: column;\n");
      out.write("	align-items: center;\n");
      out.write("\n");
      out.write("	img {\n");
      out.write("		width: 5vw;\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item {\n");
      out.write("	list-style: none;\n");
      out.write("	border: none;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#iprev,\n");
      out.write("#inext {\n");
      out.write("	cursor: pointer;\n");
      out.write("	height: 50%;\n");
      out.write("	fill: #adc2c9;\n");
      out.write("	transform: translateY(-6.8vw);\n");
      out.write("	font-size: 40px;\n");
      out.write("	color: #749C9B;\n");
      out.write("	visibility: hidden;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#iprev:hover,\n");
      out.write("#inext:hover {\n");
      out.write("	color: #18324F;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product-container {\n");
      out.write("	display: flex;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".product {\n");
      out.write("	margin: 2vw;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title {\n");
      out.write("	display: flex;\n");
      out.write("	align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".title h2 {\n");
      out.write("	margin-right: 2vw;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".offer {\n");
      out.write("	img {\n");
      out.write("		width: 40vw;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	display: flex;\n");
      out.write("	justify-content: space-around;\n");
      out.write("	margin: 3vw 0vw;\n");
      out.write("}");
      out.write("\r\n");
      out.write("	</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <div class=\"h-top\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <img src=\"img\\Green Light Home Shop About Contact-Photoroom.png\" style =\"width: 9vw;\"alt=\"\">\r\n");
      out.write("                <h1>Feel n Chill</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"h-center\">\r\n");
      out.write("                <search>\r\n");
      out.write("                    <form action=\"\">\r\n");
      out.write("                        <label for=\"search\"></label>\r\n");
      out.write("                        <input type=\"search\" id=\"search\" name=\"\" placeholder=\"  Typing...\" />\r\n");
      out.write("                      \r\n");
      out.write("                        <button id = \"btn-search\"type=\"submit\">\r\n");
      out.write("                            <i class=\"fa-solid fa-magnifying-glass\"></i>\r\n");
      out.write("                            Search\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                  </search>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"h-right\">\r\n");
      out.write("                <button type=\"submit\" id = \"login\" onclick=\"f_login()\">\r\n");
      out.write("                    <i class=\"fa-solid fa-right-to-bracket\"></i>\r\n");
      out.write("                    Login\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header-list\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"\">Specials</a></li>\r\n");
      out.write("                <li><a href=\"\">Thương hiệu</a></li>\r\n");
      out.write("                <li><a href=\"\">Sản phẩm</a></li>\r\n");
      out.write("                <li><a href=\"\">Chia sẻ trải nghiệm</a></li>\r\n");
      out.write("                <li><a href=\"\">Thông tin cửa hàng</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main-container\">\r\n");
      out.write("        <div class=\"slideshow-container\">\r\n");
      out.write("            <div class=\"slideshow\">\r\n");
      out.write("                <div class=\"slide\">\r\n");
      out.write("                    <img src=\"img\\SLVN_Multi_Effects_Pedals_Amp_Modellers_Ft_CE24_Non-Full-Width-Slideshow_Desktop_1110X333_1x_2220x666_2x_74d47715-2b31-49d2-98df-35d2ae08118c_1110x333_crop_top.png\" alt=\"\">\r\n");
      out.write("        \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"slide\">\r\n");
      out.write("                    <img src=\"img\\SLVN_Heritage_Ascent_Bundle_Non-Full-Width-Slideshow_Desktop_1110X333_1x_2220x666_2x_3a149b64-3b2c-48ab-b2a6-340d0ca9f594_2220x666_crop_top.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"slide\">\r\n");
      out.write("                    <img src=\"img\\SLVN_PRS_New_Arrivals_Ft_CE24_Non-Full-Width-Slideshow_Desktop_1110X333_1x_2220x666_2x_e2bef85c-e5cb-44be-a6d7-a467601d8e34_2220x666_crop_top.png\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"change\">\r\n");
      out.write("                    <i id = \"prev\" onclick = \"plusSlide(-1)\" class=\"fa-solid fa-angle-left\"></i>\r\n");
      out.write("                    <i id = \"next\" onclick = \"plusSlide(1)\" class=\"fa-solid fa-angle-right\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"slidedot\">\r\n");
      out.write("                <span class=\"dot\" onclick =\"currentSlide(1)\"></span>\r\n");
      out.write("                <span class=\"dot\" onclick =\"currentSlide(2)\"></span>\r\n");
      out.write("                <span class=\"dot\" onclick =\"currentSlide(3)\"></span>\r\n");
      out.write("            </div>  \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"service-container\">\r\n");
      out.write("            <div class=\"service\">\r\n");
      out.write("                <i class=\"fa-solid fa-truck\"></i>\r\n");
      out.write("                <div class=\"service-content\">\r\n");
      out.write("                    <h1>Miễn phí giao hàng</h1>\r\n");
      out.write("                    <span>Ưu đãi vận chuyển với hàng loạt voucher cực xịn</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"service\">\r\n");
      out.write("                <i class=\"fa-solid fa-business-time\"></i>\r\n");
      out.write("                <div class=\"service-content\">\r\n");
      out.write("                    <h1>Click & collect</h1>\r\n");
      out.write("                    <span>Nhận hàng tại store sau 2h</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"service\">\r\n");
      out.write("                <i class=\"fa-solid fa-file-invoice\"></i>\r\n");
      out.write("                <div class=\"service-content\">\r\n");
      out.write("                    <h1>Thanh toán bảo đảm</h1>\r\n");
      out.write("                    <span>Mua hàng trực tuyến dễ dàng, nhanh chóng</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("               \r\n");
      out.write("            <div class=\"service\">\r\n");
      out.write("                <i class=\"fa-solid fa-rotate\"></i>\r\n");
      out.write("                <div class=\"service-content\">\r\n");
      out.write("                    <h1>13 ngày hoàn trả</h1>\r\n");
      out.write("                    <span>Tận hưởng chính sách linh hoạt khi bạn đổi ý</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sort-container\">\r\n");
      out.write("            <div class=\"brandSort\">\r\n");
      out.write("                <h2>Tìm theo thương hiệu</h2>\r\n");
      out.write("                <div class=\"brand\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\brands_2F6_2Ffender_1582874349627_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\brands_2F104_2Felixir_1647598509279_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" rc=\"brand\\focusrite_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\harmony_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\ibanez_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\marshall_a6fe8954-3e6b-4b44-a849-9fbe0abcde9b_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\mono_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\squier_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\tama_90x90.png  \" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\brands_2F6_2Ffender_1582874349627_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\brands_2F104_2Felixir_1647598509279_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\focusrite_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\harmony_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\ibanez_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\marshall_a6fe8954-3e6b-4b44-a849-9fbe0abcde9b_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\mono_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\squier_90x90.png\" alt=\"\"></li>\r\n");
      out.write("                        <li><img class =\"item\" src=\"brand\\tama_90x90.png  \" alt=\"\"></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"change\">\r\n");
      out.write("                    <i id = \"iprev\" onclick = \"itemPlusSlide(1)\" class=\"fa-solid fa-angle-left\"></i>\r\n");
      out.write("                    <i id = \"inext\" onclick = \"itemPlusSlide(-1)\" class=\"fa-solid fa-angle-right\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"itemSort\">\r\n");
      out.write("                <div class=\"title\">\r\n");
      out.write("                    <h2>Tìm theo sản phẩm</h2>\r\n");
      out.write("                    <span>Xem tất cả sản phẩm</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"itemIcon\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <img class =\"item\" src=\"itemSort\\drumsSort.png\" alt=\"\">\r\n");
      out.write("                            <p>Drum</p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <img class =\"item\" src=\"itemSort\\guitarSort.png\" alt=\"\">\r\n");
      out.write("                            <p>Guitar & bass</p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <img class =\"item\" src=\"itemSort\\keyboardSort.png\" alt=\"\">\r\n");
      out.write("                            <p>Keyboard & piano</p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"change\">\r\n");
      out.write("                    <i id = \"iprev\" onclick = \"itemPlusSlide(1)\" class=\"fa-solid fa-angle-left\"></i>\r\n");
      out.write("                    <i id = \"inext\" onclick = \"itemPlusSlide(-1)\" class=\"fa-solid fa-angle-right\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bestSeller-container\">\r\n");
      out.write("            <h2>Sản phẩm bán chạy</h2>\r\n");
      out.write("            <div class=\"product-container\">\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img  src=main.\\items\\guitar\\products_2FA00-HRT-016119121-BDL_2FA00-HRT-016119121-BDL_1707278895220_158x158_crop_center.png\" alt=\"\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img  src=\"main\\items\\guitar\\products_2FF03-011-8030-771_2FF03-011-8030-771_1707890484630_158x158_crop_center.png\" alt=\"\">                        \r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img  src=\"main\\items\\guitar\\products_2FF03-014-7040-397_2FF03-014-7040-397_1708058288260_158x158_crop_center.png\" alt=\"\">                        \r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img  src=\"main\\items\\guitar\\products_2FF03-014-9835-377_2FF03-014-9835-377_1705548175670_158x158_crop_center.png\" alt=\"\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img  src=\"main\\items\\guitar\\products_2FF03-014-9903-579_2FF03-014-9903-579_1712217239830_158x158_crop_center.png\" alt=\"\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"bestSeller-container\">\r\n");
      out.write("            <div class=\"title\">\r\n");
      out.write("                <h2>Hàng mới về</h2>\r\n");
      out.write("                <span>Xem tất cả sản phẩm mới</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"product-container\">\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img src=\"main\\items\\guitar\\products_2FM07-11LXK2_2FM07-11LXK2_1689212939570_158x158_crop_center.png\" alt=\"\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img src=\"main\\items\\guitar\\products_2FI01-GWB1005-NTF_2FI01-GWB1005-NTF_1713433811540_158x158_crop_center.png\" alt=\"\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img src=\"main\\items\\guitar\\products_2FI01-GWB35BKF_2FI01-GWB35BKF_1713509505790_158x158_crop_center.png\" alt=\"\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img src=\"main\\items\\guitar\\products_2FI01-AE245-NT_2FI01-AE245-NT_1713429885670_158x158_crop_center.png\" alt=\"\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"product\">\r\n");
      out.write("                    <div class=\"p\">\r\n");
      out.write("                        <img src=\"main\\items\\guitar\\products_2FF03-560-1600-306_2FF03-560-1600-306_1699955390720_158x158_crop_center.png\" alt=\"\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"status\">\r\n");
      out.write("                        <h3>Có hàng</h3>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"offer\">\r\n");
      out.write("            <img src=\"main\\items\\offer\\offer1.png\" alt=\"\">\r\n");
      out.write("            <img src=\"main\\items\\offer\\offer2.png\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("    </div>  \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"<c:url value=\"/assets/js/main.js\"/>\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
