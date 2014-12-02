package servlet;

import com.google.gson.Gson;
import db.Database;
import dbobject.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by whd on 2014/11/30.
 */

//TODO T^T
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setUserName(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));

        Connection connection = null;
        try {
            connection = Database.getConnection();
            PreparedStatement statement = connection.prepareStatement
                    ("select (UserName, Password) from Users where UserName = ? ");
            statement.setString(1, user.getUserName());
            ResultSet resultSet = statement.executeQuery();

            HttpSession session = request.getSession(true);
            response.setContentType("text/html;charset=utf-8");
            if (null != session.getAttribute("UserName")) {
                response.getWriter().write("already logged in");
            } else if (resultSet.next() ||
                    !resultSet.getString("password").equals(user.getPassword())) {
                response.getWriter().write("log in failed");
            } else {
                session.setAttribute("UserName", user.getUserName());
                response.getWriter().write("log in succeeded");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(404);
    }
}
