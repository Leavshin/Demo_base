<%--
  Created by IntelliJ IDEA.
  User: ceris
  Date: 11/07/2024
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="personne" scope="request" type="java.util.ArrayList<org.example.demo_base.Personne>" />
<%@include file="/WEB-INF/bootstrap.html"%>
<div class="container mt-5">
    <h1>${title}</h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Age</th>
        </tr>
        </thead>
        <tbody>
        <% for (int i = 0;i < personne.size();i++) { %>
        <tr>
            <td><%= i+1 %></td>
            <td><%= personne.get(i).getNom() %></td>
            <td><%= personne.get(i).getPrenom() %></td>
            <td><%= personne.get(i).getAge() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
</body>
</html>

