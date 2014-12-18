package servlet;

import dbobject.PrivateMessage;
import dbobject.PublicMessage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;

/**
 * Created by whd on 2014/12/4.
 */
public class MessageServlet extends BaseServlet {
    public MessageServlet() {
        super("/pages/front_end/messages.jsp");
    }

    public void sendPublicMessageAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String userName = request.getSession().getAttribute("username").toString();
        String userId = request.getSession().getAttribute("userid").toString();

        if (null == userName || null == userId) {
            response.getWriter().write("please log in");
            return;
        }

        PublicMessage message = new PublicMessage();
        message.setContent(request.getParameter("content").toString());
        message.setFromUserId(Integer.parseInt(userId));
        message.setPublishDate(new Date(System.currentTimeMillis()));
        message.setPublishTime(new Time(System.currentTimeMillis()));
        message.setTeamId(Integer.parseInt(request.getParameter("teamid").toString()));
        try {
            message.insert();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sendPrivateMessageAction(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String userName = request.getSession().getAttribute("username").toString();
        String userId = request.getSession().getAttribute("userid").toString();

        if (null == userName || null == userId) {
            response.getWriter().write("please log in");
            return;
        }

        PrivateMessage message = new PrivateMessage();
        message.setContent(request.getParameter("content").toString());
        message.setFromUserId(Integer.parseInt(userId));
        message.setPublishDate(new Date(System.currentTimeMillis()));
        message.setPublishTime(new Time(System.currentTimeMillis()));
        message.setTeamId(Integer.parseInt(request.getParameter("teamid").toString()));
        message.setToUserId(Integer.parseInt(request.getParameter("touserid").toString()));
        try {
            message.insert();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}