package org.example.demo_base;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "servlet6",value = "/servlet6")
public class Servlet6 extends HttpServlet {
    private List<Personne> personneList;

    @Override
    public void init() throws ServletException {
        personneList = new ArrayList<>();
        personneList.add(new Personne("Gontier", "Léa", 25));
        personneList.add(new Personne("Gontier", "Julien", 23));
        personneList.add(new Personne("Gontier", "Victor", 14));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personne",personneList);
        req.getRequestDispatcher("/personnes.jsp").forward(req,resp);
    }

}
