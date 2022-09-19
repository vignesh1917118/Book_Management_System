package com.gj.dao;

import java.util.Iterator;
import java.util.Scanner;
import com.gj.db.Database;
import com.gj.model.Book;


public class BookDAO extends Database{
	Scanner sc = new Scanner(System.in);

	//Display All Book
	public void DisplayBookDetails() {
		System.out.println(data);
	}
	
	public void searchByName(String name) {
		Iterator<Book> itr = data.iterator();
		int cntr=0;
        while(itr.hasNext()) {
        	Book bname=itr.next();
            if(((bname).getName()).equals(name)) 
            {
            	cntr++;
            	System.out.println(bname); 
            }       
        } 
        if(cntr==0){
        	System.out.println("You Entered Invalid Book Name");
        }
	}
	
	public void insert(Book o) {
		boolean a = data.add(o);
		if(a==true) {
		System.out.println("Your Record Updated succeesfully......");
		}
		else {
			System.out.println("Something Went wrong");
		}
	}

	public void deleteById(int id) {
		int cntr=0;
		Iterator<Book> itr = data.iterator();
        while(itr.hasNext()) {
        	
        	Book bid=itr.next();
            if(((bid).getBookId())==id) {
            	itr.remove();
            	cntr++;
            	System.out.println("Your Record Deleted......");
            }    

        } 
        if(cntr==0){
        	System.out.println("You Entered Invalid Book Id");
        }	
	}
	
	public void updatePriceById(int id) {
		
		int cntr=0;
		Iterator<Book> itr = data.iterator();
        while(itr.hasNext()) {
        	Book bid=itr.next();
            if(((bid).getBookId())==id) {
            	System.out.println(bid); 
        		System.out.println("Enter the Updated Price");
        		Double updatedPrice = sc.nextDouble();
        		bid.setPrice(updatedPrice);
				data.add(bid);
				System.out.println("Price Updated.......");
            	cntr++;
            }    
        }
        if(cntr==0){
        	System.out.println("Enter Valid Book ID.......");
        }
	}
}
