<%-- 
    Document   : home
    Created on : Nov 15, 2019, 12:06:24 AM
    Author     : BENADADA Noema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
        
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/templatemo_misc.css">
        <link rel="stylesheet" href="css/templatemo_style.css">
        <link rel="stylesheet" href="css/owl-carousel.css">

        <script src="js/vendor/modernizr-2.6.1-respond-1.1.0.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an outdated browser. <a href="http://browsehappy.com/">Upgrade your browser today</a> or <a href="http://www.google.com/chromeframe/?redirect=true">install Google Chrome Frame</a> to better experience this site.</p>
        <![endif]-->


        <div class="site-main" id="sTop">
            <div class="site-header">
                <div class="main-header">
                    <div class="container">
                        <div id="menu-wrapper">
                            <div class="row">
                                <nav class="navbar navbar-inverse" role="navigation">
                                    <div class="navbar-header">
                                        <button type="button" id="nav-toggle" class="navbar-toggle" data-toggle="collapse" data-target="#main-nav">
                                            <span class="sr-only">Toggle navigation</span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                        </button>
                                        <a href="#top" class="navbar-brand">E-TRAIN</a>
                                        <div id="main-nav" class="collapse navbar-collapse">
                                            <ul class="menu-first nav navbar-nav" style="margin-right: 20px;">
                                               <li class="active"><a href="#">Accueil</a></li>
                                                <li><a href="#about">Consultations</a></li>
                                             
                                                <li><a href="deconnexion.jsp">Disconnexion</a></li>
                                                <li><a href="#contact-us">Contact</a></li>                                 
                                            </ul>                                    
                                        </div> <!-- /.main-menu -->
                                    </div>
                                </nav>
                            </div> <!-- /.row -->
                        </div> <!-- /#menu-wrapper -->                        
                    </div> <!-- /.container -->
                </div> <!-- /.main-header -->
            </div> <!-- /.site-header -->
        </div> <!-- /.site-main -->


        <div class="intro">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h4 style="color:#053342">Service E-TRAIN </h4>
                        <h6>Choisissez la meilleure des destinations selon vous!</h6>
                        <h6> Achetez maintenant votre ticket de voyage!</h6>
                        <h6> Avec le minimum de Temps et d'Effort et le maximun de Confort!</h6>
                        <div class="border-button"><a href="#about">Découvrez-nous par içi</a></div>
                    </div>
                </div>
            </div>
        </div>

      <section id="horaires" class="portfolio-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-heading">
                            <h4 style="color:#0CD2C6">Consultation des commandes</h4>
                           </div>
                    </div>
                </div>
               <div class="container">
                                       <div class="row">
                                           <br/>
                                           <br/>
					<div class="col-md-20 col-md-offset-20 animate-box">
						<br/>
                                                <br/>
                                              
               <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>                                    
                        <sql:setDataSource var="dbSource" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ps3" user="root" password=""/>
        <sql:query dataSource="${dbSource}" var="result">
       select r.nomR, cmd.qtite, cmd.prixtotal, c.nom, c.prenom, cmd.cinc  from client c, repas r, commande cmd where c.cin=cmd.cinc and cmd.nomRepas=r.nomR;  
                      
                    </sql:query>
                                                <table class="table table-striped table-advance table-hover">
               <tr>
                       
                    <th> Nom repas </th>
                    <th>  Quantité commandée</th>
                     <th>  Prix total </th>
                    <th> Nom voyageur </th>
                    <th> Prénom voyageur </th>
                  
                    <th> CIN voyageur </th>
               </tr>
           
                 <c:forEach var="row" items="${result.rows}">
             <tbody>        <tr>
                    <td><c:out value="${row.nomR}"/></td>
                     <td><c:out value="${row.qtite}"/></td>
               <td><c:out value="${row.prixtotal}"/></td>
                         <td><c:out value="${row.nom}"/></td>
                     <td><c:out value="${row.prenom}"/></td>   
                   
                     <td><c:out value="${row.cinc}"/></td>
                      <td class="action">
                   <a href="<c:url value="/validercommande"><c:param name="cinc" value="${row.cinc }" /></c:url>">
                         Valider cette commande
                        </a>
                    
                  </tr>
              </tbody>      </c:forEach>
           
               </table>
                                        </div>
                    </div>
                    </div>
                </div>
        </section>    
        
     

 
         <section id="contact-us">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-heading">
                            <h4>Contactez nous</h4>
                            <p>Notre service est toujours à votre disposition. Contactez-nous à tout moment!</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <form id="contact" action="#" method="post">
                            <div class="row">
                                <div class="col-md-6">
                                  <fieldset>
                                      <h4> <li><i class="fa fa-user"></i> <a href="#">www.facebook.com/ETrain</a></li></h4>
                                  </fieldset>
                                </div>
                                <div class="col-md-6">
                                  <fieldset>
                                      <h4> <li><i class="fa fa-user"></i> <a href="#">www.twitter.com/ETrain</a></li></h4>
                                  </fieldset>
                                </div>
                                 <div class="col-md-6">
                                  <fieldset>
                                      <h4> <li><i class="fa fa-user"></i><a href="#"> www.github.com/ETrain</a></li></h4>
                                  </fieldset>
                                </div>
                                <div class="col-md-6">
                                  <fieldset>
                                      <h4> <li><i class="fa fa-user"></i><a href="#"> www.linkedin.com/ETrain</a></li></h4>
                                  </fieldset>
                                </div>
                                <div class="col-md-6">
                                  <fieldset>
                                      <h4> <li><i class="fa fa-user"></i><a href="#"> trainmaroc@etrain.com</a></li></h4>
                                  </fieldset>
                                </div>
                                <div class="col-md-6">
                                  <fieldset>
                              <h4> <li><i class="fa fa-user"></i> 07 07 07 07 07</li></h4>
                                  </fieldset>
                                </div>
                            </div>
                        </form>
                    </div>
                    
                  
                    </div>
                </div>
            </div>
        </section>
         <footer>
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-sm-12">
                            <p> </p>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <ul class="social-icons">
                            <li><a href="#"> </a></li>
                            <li><a href="#"> </a></li>
                            <li><a href="#"> </a></li>
                            <li><a href="#"> </a></li>
                        </ul>
                    </div>
                    <div class="col-md-2 col-md-offset-2 col-sm-12">
                        <div class="back-to-top">
                            <a href="#top">
                                <i class="fa fa-angle-up"></i>
                                back to top
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </footer>

        
        <script src="js/vendor/jquery-1.11.0.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.0.min.js"><\/script>')</script>
        <script src="js/bootstrap.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>

        <!-- Google Map -->
        <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        <script src="js/vendor/jquery.gmap3.min.js"></script>

        <script type="text/javascript">
        $(document).ready(function() {
            
            // mobile nav toggle
            $('#nav-toggle').on('click', function (event) {
                event.preventDefault();
                $('#main-nav').toggleClass("open");
            });
        });
        </script>
        
        <!-- templatemo 406 flex -->
    </body>
</html>