<%@ page import="java.util.List" %>
<%@ page import="projet.*" %>

<%!
    List<Etudiant> l_et;
    public void jspInit() {
        l_et = GestionFactory.getEtudiants();
    }
%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Lise d'étudiants</title>
  </head>
  <body>
  <h1>Liste des étudiants</h1>
  <%
    for(Etudiant e : l_et) {
  %>
  <div> <a href="details.jsp?id=<%=e.getId()%>"> <%= e.getNom()%> <%= e.getPrenom()%> </a> </div>
  <%
      }
  %>
  </body>
</html>
