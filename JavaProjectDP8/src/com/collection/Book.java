package com.collection;

public class Book implements Comparable<Book> {
	int bookid;
	String bookname, bookauther;
	int price;
	
	Book(){
		bookid=0;
		bookname="";
		bookauther="";
		price=0;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauther=" + bookauther + ", price=" + price
				+ "]";
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauther() {
		return bookauther;
	}
	public void setBookauther(String bookauther) {
		this.bookauther = bookauther;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(int bookid, String bookname, String bookauther, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauther = bookauther;
		this.price = price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if (this.bookid==o.bookid)
			return 0;
		else if (this.bookid>o.bookid)
			return 1;
		else
			return -1;
	}
	
	

}
