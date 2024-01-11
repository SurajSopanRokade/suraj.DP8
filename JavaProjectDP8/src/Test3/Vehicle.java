package Test3;
//9)	Write a java program to create a array of 3 person .
//Take input or hardcode  for all  three person from console.
//Person class is as follows 
//Person (int id, String name, Vehicle v[] )
//Vehicle (int vid, String vname) [2M]
public class Vehicle {
	int vid;
	String name;
	Vehicle(){
		vid=0;
		name="";
	}
	Vehicle(int vid, String name){
		this.vid=vid;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
