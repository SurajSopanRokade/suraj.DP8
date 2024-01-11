package com.stringAssignment;
//Check entered String is valid mobile number
public class MobNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "9424824911";
		char ch []= str.toCharArray();
		int count=0;
		for (int i=0; i<ch.length; i++) {
			for (int j=48; j<58; j++) {
				if (ch[i]==j)
					count++;
					
			}
		}
		if (count==10)
			System.out.println("Is valid");
		else
			System.out.println("Is invalid");
	}

}
