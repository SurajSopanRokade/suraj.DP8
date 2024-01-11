package com.test6;

import java.util.ArrayList;
import java.util.Iterator;

public class Player {
	int pid;
	String pname,country,team;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int pid, String pname, String country, String team) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.country = country;
		this.team = team;
	}
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", country=" + country + ", team=" + team + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player(1,"Ms dhoni", "Aust", "Mumbai");
		Player p2 = new Player(2,"Salinga ", "Aust", "CSK");
		Player p3 = new Player(3,"Virat", "Aust", "CSK");
		Player p4 = new Player(4,"Mulri", "Aust", "RCB");
		
		ArrayList<Player> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		ArrayList<String> ar= new ArrayList<>();
		Iterator <Player> itr = list.iterator();
		String str1="";
		int count;
		int a=0;
		int max=0;
		while(itr.hasNext()) {
			String str="";
			Player l =itr.next();
			if (l.country=="Aust") {
				str = l.team;
				ar.add(str);
			}
			for (int i=0; i<ar.size(); i++) {
				count=0;
				for (int j=i+1; j<ar.size(); j++) {
					if (ar.get(i)==ar.get(j)) {
						count++;
						
					}
				}
				if (count>max) {
					max=count;
					str1=l.team;
			}
				
		}
			
		
	}
		System.out.println("Team "+str1 +" has Max Aust players " + (max+1));
}
}