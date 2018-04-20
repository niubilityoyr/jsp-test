import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Create by 欧阳荣
 * 2018/4/12 11:47
 */
public class MyHttpSessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        if(servletContext.getAttribute("sessionNum")==null){
            servletContext.setAttribute("sessionNum", 1);
        }else{
            Integer i = (Integer)servletContext.getAttribute("sessionNum");
            servletContext.setAttribute("sessionNum", ++i);
        }
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        Integer i = (Integer)servletContext.getAttribute("sessionNum");
        servletContext.setAttribute("sessionNum", --i);
    }

}
