package yzx.controlle;

import yzx.entity.Fuck;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FuckServlet", value = "/FuckServlet")
public class FuckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Fuck fuck = new Fuck("wow","ass");
        HttpSession session =  request.getSession();
        session.setAttribute("fuck",fuck);
        response.sendRedirect("/t.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
