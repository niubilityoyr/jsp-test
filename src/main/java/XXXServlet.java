import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Create by 欧阳荣
 * 2018/4/12 8:46
 */
public class XXXServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie[] cookies = req.getCookies();
//        resp.addCookie(new Cookie());
    }
    public static void main(String[] args) {
        String aStr = "?One?";
        String bStr = aStr;
        aStr.toUpperCase();
        System.out.println(bStr);
        System.out.println(bStr);
    }
}
