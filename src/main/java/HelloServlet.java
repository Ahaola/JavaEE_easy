import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")//把当前的这个 HelloServlet 这个类,和 HTTP 请求中 URL 里面路径带有 /hello 这样的请求,给关联起来
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello servlet");//这个是让服务器在自己的控制台打印
        //如何在页面打印？
        //1、resp是响应对象，getWriter其实是返回了一个Writer对象(字符流对象)，writer是写数据的方法
        //2、如果不给响应对象中设置任何内容，这个时候就会出现空白页面
        resp.getWriter().write("hello servlet"+System.currentTimeMillis());

//        String s = null;
//        System.out.println("hello world"+s.length());
    }
}
