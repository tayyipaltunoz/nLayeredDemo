package com.company.business.concretes;

import com.company.business.abstracts.ProductService;
import com.company.dataAccess.abstracts.ProductDao;
import com.company.dataAccess.concretes.HibernateProductDao;
import com.company.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId()==2){
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
