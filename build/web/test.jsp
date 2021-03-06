<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>
    <body>
        <form method="post" action="connecter">
            <fieldset>
                <legend>Connexion</legend>
                <p>Vous pouvez vous connecter via ce formulaire.</p>

                <label for="nom">Login<span class="requis">*</span></label>
                <input type="login" id="login" name="login" value="<c:out value="${client.login}"/>" size="20" maxlength="60" />
                <span class="erreur">${form.erreurs['login']}</span>
                

                <label for="password">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="password" name="password" value="" size="20" maxlength="20" />
                <span class="erreur">${form.erreurs['password']}</span>


                <input type="submit" value="connecter" class="sansLabel" />
                
                
                <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
                
                <%-- Vérification de la présence d'un objet utilisateur en session --%>
                <c:if test="${!empty sessionScope.sessionUtilisateur}">
                    <%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
                    <p class="succes">Vous êtes connecté(e) avec le login : ${sessionScope.sessionUtilisateur.login}</p>
                </c:if>
            </fieldset>
        </form>
    </body>
</html>