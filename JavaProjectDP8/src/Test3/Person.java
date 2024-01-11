package Test3;

import java.util.Arrays;

//9)	Write a java program to create a array of 3 person .
//Take input or hardcode  for all  three person from console.
//Person class is as follows 
//Person (int id, String name, Vehicle v[] )
//Vehicle (int vid, String vname) [2M]
public class Person {
	int id;
	String name;
	Vehicle v[];
	Person(){
		id=0; 
		name="";
	}
	Person(int id, String name, Vehicle v[]){
		this.id=id;
		this.name=name;
		this.v=v;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", v=" + Arrays.toString(v) + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1[] = new Vehicle[3];
		v1[0]= new Vehicle(1, "Honda");
		v1[1]= new Vehicle(2, "nda");
		v1[2]= new Vehicle(3, "Hon");
		
		Vehicle v2[] = new Vehicle[2];
		v2[0]= new Vehicle(1, "Bajaj");
		v2[1]= new Vehicle(2, "jask");
		
		Vehicle v3[] = new Vehicle[1];
		v3[0]= new Vehicle(1, "TATA");
		
		
		Person arr []=new Person[3];
		arr[0]= new Person(1,"Suraj", v1);
		arr[1]= new Person(2,"Su", v2);
		arr[2]= new Person(3,"raj", v3);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
