package com.test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Movie {
	int mid;
	String mname;
	List<String>actor;
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(int mid, String mname, List<String> actor) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.actor = actor;
	}
	
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public List<String> getActor() {
		return actor;
	}

	public void setActor(List<String> actor) {
		this.actor = actor;
	}
	
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", actor=" + actor + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = Arrays.asList("Amitabh", "Shahrukh");
		List<String> a1 = Arrays.asList("Amir", "Shahrukh");
		List<String> a2 = Arrays.asList("Amitabh", "Shahrukh");
		List<String> a3 = Arrays.asList("Amitabh", "Salman");
		
		Movie m1 = new Movie(2,"xyz",a);
		Movie m2 = new Movie(5,"abc",a1);
		Movie m3 = new Movie(7,"gfd",a2);
		Movie m4 = new Movie(9,"bnm",a3);
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		ListIterator<Movie>itr=list.listIterator();
		while (itr.hasNext()) {
			Movie v1 = itr.next();
			if (v1.actor.contains("Amitabh")) {
				System.out.println(v1.mname+" "+v1.mid);
			}
		}
	}

}
