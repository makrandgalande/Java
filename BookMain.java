package com.ClassObject;

public class BookMain {
	public static void main(String[] args) {
		
		Book bk=new Book();
		System.out.println("Book Name: "+(bk.Title="Love Story"));
		System.out.println("Book Author: "+(bk.Author="Makrand"));
		System.out.println("Book Price: "+(bk.price=404));

	}

}
