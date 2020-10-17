package com.am.database;

import java.util.Scanner;

import com.am.Complaint;
import com.am.Customer;
import com.am.Person;

public class Database {
Customer [] customerDB;

public Database() {
	super();
	// TODO Auto-generated constructor stub
	customerDB=new Customer[3];
	
    Complaint [] c1= {new Complaint(1,"t1","d1",0,1),new Complaint(2,"t2","d2",0,1),new Complaint(3,"t3","d3",0,1)};
	
	Complaint [] c2= {new Complaint(14,"t14","d14",0,2),new Complaint(24,"t24","d24",0,2)};
   
    Complaint [] c3= {new Complaint(15,"t15","d15",0,3)};
   
    customerDB=new Customer[3];
	customerDB[0]=new Person(1,"name1",c1);
	customerDB[1]=new Person(2,"name2",c2);
	customerDB[2]=new Person(3,"name3",c3);	
	
	
}

public void showComplaint() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter customer id");
	int c=sc.nextInt();
	System.out.println(" complaints are ....");
	switch(c) {
	case 1:
		System.out.println(customerDB[0]);
		break;
	case 2:
		System.out.println(customerDB[1]);
		break;
	case 3:
		System.out.println(customerDB[2]);
		break;
		default:
			System.out.println("No complaints are found...!!!for the id which you given...please check once...!!");
	        break;
	}

} 
public void showStatusofComplaint() {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(" to view status");
	for(int i = 0;i <3; i++) {
		if(n==1) {
			System.out.println("complaint is processiong");
		}
		else
			{
				System.out.println("complaint is register successfully");
			}
		}
		
	}	
	
}
 
