package com.group4.swp.project.controller.dao;

import com.group4.swp.project.entity.Account;
import com.group4.swp.project.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class AccountDAO {
    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public void save(Account account){
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) { 
            transaction = session.beginTransaction();
            
            session.persist(account);
            
            transaction.commit(); 
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback(); 
            }
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public Account findByUsername(String username){
        Account account = null;
        try (Session session = sessionFactory.openSession()) { 
            account = session.get(Account.class, username);           
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return account;
    }
    
    public Account findByEmail(String email){
        Account account = null;
        try (Session session = sessionFactory.openSession()) { 
            Query<Account> query = session.createQuery("from Account a where a.email = :email", Account.class);
            query.setParameter("email", email);
            account = query.getSingleResultOrNull();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return account;
    }
    
    public void deleteByUsername(String username){
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) { 
            transaction = session.beginTransaction();
            
            Account account = session.get(Account.class, username);
            if(account != null){
                session.remove(account);
            }
            
            transaction.commit(); 
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback(); 
            }
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    
    
}
