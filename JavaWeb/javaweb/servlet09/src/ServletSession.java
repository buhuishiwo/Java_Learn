import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session")
public class ServletSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //从web服务器中获取session对象，如果session对象没有则创建
        HttpSession session = req.getSession();
        //向session中绑定数据
        session.setAttribute("username", req.getParameter("username"));
        //从会话域中获取数据
        Object obj = session.getAttribute("username");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println(session);
    }
}
