package sk.tomashrdy.springServlety.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class SimpleServlet extends HttpServlet {

    @Override
    @RequestMapping("/simpleservlet")
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String meno = req.getParameter("meno");
        String priezvisko = req.getParameter("priezvisko");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html><html><body><br>");
        out.printf("meno: %s", meno);
        out.println("<br>");
        out.printf("priezvisko: %s",priezvisko);
        out.println("</body></html>");


    }
}
