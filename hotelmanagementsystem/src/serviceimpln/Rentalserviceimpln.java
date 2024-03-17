package serviceimpln;

import java.util.LinkedHashMap;
import java.util.Scanner;

import entity.Address;
import entity.Customer;
import service.Rentalservice;

public class Rentalserviceimpln implements Rentalservice
{
	Scanner ip=new Scanner(System.in);
	{
		for(int i=101;i<=108;i++) {
			nac.put(i, null);
		}
		for(int i=201;i<=205;i++) {
			ac.put(i, null);
		}
		for(int i=301;i<=303;i++) {
			deluxe.put(i, null);
		}
	}

	@Override
	public void info() 
	{
		System.out.println("===============nonac===============");
		System.out.println("fan");
		System.out.println("wifi");
		System.out.println("tv");
		System.out.println("2 members");
		System.out.println("price:2000");
		System.out.println("===============ac===============");
		System.out.println("ac");
		System.out.println("wifi");
		System.out.println("tv");
		System.out.println("2 members");
		System.out.println("price:2500");
		System.out.println("===============nonac===============");
		System.out.println("ac");
		System.out.println("wifi");
		System.out.println("fridge");
		System.out.println("2 members");
		System.out.println("price:3000");
	}
	void checkrooms(LinkedHashMap<Integer,Customer> m,String type) 
	{
		System.out.println("=================="+type+"rooms:=================");
		int c=0;
		for(Integer roomno:m.keySet()) {
			if(m.get(roomno)==null) {
				System.out.print(roomno+" ");
				c++;
			}
		}
		System.out.println();
		if(c==0) {
			System.out.println("no rooms are available...!!!");
		}
		
		
	}

	@Override
	public void roomsavailable() {
		checkrooms(nac,"non ac");
		checkrooms(ac,"ac");
		checkrooms(deluxe,"deluxe");
		
		
	}
	void allocate(LinkedHashMap<Integer,Customer> m,String roomtype,double roomprice) 
	{
		System.out.println("enter the roomno:-");
		int roomno=ip.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)==null) {
			System.out.println("enter customer id:-");
			int cid=ip.nextInt();
			System.out.println("enter customer name:-");
			String cname=ip.next();
			System.out.println("enter customer phno:-");
			long phno=ip.nextLong();
			System.out.println("enter customer house no:-");
			String houseno=ip.next();
			System.out.println("enter street name:-");
			String streetname=ip.next();
			System.out.println("enter the pincode:-");
			int pincode=ip.nextInt();
			Customer c1=new Customer(cid,cname,phno,new Address(houseno,streetname,pincode),roomtype,roomprice,roomno);
			m.put(roomno, c1);
			l1.add(c1);
			System.out.println(c1.getCname()+"had been allocated for"+roomtype+"roomno"+roomno);
			System.out.println(c1.getCname()+"need to pay rs."+roomprice);
			}
		else 
		{
			System.out.println("invalid roomno:-----------------");
		}
	}

	@Override
	public void checkin() {
		System.out.println("==================checkin====================");
		System.out.println("1.nonac\n2.ac\n3.deluxe");
		System.out.println("enter the option:-");
		int op=ip.nextInt();
		switch(op) {
		case 1:allocate(nac,"non ac",2000);break;
		case 2:allocate(ac,"ac",2500);break;
		case 3:allocate(deluxe,"deluxe",3000);break;
		default:System.out.println("invalid option:-");
		}
		
	}
	void deallocate(LinkedHashMap<Integer,Customer> m) {
		System.out.println("enter the roomno:-");
		int roomno=ip.nextInt();
		if(m.containsKey(roomno)&&m.get(roomno)!=null) {
			Customer c1=m.get(roomno);
			System.out.println(c1.getCname()+"thanks for visiting our hotel");
			m.put(roomno, c1);
		}
		else {
			System.out.println("invalid roomno:-");
		}
	}

	@Override
	public void checkout() 
	{
		System.out.println("==================checkout====================");
		System.out.println("1.nonac\n2.ac\n3.deluxe");
		System.out.println("enter the option:-");
		int op=ip.nextInt();
		switch(op) {
		case 1:deallocate(nac);break;
		case 2:deallocate(ac);break;
		case 3:deallocate(deluxe);break;
		default:System.out.println("invalid option...!!!");
		}
		
		
	}

	@Override
	public void customerdetails() {
		int c=0;
		for(Customer ele:l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("no data found....!!!");
		}
		
	}
	

}
