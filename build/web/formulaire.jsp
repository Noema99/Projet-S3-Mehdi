 <section id="admincoordonnees" class="portfolio-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-heading">
                            <h4 style="color:#0CD2C6">Mes informations</h4>
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
                <tbody> 
                     <c:forEach var="row" items="${result.rows}">
                     <tr>
                          <td><c:out value="${row.nom}"/></td>
                     <td><c:out value="${row.prenom}"/></td>
                     <td><c:out value="${row.datenaissance}"/></td>
                            <td><c:out value="${row.tel}"/></td>
                     <td><c:out value="${row.cin}"/></td>
                     <td><c:out value="${row.addressemail}"/></td>
                     <td><c:out value="${row.login}"/></td>
                     <td><c:out value="${row.password}"/></td>
                 
                     </tr>
                 </c:forEach>
                </tbody>
               </table>
  
                                        </div>
                    </div>
                    </div>
                    
                </div>
               
                
        </section>  