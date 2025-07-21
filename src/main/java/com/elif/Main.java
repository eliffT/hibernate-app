package com.elif;

import com.elif.dao.ProductDaoImpl;
import com.elif.dao.UserDaoImpl;
import com.elif.model.User;
import com.elif.service.ProductService;
import com.elif.service.UserService;

import javax.swing.plaf.ColorUIResource;

public class Main {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        UserService uService = new UserService(userDao);
       // uService.createUser("Elif", "elif@gmail.com", 25);
       // uService.createUser("Ayşe", "ayse@gmail.com", 27);
       // uService.deleteUser(2);
       // uService.updateUser(1, "Yeni", "yeni@fkg.com", 28);
        ProductDaoImpl productDao = new ProductDaoImpl();
        ProductService pService = new ProductService(productDao);
      //  pService.saveProduct("Mobile Phone", "Smartphones" , 20000.0);
       // pService.saveProduct("Kettle", "Kitchen" , 1500.0);
        pService.deleteProduct(2);
    }
}
