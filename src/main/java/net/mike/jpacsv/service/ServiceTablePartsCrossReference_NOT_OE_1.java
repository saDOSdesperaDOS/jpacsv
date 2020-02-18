package net.mike.jpacsv.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import net.mike.jpacsv.entyties.Item;
import net.mike.jpacsv.entyties.TablePartsCrossReference_NOT_OE_1;

public class ServiceTablePartsCrossReference_NOT_OE_1 {
	
	EntityManager em = Persistence.createEntityManagerFactory("PersistenceUnit").createEntityManager();
	
	public List getAll() {
		List result = new ArrayList();
		try {
			Query query = em.createNativeQuery("SELECT * FROM CSVREAD('d:\\temp\\schemas\\schema-crosses\\TablePartsCrossReference_NOT_OE_1.csv')");
			//query.setParameter(1, "%ID%");
			result =  query.getResultList();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	public TablePartsCrossReference_NOT_OE_1 find(String CODE_PARTS) {
		em.getTransaction().begin();
		Query query = em.createNativeQuery("SELECT e FROM CSVREAD('d:\\temp\\schemas\\schema-crosses\\TablePartsCrossReference_NOT_OE_1.csv') WHERE e.code_parts=:CODE_PARTS");
		query.setParameter(6, CODE_PARTS);
		TablePartsCrossReference_NOT_OE_1 tablePartsCrossReference_NOT_OE_1 = (TablePartsCrossReference_NOT_OE_1) query.getSingleResult();
		em.getTransaction().commit();
		return tablePartsCrossReference_NOT_OE_1;
	}
}
