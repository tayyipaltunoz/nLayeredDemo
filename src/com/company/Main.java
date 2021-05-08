package com.company;

import com.company.business.abstracts.ProductService;
import com.company.business.concretes.ProductManager;
import com.company.core.jLoggerManagerAdapter;
import com.company.dataAccess.concretes.AbcProductDao;
import com.company.dataAccess.concretes.HibernateProductDao;
import com.company.entities.concretes.Product;
import com.company.jLogger.jLoggerManager;


public class Main {

    public static void main(String[] args) {

        Product product1 = new Product(1,1,"lenova pc",3400.99,3);


        //Todo : Spring Ioc ile çözülecek
        ProductService productService = new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());
        productService.add(product1);



    }
}
