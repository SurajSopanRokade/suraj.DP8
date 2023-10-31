package com.containment;

//4. Create Employee class which has attributes (id, name, salary, dept,
//mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
//And mydate has (day, month, year).
//Display Employee information.
//Note. Containment using constructor and getter/setter
public class Department {
	private int depid;
	private String depname;
	Employee emp;
	MyDate doj;

	Department() {
		depid = 0;
		depname = "";
	}

	Department(int depid, String depname, Employee emp, MyDate doj) {
		this.depid = depid;
		this.depname = depname;
		this.emp = emp;
		this.doj = doj;
	}

	public void setDepid(int depid) {
		this.depid = depid;

	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public int getDepid() {
		return depid;
	}

	public String getDepname() {
		return depname;
	}

	public String toString() {
		return " Department id " + depid + "\n" + " Department name " + depname + "\n" + " Employee info " + emp + "\n"
				+ " Date of Joining " + doj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1 = new Department();
		System.out.println(d1);
		System.out.println("______________________");
		Employee e1 = new Employee(1, "Suraj", 50000);

		MyDate m1 = new MyDate(12, 5, 2023);
		Department d2 = new Department(1, "Science", e1, m1);
		System.out.println(d2);
	}

}
