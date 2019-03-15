package servlet;

import bean.Product;
import dao.productDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getProducts")
 public class GetProduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Product> products= productDao.getProducts();
        System.out.println(products);

        request.setAttribute("products",products);
        RequestDispatcher rd=request.getRequestDispatcher("showProduct.jsp");
        rd.forward(request,response);


    }
}
