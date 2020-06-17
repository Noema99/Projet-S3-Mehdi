<%-- 
    Document   : place
    Created on : 21 janv. 2020, 20:32:50
    Author     : hp i5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Example - Train Booking System</title>
    <link rel="stylesheet" type="text/css" href="styl.css">
        
    </head>
    <body>
         <%
             String numvoiture =(String) request.getAttribute("numvoiture");
               pageContext.setAttribute("numvoiture", new String(numvoiture));
              String voitura = (String) request.getAttribute("voitura");
              String numtrain = (String) request.getAttribute("numtrain");
              String CIN= (String) request.getAttribute("CIN");
            
           %>
 
            
        <div class="plane">
  <div class="cockpit">
    <h1>Select a seat</h1>
    
   




  </div>
        <form action="ticket" method="post">
  <div class="exit exit--front fuselage">

  </div>
  <ol class="cabin fuselage">
    <li class="row row--1">
      <ol class="seats" type="A">
        <li class="seat">
          
            <c:if test="${ voiture.place1 == 'dispo'}" > 
          <input type="checkbox" id="1A" name="place1" value="indispo" />
          <label for="1A">1A</label>
            </c:if>
          <c:if test ="${voiture.place1 == 'indispo'}"><input type="checkbox"  disabled id="1A" />
          <label for="1A">1A</label>
          </c:if>
         
        </li>
        <li class="seat">
            <c:if test="${voiture.place2 == 'dispo'}">
          <input type="checkbox" id="1B" name="place2" value="indispo" />
          <label for="1B">1B</label>
            </c:if>
        <c:if test ="${voiture.place2 == 'indispo'}"><input type="checkbox"  disabled id="1B" />
          <label for="1B">1B</label>
        </c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place3 == 'dispo'}">
          <input type="checkbox" id="1C" name="place3" value="indispo"  />
          <label for="1C">1C</label>
             </c:if>
          <c:if test ="${voiture.place3 == 'indispo'}"><input type="checkbox"  disabled id="1C" />
          <label for="1C">1C</label>
          </c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place4 == 'dispo'}">
          <input type="checkbox"  id="1D" name="place4" value="indispo" />
          <label for="1D">1D</label>
             </c:if>
          <c:if test ="${voiture.place4 == 'indispo'}"><input type="checkbox"  disabled id="1D" />
          <label for="1D">1D</label></c:if>
         
        </li>
        
      </ol>
    </li>
    <li class="row row--2">
      <ol class="seats" type="A">
        <li class="seat">
             <c:if test="${voiture.place5 == 'dispo'}">
          <input type="checkbox" id="2A" name="place5" value="indispo" />
          <label for="2A">2A</label>
             </c:if>
          <c:if test ="${voiture.place5 == 'indispo'}"><input type="checkbox"  disabled id="2A" />
          <label for="2A">2A</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place6 == 'dispo'}">
          <input type="checkbox" id="2B" name="place6" value="indispo" />
          <label for="2B">2B</label>
             </c:if>
          <c:if test ="${voiture.place6 == 'indispo'}"><input type="checkbox"  disabled id="2B" />
          <label for="2B">2B</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place7 == 'dispo'}">
          <input type="checkbox" id="2C" name="place7" value="indispo" />
          <label for="2C">2C</label>
             </c:if>
          <c:if test ="${voiture.place7 == 'indispo'}"><input type="checkbox"  disabled id="2C" />
          <label for="2C">2C</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place8 == 'dispo'}">
          <input type="checkbox" id="2D" name="place8" value="indispo" />
          <label for="2D">2D</label>
             </c:if>
          <c:if test ="${voiture.place8 == 'indispo'}"><input type="checkbox"  disabled id="2D" />
          <label for="2D">2D</label></c:if>
         
        </li>
        
      </ol>
    </li>
    <li class="row row--3">
      <ol class="seats" type="A">
        <li class="seat">
             <c:if test="${voiture.place9 == 'dispo'}">
          <input type="checkbox" id="3A" name="place9" value="indispo" />
          <label for="3A">3A</label>
             </c:if>
          <c:if test ="${voiture.place9 == 'indispo'}"><input type="checkbox"  disabled id="3A" />
          <label for="3A">3A</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place10 == 'dispo'}">
          <input type="checkbox" id="3B" name="place10" value="indispo" />
          <label for="3B">3B</label>
             </c:if>
          <c:if test ="${voiture.place10 == 'indispo'}"><input type="checkbox"  disabled id="3B" />
              <label for="3B">3B</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place11 == 'dispo'}">
          <input type="checkbox" id="3C" name="place11" value="indispo" />
          <label for="3C">3C</label>
             </c:if>
          <c:if test ="${voiture.place11 == 'indispo'}"><input type="checkbox"  disabled id="3C" />
          <label for="3C">3C</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place12 == 'dispo'}">
          <input type="checkbox" id="3D" name="place12" value="indispo" />
          <label for="3D">3D</label>
             </c:if>
          <c:if test ="${voiture.place12 == 'indispo'}"><input type="checkbox"  disabled id="3D" />
          <label for="3D">3D</label></c:if>
         
        </li>
        
      </ol>
    </li>
    <li class="row row--4">
      <ol class="seats" type="A">
        <li class="seat">
             <c:if test="${voiture.place13 == 'dispo'}">
          <input type="checkbox" id="4A" name="place13" value="indispo" />
          <label for="4A">4A</label>
             </c:if>
          <c:if test ="${voiture.place13 == 'indispo'}"><input type="checkbox"  disabled id="4A" />
          <label for="4A">4A</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place14 == 'dispo'}">
          <input type="checkbox" id="4B" name="place14" value="indispo" />
          <label for="4B">4B</label>
             </c:if>
          <c:if test ="${voiture.place14 == 'indispo'}"><input type="checkbox"  disabled id="4B" />
          <label for="4B">4B</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place15 == 'dispo'}">
          <input type="checkbox" id="4C" name="place15" value="indispo" />
          <label for="4C">4C</label>
             </c:if>
          <c:if test ="${voiture.place15 == 'indispo'}"><input type="checkbox"  disabled id="4C" />
          <label for="4C">4C</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place16 == 'dispo'}">
          <input type="checkbox" id="4D" name="place16" value="indispo" />
          <label for="4D">4D</label>
             </c:if>
          <c:if test ="${voiture.place16 == 'indispo'}"><input type="checkbox"  disabled id="4D" />
          <label for="4D">4D</label></c:if>
         
        </li>
        
      </ol>
    </li>
    <li class="row row--5">
      <ol class="seats" type="A">
        <li class="seat">
             <c:if test="${voiture.place17 == 'dispo'}">
          <input type="checkbox" id="5A" name="place17" value="indispo"  />
          <label for="5A">5A</label>
             </c:if>
          <c:if test ="${voiture.place17 == 'indispo'}"><input type="checkbox"  disabled id="5A" />
          <label for="5A">5A</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place18 == 'dispo'}">
          <input type="checkbox" id="5B" name="place18" value="indispo" />
          <label for="5B">5B</label>
             </c:if>
          <c:if test ="${voiture.place18 == 'indispo'}"><input type="checkbox"  disabled id="5B" />
          <label for="5B">5B</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place19 == 'dispo'}">
          <input type="checkbox" id="5C" name="place19" value="indispo" />
          <label for="5C">5C</label>
             </c:if>
          <c:if test ="${voiture.place19 == 'indispo'}"><input type="checkbox"  disabled id="5C" />
          <label for="5C">5C</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place20 == 'dispo'}">
          <input type="checkbox" id="5D" name="place20" value="indispo" />
          <label for="5D">5D</label>
             </c:if>
          <c:if test ="${voiture.place20 == 'indispo'}"><input type="checkbox"  disabled id="5D" />
          <label for="5D">5D</label></c:if>
         
        </li>
        
      </ol>
    </li>
    <li class="row row--6">
      <ol class="seats" type="A">
        <li class="seat">
             <c:if test="${voiture.place21 == 'dispo'}">
          <input type="checkbox" id="6A" name="place21" value="indispo"  />
          <label for="6A">6A</label>
             </c:if>
          <c:if test ="${voiture.place21 == 'indispo'}"><input type="checkbox"  disabled id="6A" />
          <label for="6A">6A</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place22 == 'dispo'}">
          <input type="checkbox" id="6B" name="place22" value="indispo" />
          <label for="6B">6B</label>
             </c:if>
          <c:if test ="${voiture.place22 == 'indispo'}"><input type="checkbox"  disabled id="6B" />
          <label for="6B">6B</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place23 == 'dispo'}">
          <input type="checkbox" id="6C" name="place23" value="indispo" />
          <label for="6C">6C</label>
             </c:if>
          <c:if test ="${voiture.place23 == 'indispo'}"><input type="checkbox"  disabled id="6C" />
          <label for="6C">6C</label></c:if>
         
        </li>
        <li class="seat">
             <c:if test="${voiture.place24 == 'dispo'}">
          <input type="checkbox" id="6D" name="place24" value="indispo" />
          <label for="6D">6D</label>
             </c:if>
          <c:if test ="${voiture.place24 == 'indispo'}"><input type="checkbox"  disabled id="6C" />
          <label for="6C">6C</label></c:if>
         
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
            
            <input type="hidden" id="numvoyage" name="numtrain" value="${numtrain}" class="form-control"  />  
            <input type="hidden" id="numvoyage" name="numvoiture" value="${voitura}" class="form-control"  />
	    <input type="hidden" id="numvoyage" name="codevoiture" value="${numvoiture}" class="form-control"  />
            
	    <input type="hidden" id="numvoyage" name="CIN" value="${CIN}" class="form-control"  />
                <button type="submit">Valider</button>
        </form>
</div>

    </body>
</html>
