import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet{
    String username,email,password,passwordConf;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        username = request.getParameter("username");
        email = request.getParameter("email");
        password = request.getParameter("password");
        passwordConf = request.getParameter("passwordConf");

        out.println(username);
        out.println(email);
        out.println(password);
        out.println(passwordConf);
    }
}
