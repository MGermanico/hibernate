/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hibernateow;

import org.hibernate.Session;
import org.junit.jupiter.api.Test;

/**
 *
 * @author tarde
 */
public class HibernateTest {
    @Test
    public void test1(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        
    }
}
