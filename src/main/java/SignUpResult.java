import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpResult extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/views/result.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String pass = req.getParameter("password1");


        if (UserService.checkEmailPassw(email, pass)) {

            User user = new User(email, pass);
            UserRepository.add(user);
            resp.sendRedirect(getServletContext().getContextPath() + "/result");
        }

//        else {
//            req.setAttribute("emailValue", req.getParameter("email"));
//
//            if (!UserService.checkEmail(email)) {
//                req.setAttribute("email_error", "Введите email правильно!");
//                req.getRequestDispatcher("/WEB-INF/views/first_form.jsp").forward(req, resp);
//            }
//
//            if (!UserService.checkPassword(pass)) {
//                req.setAttribute("pass_error", "Длина пароля должна быть не менее 8 символов");
//                req.getRequestDispatcher("/WEB-INF/views/first_form.jsp").forward(req, resp);
//            }
//        }
    }
}