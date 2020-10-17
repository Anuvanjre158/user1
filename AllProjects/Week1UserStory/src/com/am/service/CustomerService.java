package com.am.service;

import java.util.Scanner;

import com.am.Complaint;
import com.am.Customer;
import com.am.database.Database;

public class CustomerService {
int c_id;
int p_id;
Complaint complaints;
Customer[] customerDB;
Database database;
public void showNames() {
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter the customer id:  ");
			c_id=sc.nextInt();
			switch(c_id)
			{
			case 1:
				System.out.println(" The customer name is: name1");
				break;
			case 2:
				System.out.println(" The customer name is: name2");
				break;
			case 3:
				System.out.println(" The customer name is: name3");
			
			break;
			default :
				System.out.println("no name is found on this id....!!!");
				break;
}
}
}