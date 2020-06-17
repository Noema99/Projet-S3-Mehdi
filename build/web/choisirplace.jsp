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
                                               <li class="active"><a href="admin.jsp">Accueil</a></li>
                                                <li><a href="#horaires">Consultations</a></li>
                                             
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
                    

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Example - Train Booking System</title>
    <link rel="stylesheet" type="text/css" href="styl.css">
        
    </head>
    <body>
        <div class="plane">
  <div class="cockpit">
    <h1>Please select a seat</h1>
  </div>
  <div class="exit exit--front fuselage">
    
  </div>
  <ol class="cabin fuselage">
    <li class="row row--1">
      <ol class="seats" type="A">
        <li class="seat">
            <c:choose>
            <c:when test= "${empty voiture.place1}"> 
          <input type="checkbox" id="1A" name="place1" value="reserv" />
          <label for="1A">1A</label> </c:when>
          <c:otherwise><input type="checkbox"  disabled id="1A" />
          <label for="1A">1A</label></c:otherwise>
          </c:choose>
        </li>
        <li class="seat">
          <input type="checkbox" id="1B" />
          <label for="1B">1B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="1C" />
          <label for="1C">1C</label>
        </li>
        <li class="seat">
          <input type="checkbox"  id="1D" />
          <label for="1D">1D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--2">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="2A" />
          <label for="2A">2A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="2B" />
          <label for="2B">2B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="2C" />
          <label for="2C">2C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="2D" />
          <label for="2D">2D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--3">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="3A" />
          <label for="3A">3A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="3B" />
          <label for="3B">3B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="3C" />
          <label for="3C">3C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="3D" />
          <label for="3D">3D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--4">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="4A" />
          <label for="4A">4A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="4B" />
          <label for="4B">4B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="4C" />
          <label for="4C">4C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="4D" />
          <label for="4D">4D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--5">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="5A" />
          <label for="5A">5A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="5B" />
          <label for="5B">5B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="5C" />
          <label for="5C">5C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="5D" />
          <label for="5D">5D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--6">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="6A" />
          <label for="6A">6A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="6B" />
          <label for="6B">6B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="6C" />
          <label for="6C">6C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="6D" />
          <label for="6D">6D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--7">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="7A" />
          <label for="7A">7A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="7B" />
          <label for="7B">7B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="7C" />
          <label for="7C">7C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="7D" />
          <label for="7D">7D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--8">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="8A" />
          <label for="8A">8A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="8B" />
          <label for="8B">8B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="8C" />
          <label for="8C">8C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="8D" />
          <label for="8D">8D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--9">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="9A" />
          <label for="9A">9A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="9B" />
          <label for="9B">9B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="9C" />
          <label for="9C">9C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="9D" />
          <label for="9D">9D</label>
        </li>
        
      </ol>
    </li>
    <li class="row row--10">
      <ol class="seats" type="A">
        <li class="seat">
          <input type="checkbox" id="10A" />
          <label for="10A">10A</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="10B" />
          <label for="10B">10B</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="10C" />
          <label for="10C">10C</label>
        </li>
        <li class="seat">
          <input type="checkbox" id="10D" />
          <label for="10D">10D</label>
        </li>
        
      </ol>
    </li>
  </ol>
  <div class="exit exit--back fuselage">
    
  </div>
</div>

 
        
        
                    
       
        
 
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