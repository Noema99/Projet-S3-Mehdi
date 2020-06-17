<%-- 
    Document   : recu
    Created on : Feb 6, 2020, 4:14:01 AM
    Author     : BENADADA Noema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
             String place =(String) request.getAttribute("place");
               pageContext.setAttribute("place", new String(place));
              


            
           %>
          <c:out value="${Recu.numPlace}"/> 
           <c:out value="${place}"/>
           
    </body>
</html>
