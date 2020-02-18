package net.mike.jpacsv;

import net.mike.jpacsv.service.ServiceTablePartsCrossReference_NOT_OE_1;

public class Main {
	
	public static void main(String[] args) {

		System.out.println("Start");
		
		ServiceTablePartsCrossReference_NOT_OE_1 service = new ServiceTablePartsCrossReference_NOT_OE_1();
		System.out.println("Entity Manager greated.");
		System.out.println(service.getAll().size());
		System.out.println(service.find("8EA73769900"));
		
	}
}