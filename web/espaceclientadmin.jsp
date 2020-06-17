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

       <section id="admincoordonnees" class="portfolio-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-heading">
                            <br>
                            <br>
                             <br>
                            <br>
                                                       <

                            <h4 style="color:#0CD2C6">Liste des clients</h4>
                           </div>
                    </div>
                </div>
               <div class="container">
                                       <div class="row">
                                         
					<div class="col-md-20 col-md-offset-15 animate-box">
				
                                              
               <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
               
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>    

                        <sql:setDataSource var="dbSource" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ps3" user="root" password=""/>
        <sql:query dataSource="${dbSource}" var="result">
             
  select * from client ;
                         
                    </sql:query>
                                                <table class="table table-striped">
                                                   
              
                <tr><th>  Nom </th>
                      <th> Prénom</th>
                      <th>  Date de naissance </th>
                      <th>  Numéro de tel</th>
                      <th>  CIN </th>
                      <th>  Adresse Email</th>
                    <th>  Login </th>
                      <th>  Mot de passe</th>
                   
                </tr>
            
                     <c:forEach var="row" items="${result.rows}">
                      <tbody>    <tr>
                          <td><c:out value="${row.nom}"/></td>
                     <td><c:out value="${row.prenom}"/></td>
                     <td><c:out value="${row.datenaissance}"/></td>
                            <td><c:out value="${row.tel}"/></td>
                     <td><c:out value="${row.cin}"/></td>
                     <td><c:out value="${row.addressemail}"/></td>
                     <td><c:out value="${row.login}"/></td>
                     <td><c:out value="${row.password}"/></td>
                 
                     </tr>
                     </tbody>
                     </c:forEach>
           
               </table>
  
                                        </div>
                    </div>
                    </div>
                    
                </div>
               
                
        </section>       
                    
       <div id="colorlib-contact">
			<div class="container">
				<div class="row">
                                   <div class="col-md-20 col-md-offset-15 animate-box">
                                       <br/>
						<h1 class="colorlib-heading" style="color:#09A34D">*AJOUT</h1>
                                                <div class="col-md-8 col-md-offset-3 col-md-push-3 col-sm-12 col-xs-12 js-fullheight slider-text">
					        <div class="col-md-12 col-md-offset-1 col-md-pull-8 animate-box" data-animate-effect="fadeInCenter">
									
                                                <form action="AjouterUser" method="post">
                                 	<div class="row form-group">
								<div class="col-md-6">
									<label for="fname">Nom</label>
									<input type="text" id="nom" name="nom" class="form-control" placeholder="...">
								</div>
								<div class="col-md-6">
									<label for="lname">Prénom</label>
									<input type="text" id="prenom" name="prenom" class="form-control" placeholder="...">
								</div>
							</div>
                                                          <div class="row form-group">
								<div class="col-md-6">
									<label for="fname">Date de naissance</label>
									<input type="text" id="datenaissance" name="datenaissance"  class="form-control" placeholder="...">
								</div>
								<div class="col-md-6">
									<label for="lname">Numéro de télephone</label>
									<input type="text" id="tel" name="tel"  class="form-control" placeholder="...">
								</div>
							</div>
                                                        <div class="row form-group">
								<div class="col-md-6">
									<label for="fname">Code CIN</label>
									<input type="text" id="cin" name="cin"  class="form-control" placeholder="...">
								</div>
								<div class="col-md-6">
									<label for="lname">Adresse Email</label>
									<input type="text" id="addressemail" name="addressemail"  class="form-control" placeholder="...">
								</div>
							</div>
                                                        <div class="row form-group">
								<div class="col-md-6">
									<label for="fname">Login</label>
									<input type="text" id="login" name="login"  class="form-control" placeholder="...">
								</div>
								<div class="col-md-6">
									<label for="lname">Mot de passe</label>
									<input type="password" id="password" name="password"  class="form-control" placeholder="...">
								</div>
							</div>
                                                                            </br>
                                                                            </br>
							<div class="form-group text-center">
								<input type="submit" value="validate" class="btn btn-primary">
							</div>

						</form>	                              
                                 </div>
					
                                       
                                        </div> 
             </div>
                  
                                        <div class="container">
                                       <div class="row">
					<div class="col-md-20 col-md-offset-15 animate-box">
                                             
                                                <h1 class="colorlib-heading" style="color:#CF1C22">**SUPPRESSION</h1>
<div class="col-md-8 col-md-offset-3 col-md-push-3 col-sm-12 col-xs-12 js-fullheight slider-text">
					        <div class="col-md-12 col-md-offset-1 col-md-pull-8 animate-box" data-animate-effect="fadeInCenter">
						
                                           <form action="supprimerUser" method="post">
					
						         <div class="col-md-6">
                                                             <label for="fname">CIN</label>
                                                             <input type="text" id="cin" name="cin" class="form-control" placeholder="..."/>
                                                        </div>
                                               
                                                             <div class="form-group text-right">
								<input type="submit" value="Confirmer la suppression" class="btn btn-danger"/>
							   </div>   
                                             </form>               
                                      </div>  
                                           
                                            </div>
                                                                  
                                           </div>>
                        
        
        
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