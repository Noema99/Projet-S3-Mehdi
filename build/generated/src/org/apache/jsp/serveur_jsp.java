package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class serveur_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo_misc.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo_style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl-carousel.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/modernizr-2.6.1-respond-1.1.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--[if lt IE 7]>\n");
      out.write("            <p class=\"chromeframe\">You are using an outdated browser. <a href=\"http://browsehappy.com/\">Upgrade your browser today</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">install Google Chrome Frame</a> to better experience this site.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"site-main\" id=\"sTop\">\n");
      out.write("            <div class=\"site-header\">\n");
      out.write("                <div class=\"main-header\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div id=\"menu-wrapper\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <nav class=\"navbar navbar-inverse\" role=\"navigation\">\n");
      out.write("                                    <div class=\"navbar-header\">\n");
      out.write("                                        <button type=\"button\" id=\"nav-toggle\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#main-nav\">\n");
      out.write("                                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                            <span class=\"icon-bar\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                        <a href=\"#top\" class=\"navbar-brand\">E-TRAIN</a>\n");
      out.write("                                        <div id=\"main-nav\" class=\"collapse navbar-collapse\">\n");
      out.write("                                            <ul class=\"menu-first nav navbar-nav\" style=\"margin-right: 20px;\">\n");
      out.write("                                                <li class=\"active\"><a href=\"#\">Accueil</a></li>\n");
      out.write("                                                <li><a href=\"#about\">Consultations</a></li>\n");
      out.write("                                             \n");
      out.write("                                                <li><a href=\"deconnexion.jsp\">Disconnexion</a></li>\n");
      out.write("                                                <li><a href=\"#contact-us\">Contact</a></li>                                 \n");
      out.write("                                            </ul>                                    \n");
      out.write("                                        </div> <!-- /.main-menu -->\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                             </div> <!-- /.row -->\n");
      out.write("                            \n");
      out.write("                        </div> <!-- /#menu-wrapper --> \n");
      out.write("                        <h5 style=\"color:#F1F1F1\"><strong><p> ");
      out.print( new java.util.Date());
      out.write("</p></strong></h5>\n");
      out.write("                    </div> <!-- /.container -->\n");
      out.write("                </div> <!-- /.main-header -->\n");
      out.write("            </div> <!-- /.site-header -->\n");
      out.write("        </div> <!-- /.site-main -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("                       <div class=\"banner-content\">\n");
      out.write("                            \n");
      out.write("                      \n");
      out.write("                       \n");
      out.write("                          \n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"intro\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <h4 style=\"color:#053342\">Service E-TRAIN </h4>\n");
      out.write("                        <h6>Choisissez la meilleure des destinations selon vous!</h6>\n");
      out.write("                        <h6> Achetez maintenant votre ticket de voyage!</h6>\n");
      out.write("                        <h6> Avec le minimum de Temps et d'Effort et le maximun de Confort!</h6>\n");
      out.write("                        <div class=\"border-button\"><a href=\"#about\">Découvrez-nous par içi</a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <section id=\"about\" class=\"page-section\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"service-item first-service\">\n");
      out.write("                            <div class=\"icon\">\n");
      out.write("                                <img src=\"img/fourth-list-icon.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <h4><div class=\"border-button\"><a href=\"repasdispo.jsp\">Repas disponibles</a></div></h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"service-item third-service\">\n");
      out.write("                            <div class=\"icon\">\n");
      out.write("                                <img src=\"img/second-list-icon.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <h4><div class=\"border-button\"><a href=\"commandesdispo.jsp\">Liste des commandes</a></div></h4>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"service-item first-service\">\n");
      out.write("                            <div class=\"icon\">\n");
      out.write("                                <img src=\"img/third-list-icon.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <h4><div class=\"border-button\"><a href=\"#gares\">Liste des gares</a></div></h4>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <div class=\"service-item third-service\">\n");
      out.write("                            <div class=\"icon\">\n");
      out.write("                                <img src=\"img/second-list-icon.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <h4><div class=\"border-button\"><a href=\"#serveurcoordonnees\">Mes coordonnées</a></div></h4>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("         \n");
      out.write("      \n");
      out.write("       \n");
      out.write("        \n");
      out.write("          <section id=\"gares\" class=\"portfolio-section\">\n");
      out.write("        <div class=\"second-tabs-content what-we-do\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-heading\">\n");
      out.write("                            <h4 style=\"color:#bf0857\">Nos gares</h4>\n");
      out.write("                            <p>Par içi, vous pouvez localiser la gare qui vous sera utile.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"wrapper\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <ul class=\"tabs clearfix\" data-tabgroup=\"second-tab-group\">\n");
      out.write("                                    <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#rabat-ville\" class=\"active\">\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Rabat Ville</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#rabat-agdal\">\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Rabat Agdal</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-kenitra\">\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Kénitra</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-meknes\">\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Meknès</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-fes\">\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Fès</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-oujda\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Oujda</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-tanger\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Tanger</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-media\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Mohamedia</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#casa-port\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Casa Port</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#casa-voy\">\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Casa Voyageurs</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#aero-med\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Aeroport Med5</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-settat\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Settat</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-jadida\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare ElJadida</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-kh\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Khouribga</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                        <li class=\"col-md-15 col-sm-12 col-xs-12\">\n");
      out.write("                                        <a href=\"#gare-kech\" >\n");
      out.write("                                            <div class=\"list-item\">\n");
      out.write("                                                <div class=\"icon\">\n");
      out.write("                                                    <img src=\"img/fivth-list-icon.png\" alt=\"\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>Gare Marrakech</h4>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-lg-1\">\n");
      out.write("                            <section id=\"second-tab-group\" class=\"tabgroup\">\n");
      out.write("                <div id=\"rabat-ville\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                            <div class=\"col-md-30\">\n");
      out.write("                                                     <div id=\"map\">\n");
      out.write("                                <!-- How to change your own map point\n");
      out.write("                                    1. Go to Google Maps\n");
      out.write("                                    2. Click on your location point\n");
      out.write("                                    3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                    4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                                -->\n");
      out.write("                                <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3932.7602041191394!2d-6.836867614782172!3d34.017082597968155!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda76c7863654683%3A0x9dd409bdb7e6b2e0!2sGare%20Rabat%20Ville!5e0!3m2!1sfr!2sma!4v1573775205556!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"rabat-agdal\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                                <div id=\"map\">\n");
      out.write("                                            <!-- How to change your own map point\n");
      out.write("                                                1. Go to Google Maps\n");
      out.write("                                                2. Click on your location point\n");
      out.write("                                                3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                                4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                                            -->\n");
      out.write("                                            <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3307.6259726557514!2d-6.85777468530205!3d34.002139727817216!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda76c8b445f408f%3A0x938ca02e638223e9!2sGare%20Rabat%20Agdal!5e0!3m2!1sfr!2sma!4v1573910962996!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>\n");
      out.write("                                                           </div>\n");
      out.write("\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"gare-kenitra\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                                                            <div id=\"map\">\n");
      out.write("                                         <!-- How to change your own map point\n");
      out.write("                                             1. Go to Google Maps\n");
      out.write("                                             2. Click on your location point\n");
      out.write("                                             3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                             4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                                         -->\n");
      out.write("                                       <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d13190.409107954873!2d-6.583007074045602!3d34.25869097375042!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda759fd0564b8cd%3A0x10bd8fe275b0b022!2sGare%20de%20K%C3%A9nitra!5e0!3m2!1sfr!2sma!4v1573911111386!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>                  </div>\n");
      out.write("                                                     </div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"gare-meknes\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                       <div id=\"map\">\n");
      out.write("                                <!-- How to change your own map point\n");
      out.write("                                    1. Go to Google Maps\n");
      out.write("                                    2. Click on your location point\n");
      out.write("                                    3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                    4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                                -->\n");
      out.write("                               <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3311.7227630954844!2d-5.534070285305024!3d33.89679323335444!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda044e2951b1669%3A0x44d2a22913031c7e!2sGare%20de%20M%C3%A8knes!5e0!3m2!1sfr!2sma!4v1573911150386!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>               </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"gare-fes\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                                   <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d211762.51399130086!2d-5.408690944805477!3d33.97225518223244!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd9f8b321750f0f1%3A0x15c6e8b10b9ff069!2sGare%20de%20F%C3%A8s!5e0!3m2!1sfr!2sma!4v1573911183771!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>                  </div>\n");
      out.write("                                          </div>\n");
      out.write("                                        </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"gare-oujda\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                       <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3281.0174604655244!2d-1.9269665852828866!3d34.67950879186162!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd7864b09e6b0481%3A0xf2c453877b6aa52e!2sGare%20d&#39;%20Oujda!5e0!3m2!1sfr!2sma!4v1573916657570!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>   </div>\n");
      out.write("                                        </div>\n");
      out.write("                </div>\n");
      out.write("                </div>    \n");
      out.write("                <div id=\"gare-tanger\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                 <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12950.021160733024!2d-5.795123273348632!3d35.76296239454027!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd0b809c6e30ee7b%3A0x76d10e4ea25f6dcc!2sGare%20Tanger%20Ville!5e0!3m2!1sfr!2sma!4v1573916702252!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>         </div>\n");
      out.write("                                        </div>\n");
      out.write("                </div>\n");
      out.write("                   </div>     \n");
      out.write("                <div id=\"gare-media\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                      <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3319.5142860184383!2d-7.38994908531064!3d33.695638943886266!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda7b6f11d7e29a5%3A0x9a3d76b2ba1c3662!2sGare%20de%20Mohamm%C3%A9dia!5e0!3m2!1sfr!2sma!4v1573917539949!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>    </div>\n");
      out.write("                                        </div>\n");
      out.write("                                           </div> \n");
      out.write("                </div>\n");
      out.write("                 <div id=\"casa-port\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                     <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3323.224277150907!2d-7.61501508531332!3d33.59948484890167!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda7d282407396df%3A0x3488829b8de662c2!2sCasa%20Port!5e0!3m2!1sfr!2sma!4v1573917460506!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>     </div>\n");
      out.write("                                        </div>\n");
      out.write("                                           </div> \n");
      out.write("                </div>\n");
      out.write("                <div id=\"casa-voy\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                   <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3323.590704549503!2d-7.592228985313566!3d33.58997474939693!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda7cd6b769687b3%3A0x80143ee059f31ad1!2sGare%20de%20Casa%20Voyageurs!5e0!3m2!1sfr!2sma!4v1573917502727!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>       </div>\n");
      out.write("                                        </div>\n");
      out.write("                                           </div> \n");
      out.write("                </div>\n");
      out.write("                <div id=\"aero-med\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                      <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3331.871565076342!2d-7.62569448531951!3d33.37441896059231!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda6255af2f0f4d1%3A0xa6638dc62e5fd5b!2sA%C3%A9roport%20Med%20V!5e0!3m2!1sfr!2sma!4v1573917408930!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>    </div>\n");
      out.write("                                        </div>\n");
      out.write("                                           </div> \n");
      out.write("                </div>\n");
      out.write("                <div id=\"gare-settat\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                   <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3350.542950232284!2d-6.9111693!3d32.8838102!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda6056f94bfeb97%3A0x55e3773fadc26982!2sGare%20de%20Settat!5e0!3m2!1sfr!2sma!4v1573917428895!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>       </div>\n");
      out.write("                                        </div>\n");
      out.write("                                           </div> \n");
      out.write("                </div>\n");
      out.write("                <div id=\"gare-jadida\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                        <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d26698.622412448745!2d-8.522620037582342!3d33.23171467093241!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda91e6bea2288c1%3A0x4f7731f7ebf15dfd!2sEl%20Jadida!5e0!3m2!1sfr!2sma!4v1573916861968!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>  </div>\n");
      out.write("                                        </div>\n");
      out.write("                                           </div> \n");
      out.write("                </div>\n");
      out.write("                <div id=\"gare-kh\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                          <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3350.542950767614!2d-6.911169285332936!3d32.883810185840716!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda427f741ea7713%3A0x6b7465fcaa4683fa!2sKhouribga!5e0!3m2!1sfr!2sma!4v1573916777511!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                           </div> \n");
      out.write("                </div>\n");
      out.write("                <div id=\"gare-kech\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"tab-content-services\">\n");
      out.write("                                         <div id=\"map\">\n");
      out.write("                              <!-- How to change your own map point\n");
      out.write("                                  1. Go to Google Maps\n");
      out.write("                                  2. Click on your location point\n");
      out.write("                                  3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                                  4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                              -->\n");
      out.write("                                             <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d54341.40217724851!2d-8.06563844051406!3d31.65198123432255!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xdafee9465ae0bf7%3A0x27332ef8ec3bea85!2sGare%20de%20Marrakech!5e0!3m2!1sfr!2sma!4v1573916706774!5m2!1sfr!2sma\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe></div>\n");
      out.write("                                        </div>\n");
      out.write("                                           </div> \n");
      out.write("                </div>\n");
      out.write("                             \n");
      out.write("        </section>\n");
      out.write("          \n");
      out.write("         </div>\n");
      out.write("         </section>\n");
      out.write("    \n");
      out.write("        <section id=\"serveurcoordonnees\" class=\"portfolio-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-heading\">\n");
      out.write("                            <h4 style=\"color:#0CD2C6\">Mes informations</h4>\n");
      out.write("                           </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               <div class=\"container\">\n");
      out.write("                                       <div class=\"row\">\n");
      out.write("                                         \n");
      out.write("\t\t\t\t\t<div class=\"col-md-20 col-md-offset-15 animate-box\">\n");
      out.write("\t\t\t\t\n");
      out.write("                                              \n");
      out.write("               \n");
      out.write("                                    \n");
      out.write("                        ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                <table class=\"table table-striped\">\n");
      out.write("                                                   \n");
      out.write("              \n");
      out.write("                <tr>  <th>  Login </th>\n");
      out.write("                      <th>  Mot de passe</th>\n");
      out.write("                      <th>  Matricule </th>\n");
      out.write("                </tr>\n");
      out.write("                <tbody> \n");
      out.write("                     ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("               </table>\n");
      out.write("  \n");
      out.write("                                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("        </section>  \n");
      out.write("        \n");
      out.write("           <div class=\"container\">\n");
      out.write("                                       <div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-20 col-md-offset-15 animate-box\">\n");
      out.write("                                            \n");
      out.write("                                                <h2 class=\"colorlib-heading\" style=\"color:#09A34D\">Modification des coordonnées</h2>\n");
      out.write("                                                <form action=\"modifierserveurcoord\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row form-group\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"fname\">Login</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"login\" name=\"login\" class=\"form-control\" placeholder=\"...\"/>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                     \n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"fname\">Mot de passe</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"password\" name=\"password\" class=\"form-control\" placeholder=\"...\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"lname\">Matricule</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"matricule\" name=\"matricule\" class=\"form-control\" placeholder=\"...\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                            </br>\n");
      out.write("                                                            </br>\n");
      out.write("                                                            </br>\n");
      out.write("                                                            </br>\n");
      out.write("                                                            </br>\n");
      out.write("                                                            <div class=\"form-group text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Confirmer la modifictation\" class=\"btn btn-primary\"/>\n");
      out.write("\t\t\t\t\t\t\t   </div>   \n");
      out.write("                                                             </div>  \n");
      out.write("                                             </form>   \n");
      out.write("                                                \n");
      out.write("                                                                            </div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("                                        </div> \n");
      out.write("                    </div>\n");
      out.write("         <section id=\"contact-us\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-heading\">\n");
      out.write("                            <h4>Contactez nous</h4>\n");
      out.write("                            <p>Notre service est toujours à votre disposition. Contactez-nous à tout moment!</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <form id=\"contact\" action=\"#\" method=\"post\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                  <fieldset>\n");
      out.write("                                      <h4> <li><i class=\"fa fa-user\"></i> <a href=\"#\">www.facebook.com/ETrain</a></li></h4>\n");
      out.write("                                  </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                  <fieldset>\n");
      out.write("                                      <h4> <li><i class=\"fa fa-user\"></i> <a href=\"#\">www.twitter.com/ETrain</a></li></h4>\n");
      out.write("                                  </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"col-md-6\">\n");
      out.write("                                  <fieldset>\n");
      out.write("                                      <h4> <li><i class=\"fa fa-user\"></i><a href=\"#\"> www.github.com/ETrain</a></li></h4>\n");
      out.write("                                  </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                  <fieldset>\n");
      out.write("                                      <h4> <li><i class=\"fa fa-user\"></i><a href=\"#\"> www.linkedin.com/ETrain</a></li></h4>\n");
      out.write("                                  </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                  <fieldset>\n");
      out.write("                                      <h4> <li><i class=\"fa fa-user\"></i><a href=\"#\"> trainmaroc@etrain.com</a></li></h4>\n");
      out.write("                                  </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                  <fieldset>\n");
      out.write("                              <h4> <li><i class=\"fa fa-user\"></i> 07 07 07 07 07</li></h4>\n");
      out.write("                                  </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("         <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-12\">\n");
      out.write("                            <p> </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-12\">\n");
      out.write("                        <ul class=\"social-icons\">\n");
      out.write("                            <li><a href=\"#\"> </a></li>\n");
      out.write("                            <li><a href=\"#\"> </a></li>\n");
      out.write("                            <li><a href=\"#\"> </a></li>\n");
      out.write("                            <li><a href=\"#\"> </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-2 col-md-offset-2 col-sm-12\">\n");
      out.write("                        <div class=\"back-to-top\">\n");
      out.write("                            <a href=\"#top\">\n");
      out.write("                                <i class=\"fa fa-angle-up\"></i>\n");
      out.write("                                back to top\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"js/vendor/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.0.min.js\"><\\/script>')</script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Google Map -->\n");
      out.write("        <script src=\"http://maps.google.com/maps/api/js?sensor=true\"></script>\n");
      out.write("        <script src=\"js/vendor/jquery.gmap3.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            \n");
      out.write("            // mobile nav toggle\n");
      out.write("            $('#nav-toggle').on('click', function (event) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                $('#main-nav').toggleClass(\"open\");\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <!-- templatemo 406 flex -->\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("dbSource");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/ps3");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dbSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setVar("result");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("  select * from serveur  ;\n");
          out.write("                      \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                     <tr>\n");
          out.write("                     <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                     <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                     <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                     </tr>\n");
          out.write("                 ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.login}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.password}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.matricule}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}
