package net.mike.jpacsv.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import net.mike.jpacsv.entyties.Item;

public class ServiceTablePartsCrossReference_NOT_OE_27 {
	
	EntityManager em = Persistence.createEntityManagerFactory("PersistenceUnit").createEntityManager();
	
	public List<Item> getAll() {
		Query query = em.createNativeQuery("SELECT c FROM TablePartsCrossReference_NOT_OE_27 c");
		//query.setParameter(1, "%ID%");
		return query.getResultList();
	}
}
