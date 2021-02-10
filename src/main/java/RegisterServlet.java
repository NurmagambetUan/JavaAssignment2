import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("main.html").include(request, response);

        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String password2 =request.getParameter("password2");

        if(password.equals(password2)){
            out.print("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n" +
                    "    <a class=\"navbar-brand\" href=\"#\">LAB 2</a>\n" +
                    "    <ul class=\"navbar-nav\">\n" +
                    "        <li class=\"nav-item\">\n" +
                    "            <a class=\"nav-link\" href=\"login.html\">Login</a>\n" +
                    "        </li>\n" +
                    "        <li class=\"nav-item\">\n" +
                    "            <a class=\"nav-link\" href=\"LogoutServlet\">Logout</a>\n" +
                    "        </li>\n" +
                    "        <li class=\"nav-item\">\n" +
                    "            <a class=\"nav-link\" href=\"register.html\">Registration</a>\n" +
                    "        </li>\n" +
                    "    </ul>\n" +
                    "</nav>");
            out.print("Welcome, "+name+ "! Registration successful!");
            HttpSession session=request.getSession();
            session.setAttribute("name",name);
        }
        else{
            out.print("Error confirmation!");
            request.getRequestDispatcher("register.html").include(request, response);
        }
        out.close();
    }
}  
