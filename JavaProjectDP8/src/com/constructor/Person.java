package com.constructor;
//3. Create class Person which has attributes (name, gender, age, Address).

//Address is class which has attributes (city, state, country). Display Persons
//data
//Note. Containment using constructor and getter/setter

public class Person {
	private String name, address, gender;
	private int age;
	Address add;

	Person() {
		name = "";
		address = "";
		gender = "";
		age = 0;
	}

	Person(String name, String address, String gender, int age, Address add) {

		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.add = add;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public String toString() {
		return " Name " + name + " Address " + address + " Gender " + gender + " Age " + age + add;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println(p1);

		Address add = new Address("Pune", "Maharastra", "India");
		Person p2 = new Person("Suraj", "Mahadev hostel", "Male", 25, add);
		System.out.println(p2);
	}

}
