@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        if (username != null && "admin".equals(username)) {
            request.getSession().setAttribute("user", username);
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
