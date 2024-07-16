package com.texas.dao;

import com.texas.model.Product;
import com.texas.utils.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDAO {
    private SessionFactory sessionFactory;

    public ProductDAO() {
        this.sessionFactory = MySessionFactory.getSessionFactory();
    }

    public void saveProduct(Product product){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        session.persist(product);

        transaction.commit();
        session.close();
    }

    public List<Product> getAllProducts(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        List productList = session.createQuery("from Product").list();
        transaction.commit();
        session.close();
        return productList;
    }

    public Product getById(Integer id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Product product = session.find(Product.class, id);
        transaction.commit();
        session.close();
        return product;
    }
}
