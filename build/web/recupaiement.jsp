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
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

<h2 style="color:#cc0000"><center>SVP VEUILLEZ MONTRER CE RECU AU CONTROLLEUR LORS DE VOTRE VOYAGE</center></h2>

  <div class="container">
                                       <div class="row">
					<div class="col-md-20 col-md-offset-15 animate-box">
                                  
                                                <h1 class="colorlib-heading" style="color:#3B8CB1">**Reçu</h1>
                                                <div class="col-md-8 col-md-offset-3 col-md-push-3 col-sm-12 col-xs-12 js-fullheight slider-text">
					        <div class="col-md-12 col-md-offset-1 col-md-pull-8 animate-box" data-animate-effect="fadeInCenter">
						 <form action="/">
  
          <div class="row">
            <div class="col-12">
            <div class="row form-group">
                <div class="col-md-6">
              <label for="nom"><i class="fa fa-user" ></i> Nom complet</label>
              <input disabled type="text" id="cin" name="cin" value="Anas Houzaly">
              </div>  
           </div>
              <div class="row form-group">
              <div class="col-md-6"><label for="numvoyage"><i class="fa fa"></i> Numero de votre voyage</label>
              <input disabled type="text" id="numvoyage" name="numvoyage"  value="${Recu.numVoyage}">
                </div><div class="col-md-6">
              <label for="numtrain"><i class="fa fa"></i> Numéro de train</label>
              <input disabled type="text" id="numtrain" value="${Recu.numTrain}" name="city" >
              </div>
               </div>
              <div class="row form-group">
             <div class="col-md-6"> <label for="nuvoiture"><i class="fa fa"></i> Numéro de voiture</label>
              <input disabled type="text" id="nuvoiture" value="${Recu.numVoiture}" name="city" >
                </div>
            <div class="col-md-6">  <label for="numplace"><i class="fa fa"></i> Numéro de place</label>
              <input disabled type="text" id="numplace" value="${Recu.numPlace}" name="city" >
               </div> 
                </div>
               <div class="row form-group">
             <div class="col-md-6"> <label for="gareDepart"><i class="fa fa"></i> Gare de départ</label>
              <input disabled type="text" id="gareDepart" value="${Recu.gareDepart}" name="city" >
             </div>
            <div class="col-md-6">  <label for="gareArrivee"><i class="fa fa"></i> Gare d'arrivée</label>
              <input disabled type="text" id="gareArrivee" value="${Recu.gareArrivee}" name="city" >
               </div>   </div>
     
               <div class="row form-group">
            <div class="col-md-6">  <label for="dateDepart"><i class="fa fa"></i> Date de départ</label>
              <input disabled type="text" id="dateDepart" value="${Recu.heureDepart}" name="city" >
            </div>
            <div class="col-md-6">  <label for="dateArrivee"><i class="fa fa"></i> Date d'arrivée</label>
              <input disabled type="text" id="dateArrivee" value="${Recu.heureArrivee}" name="city" >
                </div>  </div> 
      
               <div class="row form-group">
            <div class="col-md-6">  <label for="montant"><i class="fa fa"></i> Montant du voyage</label>
              <input disabled type="text" id="montant" value="105Dhs" name="city" >
               </div>
             <div class="col-md-6">  <label for="Duree"><i class="fa fa"></i> Durée</label>
              <input disabled type="text" id="dateArrivee" value="5hrs" name="city" >
                </div
            </div>
    </div>   </div>
         </div> 
        </form>
      </div>
    </div>
  </div>  </div>
                
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
  </body>
  </html>