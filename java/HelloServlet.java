import java.io.*;
import jakarta.servlet.*;

public class HelloServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<b>Alhamdulillah!");
        pw.close();
    }
}
