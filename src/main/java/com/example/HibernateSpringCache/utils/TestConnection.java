package com.example.HibernateSpringCache.utils;//package org.example.utils;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//public class TestConnection {
//
//    Session session = null;
//    Transaction transaction = null;
//
//        try {
//        // Obtiene la sesión
//        session = HibernateUtil.getSessionFactory().openSession();
//
//        // Comienza una transacción (opcional para esta prueba)
//        transaction = session.beginTransaction();
//
//        // Prueba simple - puedes hacer un query básico
//        Object result = session.createNativeQuery("SELECT 1").getSingleResult();
//        System.out.println("Conexión exitosa. Resultado de prueba: " + result);
//
//        // Si tienes la entidad Employee mapeada, puedes probar con:
//        // List<Employee> employees = session.createQuery("from Employee", Employee.class).list();
//        // System.out.println("Número de empleados: " + employees.size());
//
//        transaction.commit();
//    } catch (Exception e) {
//        if (transaction != null) transaction.rollback();
//        System.err.println("Error al conectar con la base de datos:");
//        e.printStackTrace();
//    } finally {
//        if (session != null) session.close();
//        HibernateUtil.shutdown();
//    }
//}
