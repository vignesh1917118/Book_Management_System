package com.gj.db;

import java.util.TreeSet;
import com.gj.model.Book;

public class Database {
	
	public static  TreeSet<Book> data;
	static{
		data=new TreeSet<>();
	    
	     data.add(new Book (1,"Game of Throne","Sumit",233.00));
	     data.add(new Book (2,"abc","gaja",278.00));
	     data.add(new Book (3,"Algebra","nithis",567.00));
	     data.add(new Book (4,"algorithms","abhyuday",876.00));
	     data.add(new Book (5,"Java","Chinmay",987.00));
	     data.add(new Book (6,"C program","vignesh",436.00));
	     //System.out.println(db);
	}


}
