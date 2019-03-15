package dao;

import bean.Product;

import java.util.ArrayList;
import java.util.List;

public class productDao {
    public static List<Product> getProducts(){
        List<Product> products=new ArrayList<>();
         products.add(new Product("12","computer","tech",500));
         products.add(new Product("13","desc","ferniture",200));
         products.add(new Product("15","trouser","closing",50));
         products.add(new Product("16","chair","furniture",70));
        return products;
    }
}
