package Test3;
//8)	Create an array of Theatre to maintain data in sorted order of Movie Rating 
//Theatre (Theatreid,Theatrename,location,Movie)
//Movie (Movieid,Moviename,Rating)
public class Movie {
	int movieid,rating;
	String moviename;
	
	Movie(){
		movieid=0;
		rating=0;
		moviename="";
	}
	Movie(int movieid, int rating, String moviename){
		this.movieid=movieid;
		this.rating=rating;
		this.moviename=moviename;
	}
	public String toString() {
		return "movieid "+ movieid+"\n"+"rating "+rating+"\n"+"Moviename " +moviename; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
