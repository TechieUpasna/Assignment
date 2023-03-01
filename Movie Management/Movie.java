package mypackage;

public class Movie {
	//instance variable
	private String movieName;
	private double movieStartTime,movieEndTime,movieTicketPrice;
	 void setMovie() {
	this.movieName=movieName;
	this.movieStartTime=movieStartTime;
	this.movieEndTime=movieEndTime;
	this.movieTicketPrice=movieTicketPrice;
}
	void getMovie(String movieName,double movieStartTime,double movieEndTime,double movieTicketPrice) {
		System.out.println("Movie name: " +movieName);
		System.out.println("Movie starting time: "+movieStartTime);
		System.out.println("Movie Ending time: "+movieEndTime);
		System.out.println("Movie Ticket price: "+movieTicketPrice);
		
	}}
