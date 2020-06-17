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
                                                <li><a href="#">Accueil</a></li>
                                                <li class="active"><a href="#about">About us</a></li>
                                               
                                                
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
                            
                      
                           <h2 style="color:#0CD2C6"> Vous êtes les bienvenus</h2>
                          
                            <ul class="buttons">
                                <li>
                                    <div class="primary-button">
                                        <a href="#about">S'authentifier</a>
                                    </div>
                                </li>
                                <li>
                                    <div class="secondary-button">
                                        <a href="#portfolio">S'inscrire </a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>


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

       
        <section id="about" class="page-section">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-4">
                        <div class="service-item first-service">
                            <div class="icon">
                                <img src="img/fourth-list-icon.png" alt="">
                            </div>
                            <h4><div class="border-button"><a href="#horaires">Consulter nos horaires</a></div></h4>
                            <p>Pour vous,notre cher visiteur, voiçi tous les horraires bien détailés de nos voyages.</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="service-item second-service">
                            <div class="icon">
                                <img src="img/third-list-icon.png" alt="">
                            </div>
                            <h4><div class="border-button"><a href="#gares">Consulter nos gares</a></div></h4>
                            <p>Pour localiser toutes les gares de notre service, veuillez entrer là! </p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="service-item third-service">
                            <div class="icon">
                                <img src="img/second-list-icon.png" alt="">
                            </div>
                            <h4><div class="border-button"><a href="#contact-us">Contacter notre service</a></div></h4>
                            <p>Besoin d'aide?</p>
                                <p>Contactez nous sans hésitation!</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
       <section id="horaires" class="portfolio-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-heading">
                            <h4 style="color:#0CD2C6">Nos voyages selon votre choix </h4>
                           </div>
                    </div>
                </div>
               <div class="container">
                 <div class="row">
                                           <br/>
                                           <br/>
                    <div class="col-md-20 col-md-offset-15 animate-box">
						<br/>
                                                <br/>
                                              
                 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>                                    
           <%
 
             String gareDepart =(String) request.getParameter("gareDepart");
             String gareArrivee =(String) request.getParameter("gareArrivee");
             String dateDepart =(String) request.getParameter("dateDepart");
            
           %>
        <sql:setDataSource var="dbSource" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ps3" user="root" password=""/>
        <sql:query dataSource="${dbSource}" var="result">
  select * from voyage where gareDepart=? and gareArrivee=? and dateDepart=? ;
                 <sql:param value="<%=gareDepart%>" />
                 <sql:param value="<%=gareArrivee%>" />
                 <sql:param value="<%=dateDepart%>" />
                      
                    </sql:query>
           <table class="table table-sm table-white">
                  <thead class="thead-light">
              
                <tr>
                    <th>  Numéro du voyage</th>
                    <th>  Numéro du train</th>
                    <th> Gare de départ</th>
                    <th> Gare d'arrivée</th>
                    <th> Date de départ</th>
                    <th> Date d'arrivée</th>
                    <th>  Durée de voyage</th>
                    <th>  Montant du voyage</th>
                </tr>
                 
                 <c:forEach var="row" items="${result.rows}">
                  <tr>
                    <td><c:out value="${row.labelVoyage}"/></td>
                     <td><c:out value="${row.numtrain}"/></td>
                     <td ><%=gareDepart%> </td>
                  <td ><%=gareArrivee%> </td>
                  <td ><%=dateDepart%> </td>
                    <td ><c:out value="${row.dateArrivee}"/> </td>
                    <td ><c:out value="${row.duree}"/> </td>
                     <td><c:out value="${row.montant}"/></td>
                  </tr>
                   
                </c:forEach>
                  </thead>
               </table>
                                        </div>
                    </div>
                    </div>
                    
                </div>
              
        </section>
        
         <section id="gares" class="portfolio-section">
        <div class="second-tabs-content what-we-do">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-heading">
                            <h4 style="color:#bf0857">Nos gares</h4>
                            <p>Par içi, vous pouvez localiser la gare qui vous sera utile.</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="wrapper">
                        <div class="col-md-12">
                            <div class="row">
                                <ul class="tabs clearfix" data-tabgroup="second-tab-group">
                                    <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#rabat-ville" class="active">
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Rabat Ville</h4>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#rabat-agdal">
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Rabat Agdal</h4>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-kenitra">
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Kénitra</h4>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-meknes">
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Meknès</h4>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-fes">
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Fès</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-oujda" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Oujda</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-tanger" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Tanger</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-media" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Mohamedia</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#casa-port" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Casa Port</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#casa-voy">
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Casa Voyageurs</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#aero-med" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Aeroport Med5</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-settat" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Settat</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-jadida" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare ElJadida</h4>
                                            </div>
                                        </a>
                                    </li>
                                     <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-kh" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Khouribga</h4>
                                            </div>
                                        </a>
                                    </li>
                                        <li class="col-md-15 col-sm-12 col-xs-12">
                                        <a href="#gare-kech" >
                                            <div class="list-item">
                                                <div class="icon">
                                                    <img src="img/fivth-list-icon.png" alt="">
                                                </div>
                                                <h4>Gare Marrakech</h4>
                                            </div>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        
                        </div>
                    </div>
                </div>
            </div>

      <div class="col-lg-1">
                            <section id="second-tab-group" class="tabgroup">
                <div id="rabat-ville">
                                    <div class="row">
                                        <div class="tab-content-services">
                                            <div class="col-md-30">
                                                     <div id="map">
                                <!-- How to change your own map point
                                    1. Go to Google Maps
                                    2. Click on your location point
                                    3. Click "Share" and choose "Embed map" tab
                                    4. Copy only URL and paste it within the src="" field below
                                -->
                                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3932.7602041191394!2d-6.836867614782172!3d34.017082597968155!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda76c7863654683%3A0x9dd409bdb7e6b2e0!2sGare%20Rabat%20Ville!5e0!3m2!1sfr!2sma!4v1573775205556!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                                                </div>
                                            </div>
                                            
                                        </div>
                                    </div>
                </div>
                <div id="rabat-agdal">
                                    <div class="row">
                                        <div class="tab-content-services">
                                                <div id="map">
                                            <!-- How to change your own map point
                                                1. Go to Google Maps
                                                2. Click on your location point
                                                3. Click "Share" and choose "Embed map" tab
                                                4. Copy only URL and paste it within the src="" field below
                                            -->
                                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3307.6259726557514!2d-6.85777468530205!3d34.002139727817216!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda76c8b445f408f%3A0x938ca02e638223e9!2sGare%20Rabat%20Agdal!5e0!3m2!1sfr!2sma!4v1573910962996!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
                                                           </div>

                                                                            </div>
                                                                        </div>
                </div>
                <div id="gare-kenitra">
                                    <div class="row">
                                        <div class="tab-content-services">
                                                                            <div id="map">
                                         <!-- How to change your own map point
                                             1. Go to Google Maps
                                             2. Click on your location point
                                             3. Click "Share" and choose "Embed map" tab
                                             4. Copy only URL and paste it within the src="" field below
                                         -->
                                       <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d13190.409107954873!2d-6.583007074045602!3d34.25869097375042!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda759fd0564b8cd%3A0x10bd8fe275b0b022!2sGare%20de%20K%C3%A9nitra!5e0!3m2!1sfr!2sma!4v1573911111386!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>                  </div>
                                                     </div>
                                            
                                        </div>

                </div>
                <div id="gare-meknes">
                                    <div class="row">
                                        <div class="tab-content-services">
                                       <div id="map">
                                <!-- How to change your own map point
                                    1. Go to Google Maps
                                    2. Click on your location point
                                    3. Click "Share" and choose "Embed map" tab
                                    4. Copy only URL and paste it within the src="" field below
                                -->
                               <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3311.7227630954844!2d-5.534070285305024!3d33.89679323335444!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda044e2951b1669%3A0x44d2a22913031c7e!2sGare%20de%20M%C3%A8knes!5e0!3m2!1sfr!2sma!4v1573911150386!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>               </div>
                                            </div>
                                        </div>
                </div>
                <div id="gare-fes">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                                   <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d211762.51399130086!2d-5.408690944805477!3d33.97225518223244!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd9f8b321750f0f1%3A0x15c6e8b10b9ff069!2sGare%20de%20F%C3%A8s!5e0!3m2!1sfr!2sma!4v1573911183771!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>                  </div>
                                          </div>
                                        </div>
                </div>
                <div id="gare-oujda">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                       <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3281.0174604655244!2d-1.9269665852828866!3d34.67950879186162!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd7864b09e6b0481%3A0xf2c453877b6aa52e!2sGare%20d&#39;%20Oujda!5e0!3m2!1sfr!2sma!4v1573916657570!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>   </div>
                                        </div>
                </div>
                </div>    
                <div id="gare-tanger">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                 <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12950.021160733024!2d-5.795123273348632!3d35.76296239454027!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd0b809c6e30ee7b%3A0x76d10e4ea25f6dcc!2sGare%20Tanger%20Ville!5e0!3m2!1sfr!2sma!4v1573916702252!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>         </div>
                                        </div>
                </div>
                   </div>     
                <div id="gare-media">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3319.5142860184383!2d-7.38994908531064!3d33.695638943886266!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda7b6f11d7e29a5%3A0x9a3d76b2ba1c3662!2sGare%20de%20Mohamm%C3%A9dia!5e0!3m2!1sfr!2sma!4v1573917539949!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>    </div>
                                        </div>
                                           </div> 
                </div>
                 <div id="casa-port">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                     <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3323.224277150907!2d-7.61501508531332!3d33.59948484890167!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda7d282407396df%3A0x3488829b8de662c2!2sCasa%20Port!5e0!3m2!1sfr!2sma!4v1573917460506!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>     </div>
                                        </div>
                                           </div> 
                </div>
                <div id="casa-voy">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                   <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3323.590704549503!2d-7.592228985313566!3d33.58997474939693!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda7cd6b769687b3%3A0x80143ee059f31ad1!2sGare%20de%20Casa%20Voyageurs!5e0!3m2!1sfr!2sma!4v1573917502727!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>       </div>
                                        </div>
                                           </div> 
                </div>
                <div id="aero-med">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3331.871565076342!2d-7.62569448531951!3d33.37441896059231!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda6255af2f0f4d1%3A0xa6638dc62e5fd5b!2sA%C3%A9roport%20Med%20V!5e0!3m2!1sfr!2sma!4v1573917408930!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>    </div>
                                        </div>
                                           </div> 
                </div>
                <div id="gare-settat">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                   <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3350.542950232284!2d-6.9111693!3d32.8838102!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda6056f94bfeb97%3A0x55e3773fadc26982!2sGare%20de%20Settat!5e0!3m2!1sfr!2sma!4v1573917428895!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>       </div>
                                        </div>
                                           </div> 
                </div>
                <div id="gare-jadida">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d26698.622412448745!2d-8.522620037582342!3d33.23171467093241!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda91e6bea2288c1%3A0x4f7731f7ebf15dfd!2sEl%20Jadida!5e0!3m2!1sfr!2sma!4v1573916861968!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>  </div>
                                        </div>
                                           </div> 
                </div>
                <div id="gare-kh">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                          <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3350.542950767614!2d-6.911169285332936!3d32.883810185840716!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xda427f741ea7713%3A0x6b7465fcaa4683fa!2sKhouribga!5e0!3m2!1sfr!2sma!4v1573916777511!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe> </div>
                                        </div>
                                           </div> 
                </div>
                <div id="gare-kech">
                                    <div class="row">
                                        <div class="tab-content-services">
                                         <div id="map">
                              <!-- How to change your own map point
                                  1. Go to Google Maps
                                  2. Click on your location point
                                  3. Click "Share" and choose "Embed map" tab
                                  4. Copy only URL and paste it within the src="" field below
                              -->
                                             <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d54341.40217724851!2d-8.06563844051406!3d31.65198123432255!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xdafee9465ae0bf7%3A0x27332ef8ec3bea85!2sGare%20de%20Marrakech!5e0!3m2!1sfr!2sma!4v1573916706774!5m2!1sfr!2sma" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe></div>
                                        </div>
                                           </div> 
                </div>
                             
        </section>
          
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