package com.am.user;

import java.util.Scanner;

import com.am.database.Database;
import com.am.service.CustomerService;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char b;
		do {
			System.out.println("press 1 to view all customer by name with keyid");
			System.out.println("press 2 to select a customer using keyid to view all the complaints launched by customer");
			System.out.println("press 3 select a complaint to view its status");
			System.out.println("press 4 to launch a new complaint");
			
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
			{
			System.out.println("searching customer name by customer id.....!!!!");
			CustomerService cs=new CustomerService();
			cs.showNames();
			}
			break;
			
			case 2:
			{ 
				System.out.println("view all complaints launched by customer");
				Database db=new Database();
				db.showComplaint();
				
			break;
			}
			case 3:
			{
				System.out.println("select complaint to view its status");
				Database db1=new Database();
				db1.showStatusofComplaint();
			}
			break;
			case 4:
			{
				System.out.println("Welcome.....!!!! to new user ....please register your complaint to get service ");
				System.out.println("enter id");
				int i_d=sc.nextInt();
				System.out.println("enter customer name");
				String name=sc.next();
				System.out.println("enter complaint id");
				int c_id=sc.nextInt();
				System.out.println("enter title");
				String title=sc.next();
				System.out.println("enter description");
				sc.nextLine();
				String description=sc.next();
				System.out.println("your complaint got Registered.....!!!!");
			}
			break;
			default:
				System.out.println("choice is invalid");
			break;
			}
			System.out.println("press a/A for main menu");
			b=sc.next().charAt(0);	
		} while (b=='a'||b=='A');
	}


	}


