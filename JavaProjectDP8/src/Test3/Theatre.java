package Test3;

import java.util.Arrays;

//8)	Create an array of Theatre to maintain data in sorted order of Movie Rating 
//Theatre (Theatreid,Theatrename,location,Movie)
//Movie (Movieid,Moviename,Rating)
public class Theatre {
	int theatreid;
	String theatrename,location;
	Movie movie;
	Theatre(){
		theatreid=0;
		theatrename="";
		location="";
		
	}
	Theatre(int theatreid, String theatrename, String location,Movie movie ){
		this.theatreid=theatreid;
		this.theatrename=theatrename;
		this.location=location;
		this.movie=movie;
	}
	public void sort(Theatre n[]) {
		Theatre t[]= new Theatre[3] ;
		for (int i=0; i<n.length; i++) {
			Theatre temp;
			for (int j=0; j<n.length; j++) {
				if(n[i].movie.rating>n[j].movie.rating) {
					temp=n[i];
					
					n[i]=n[j];
					
					n[j]=temp;
					
				}
				
			}
			
			
		}
		System.out.print(Arrays.toString(n));
		
		
	}
	
	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", theatrename=" + theatrename + ", location=" + location
				+ ", movie=" + movie + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre arr[] = new Theatre[3];
		arr[0]=new Theatre(1,"suraj","pune",new Movie(1,7,"sas"));
		arr[1]=new Theatre(2,"su","pu",new Movie(2,8,"sm"));
		arr[2]=new Theatre(3,"raj","ne",new Movie(3,9,"asm"));
		
		Theatre t1 = new Theatre();
		t1.sort(arr);
	}

}
