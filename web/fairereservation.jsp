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
                                                <li><a href="#about">About us</a></li>
                                                 <li><a href="#me">About me</a></li>
                                                <li><a href="deconnexion.jsp">Disconnexion</a></li>
                                                <li><a href="#contact-us">Contact</a></li>                                 
                                            </ul>                                   
                                        </div> <!-- /.main-menu -->
                                    </div>
                                </nav>
                             </div> <!-- /.row -->
                            
                        </div> <!-- /#menu-wrapper --> 
                        <h5 style="color:#F1F1F1"><strong><p> <%= new java.util.Date()%></p></strong></h5>
                    </div> <!-- /.container -->
                </div> <!-- /.main-header -->
            </div> <!-- /.site-header -->
        </div> <!-- /.site-main -->

        <div class="banner">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <div class="banner-content">
                                   <div class="form-group text-info">
                                                                    <br/>
                                               <a href="homeconsultationclient.jsp"> <input  type="submit" value="Retour à la page d'accueil" class="btn btn-warning"/></a>
                                                                        
                                   </div> 
                      
                           <h2 style="color:#0CD2C6"> Faites votre réservation ici</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
 
      <section id="inscrip">
            <div class="container">
                <div class="row">
                    <div class="col-md-11">
                        <div class="section-heading">
                            <h4 style="color:#0CD2C6">Inscription</h4>
                         </div>
                    </div>
                </div>
              
				<div class="col-md-8 col-md-offset-3 col-md-push-3 col-sm-12 col-xs-12 js-fullheight slider-text">
					   		<div class="col-md-12 col-md-offset-1 col-md-pull-8 animate-box" data-animate-effect="fadeInCenter">
							<form action="reservervoyage" method="post">
                                                                        
							<div class="row form-group">
								       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                                                       <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>     
                                                                        <% String num = (String) request.getAttribute("num"); %>
									
								<div class="col-md-6">
                                                                        <label for="fname">Numéro de voyage</label>
									<input type="text" id="numvoyage" name="numvoyage" value="${num}" class="form-control"  />
								</div>
								
							 
								<div class="col-md-6">
									<label for="lname">CIN</label>
									<input type="text" id="cinc" name="cinc" class="form-control" placeholder="...">
								</div>
							</div>
                                                          <div class="row form-group">
								<div class="col-md-6">
									<label for="fname">Date de réservation</label>
									<input type="text" id="datereserv" name="datereserv"  class="form-control" placeholder="...">
								</div>
                                                              <div class="col-md-6">
									<label for="fname">Heure de réservation</label>
									<input type="text" id="heurereserv" name="heurereserv"  class="form-control" placeholder="...">
								</div>
								
							</div>
						<select id="numvoiture"  name="numvoiture" >
                                                        <option value="">--Choisissez une voiture--</option>
                                                        <option value="voiture1">Voiture 1</option>
                                                        <option value="voiture2">Voiture 2</option>
                                                        <option value="voiture3">Voiture 3</option>
                                                        <option value="voiture4">Voiture 4</option>
                                                        <option value="voiture5">Voiture 5</option>
                                                        <option value="voiture6">Voiture 6</option>
                                                        <option value="voiture7">Voiture 7</option>
                                                        <option value="voiture8">Voiture 8</option>
                                                        <option value="voiture9">Voiture 9</option>
                                                        <option value="voiture10">Voiture 10</option>

                                                    </select>

                                                                            </br>
                                                                            </br>
							<div class="form-group text-center">
								<input type="submit" value="Choisissez votre place" class="btn btn-primary">
							</div>

						</form>		
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