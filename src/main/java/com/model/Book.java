package com.model;

public class Book {
	private int id;
	private  String title;
	private String author;
	private int year;
	private Double cost;
	
	
	
	public Book(String title, String author, int year, Double cost) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.cost = cost;
	}



	public Book(int id, String title, String author, int year, Double cost) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		this.cost = cost;
	}



	public int getId() {
		return id;
	}



	public String getTitle() {
		return title;
	}



	public String getAuthor() {
		return author;
	}



	public int getYear() {
		return year;
	}



	public Double getCost() {
		return cost;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public void setCost(Double cost) {
		this.cost = cost;
	}



	@Override
	public String toString() {
		return "Book \n[id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", cost=" + cost + "]\n";
	}
	
	
	
	

}
