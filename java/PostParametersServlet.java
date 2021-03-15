import java.io.*;
import java.util.*;
import jakarta.servlet.*;

public class PostParametersServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Get print writer
        PrintWriter pw = response.getWriter();
        
        // Get enumeration of parameter names
        Enumeration<String> e = request.getParameterNames();
        
        // Display parameter names and values
        while (e.hasMoreElements()) {
            String pname = e.nextElement();
            pw.print(pname + " = ");
            String pvalue = request.getParameter(pname);
            pw.println(pvalue);
        }

        pw.close();
    }
}
