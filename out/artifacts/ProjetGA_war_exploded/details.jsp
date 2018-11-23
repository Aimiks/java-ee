<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="projet.*" %>


<%  %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <div> Absences : <%= GestionFactory.getAbsences(GestionFactory.getEtudiantFromId(Integer.parseInt(request.getParameter("id"))))%></div>
</body>
</html>
