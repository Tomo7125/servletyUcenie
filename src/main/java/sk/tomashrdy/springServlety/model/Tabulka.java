package sk.tomashrdy.springServlety.model;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.tomashrdy.springServlety.Entita.Osoba;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class Tabulka extends HttpServlet {

    Osoba osoba;

    @RequestMapping("/table")
    public String getOsoba(Model model) {
        model.addAttribute("table", osoba);
        return "table";
    }
}
