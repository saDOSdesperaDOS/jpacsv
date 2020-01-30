package net.mike.jpacsv;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

import javax.persistence.EntityManager;

import org.apache.openjpa.conf.OpenJPAConfiguration;
import org.apache.openjpa.jdbc.conf.JDBCConfiguration;
import org.apache.openjpa.persistence.EntityManagerFactoryImpl;

import net.mike.jpacsv.service.ServiceTablePartsCrossReference_NOT_OE_27;

public class Main {

	public static void main(String[] args) {

		System.out.println("Start");
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while(drivers.hasMoreElements()) System.out.println(drivers.nextElement());
		
		ServiceTablePartsCrossReference_NOT_OE_27 request = new ServiceTablePartsCrossReference_NOT_OE_27();
		//System.out.println(request.getAll());
		System.out.println("Create new ServiceTablePartsCrossReference_NOT_OE_27() = " + request.getClass().getCanonicalName());
		System.out.println(request.getAll().get(78));
		//System.getProperty("user.dir");
		//System.out.println(System.getProperty("user.dir"));
		//System.out.println(System.getProperty("java.class.path"));
	}

}
