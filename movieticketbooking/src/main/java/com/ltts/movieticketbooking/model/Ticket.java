package com.ltts.movieticketbooking.model;

import java.util.Date;


public class Ticket {
	
	private String movieName;
	private String circleType;
	private Date dateofBooking; 
	private Date showDate;
	private int noOfTickets;
	
	public Ticket() {
		super();
	}
	
	public Ticket(String movieName, String circleType, Date dateofBooking, Date showDate, int noOfTickets) {
		super();
		this.movieName = movieName;
		this.circleType = circleType;
		this.dateofBooking = dateofBooking;
		this.showDate = showDate;
		this.noOfTickets = noOfTickets;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCircleType() {
		return circleType;
	}

	public void setCircleType(String circleType) {
		this.circleType = circleType;
	}

	public Date getDateofBooking() {
		return dateofBooking;
	}

	public void setDateofBooking(Date dateofBooking) {
		this.dateofBooking = dateofBooking;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	@Override
	public String toString() {
		return "Ticket [movieName=" + movieName + ", circleType=" + circleType + ", dateofBooking=" + dateofBooking
				+ ", showDate=" + showDate + ", noOfTickets=" + noOfTickets + "]";
	}
	
	
	


}
