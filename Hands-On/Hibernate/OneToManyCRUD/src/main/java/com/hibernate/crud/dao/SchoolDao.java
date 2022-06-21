package com.hibernate.crud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.crud.entity.School;
import com.hibernate.crud.util.HibernateUtil;

public class SchoolDao {
	
	 public void saveInstructor(School school) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.save(school);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    /**
	     * Update Instructor
	     * @param instructor
	     */
	    public void updateSchool(School school) {
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // save the student object
	            session.update(school);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    /**
	     * Delete Instructor
	     * @param id
	     */
	    public void deleteSchool(int id) {

	 

	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	 

	            // Delete a instructor object
	            School school = session.get(School.class, id);
	            if (school != null) {
	                session.delete(school);
	                System.out.println("School is deleted");
	            }

	 

	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }

	 

	    /**
	     * Get Instructor By ID
	     * @param id
	     * @return
	     */
	    public School getSchoolr(int id) {

	 

	        Transaction transaction = null;
	        School school = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            school = session.get(School.class, id);
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return school;
	    }
	    
	    /**
	     * Get all Instructors
	     * @return
	     */
	    @SuppressWarnings("unchecked")
	    public List<School> getAllInstructor() {

	 

	        Transaction transaction = null;
	        List<School> listOfSchool = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();
	            // get an instructor object
	            
	            listOfSchool = session.createQuery("from School").getResultList();
	            
	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	        return listOfSchool;
	    }

}