package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class espaceclientadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                                               <li class=\"active\"><a href=\"admin.jsp\">Accueil</a></li>\n");
      out.write("                                                <li><a href=\"#horaires\">Consultations</a></li>\n");
      out.write("                                             \n");
      out.write("                                                <li><a href=\"deconnexion.jsp\">Disconnexion</a></li>\n");
      out.write("                                                <li><a href=\"#contact-us\">Contact</a></li>                                 \n");
      out.write("                                            </ul>                                    \n");
      out.write("                                        </div> <!-- /.main-menu -->\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div> <!-- /.row -->\n");
      out.write("                        </div> <!-- /#menu-wrapper -->                        \n");
      out.write("                    </div> <!-- /.container -->\n");
      out.write("                </div> <!-- /.main-header -->\n");
      out.write("            </div> <!-- /.site-header -->\n");
      out.write("        </div> <!-- /.site-main -->\n");
      out.write("\n");
      out.write("       <section id=\"admincoordonnees\" class=\"portfolio-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-heading\">\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                             <br>\n");
      out.write("                            <br>\n");
      out.write("                                                       <\n");
      out.write("\n");
      out.write("                            <h4 style=\"color:#0CD2C6\">Liste des clients</h4>\n");
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
      out.write("               \n");
      out.write("    \n");
      out.write("\n");
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
      out.write("                <tr><th>  Nom </th>\n");
      out.write("                      <th> Prénom</th>\n");
      out.write("                      <th>  Date de naissance </th>\n");
      out.write("                      <th>  Numéro de tel</th>\n");
      out.write("                      <th>  CIN </th>\n");
      out.write("                      <th>  Adresse Email</th>\n");
      out.write("                    <th>  Login </th>\n");
      out.write("                      <th>  Mot de passe</th>\n");
      out.write("                   \n");
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
      out.write("        </section>       \n");
      out.write("                    \n");
      out.write("       <div id=\"colorlib-contact\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("                                   <div class=\"col-md-20 col-md-offset-15 animate-box\">\n");
      out.write("                                       <br/>\n");
      out.write("\t\t\t\t\t\t<h1 class=\"colorlib-heading\" style=\"color:#09A34D\">*AJOUT</h1>\n");
      out.write("                                                <div class=\"col-md-8 col-md-offset-3 col-md-push-3 col-sm-12 col-xs-12 js-fullheight slider-text\">\n");
      out.write("\t\t\t\t\t        <div class=\"col-md-12 col-md-offset-1 col-md-pull-8 animate-box\" data-animate-effect=\"fadeInCenter\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                <form action=\"AjouterUser\" method=\"post\">\n");
      out.write("                                 \t<div class=\"row form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"fname\">Nom</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"nom\" name=\"nom\" class=\"form-control\" placeholder=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"lname\">Prénom</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"prenom\" name=\"prenom\" class=\"form-control\" placeholder=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                          <div class=\"row form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"fname\">Date de naissance</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"datenaissance\" name=\"datenaissance\"  class=\"form-control\" placeholder=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"lname\">Numéro de télephone</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"tel\" name=\"tel\"  class=\"form-control\" placeholder=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"fname\">Code CIN</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"cin\" name=\"cin\"  class=\"form-control\" placeholder=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"lname\">Adresse Email</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"addressemail\" name=\"addressemail\"  class=\"form-control\" placeholder=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                        <div class=\"row form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"fname\">Login</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"login\" name=\"login\"  class=\"form-control\" placeholder=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"lname\">Mot de passe</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"password\" name=\"password\"  class=\"form-control\" placeholder=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                            </br>\n");
      out.write("                                                                            </br>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"validate\" class=\"btn btn-primary\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</form>\t                              \n");
      out.write("                                 </div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                       \n");
      out.write("                                        </div> \n");
      out.write("             </div>\n");
      out.write("                  \n");
      out.write("                                        <div class=\"container\">\n");
      out.write("                                       <div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-20 col-md-offset-15 animate-box\">\n");
      out.write("                                             \n");
      out.write("                                                <h1 class=\"colorlib-heading\" style=\"color:#CF1C22\">**SUPPRESSION</h1>\n");
      out.write("<div class=\"col-md-8 col-md-offset-3 col-md-push-3 col-sm-12 col-xs-12 js-fullheight slider-text\">\n");
      out.write("\t\t\t\t\t        <div class=\"col-md-12 col-md-offset-1 col-md-pull-8 animate-box\" data-animate-effect=\"fadeInCenter\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                           <form action=\"supprimerUser\" method=\"post\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t         <div class=\"col-md-6\">\n");
      out.write("                                                             <label for=\"fname\">CIN</label>\n");
      out.write("                                                             <input type=\"text\" id=\"cin\" name=\"cin\" class=\"form-control\" placeholder=\"...\"/>\n");
      out.write("                                                        </div>\n");
      out.write("                                               \n");
      out.write("                                                             <div class=\"form-group text-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Confirmer la suppression\" class=\"btn btn-danger\"/>\n");
      out.write("\t\t\t\t\t\t\t   </div>   \n");
      out.write("                                             </form>               \n");
      out.write("                                      </div>  \n");
      out.write("                                           \n");
      out.write("                                            </div>\n");
      out.write("                                                                  \n");
      out.write("                                           </div>>\n");
      out.write("                        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                    \n");
      out.write("       \n");
      out.write("        \n");
      out.write(" \n");
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
          out.write("             \n");
          out.write("  select * from client ;\n");
          out.write("                         \n");
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
          out.write("                          <td>");
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
          out.write("                            <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                     <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                     <td>");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                     <td>");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                     <td>");
          if (_jspx_meth_c_out_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                 \n");
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
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.nom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.prenom}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.datenaissance}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.tel}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.cin}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.addressemail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.login}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_out_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_7.setPageContext(_jspx_page_context);
    _jspx_th_c_out_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.password}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
    if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
    return false;
  }
}
