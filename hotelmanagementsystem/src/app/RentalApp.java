package app;

import java.util.Scanner;

import service.Rentalservice;
import serviceimpln.Rentalserviceimpln;

public class RentalApp {
	public static void main(String[] args) {
		System.out.println("============welcome to room rental application============");
		Scanner ip=new Scanner(System.in);
		Rentalservice r1=new Rentalserviceimpln();
		while(true) {
			System.out.println("============menu=============");
			System.out.println("1.info\n2.rooms available\n3.checkin\n4.customer details\n5.checkout\n6.exit");
			System.out.println("enter the option");
			int op=ip.nextInt();
			switch(op) {
			case 1:r1.info();break;
			case 2:r1.roomsavailable();break;
			case 3:r1.checkin();break;
			case 4:r1.customerdetails();break;
			case 5:r1.checkout();break;
			case 6:System.out.println("================thank you visit again=============");
					System.exit(0);break;
			default:System.out.println("invalid option");		
			
			
			}
		}
	}

}
