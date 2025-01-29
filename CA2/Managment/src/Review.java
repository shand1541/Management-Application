import sun.util.calendar.BaseCalendar.Date;

public class Review {
 private String comment;
private int rate ;
private Date date = new Date() ;
public String getComment() {
	return comment;
}

public void setComment(String comment) {
	this.comment = comment;
}

public int getRate() {
	return rate;
}

public void setRate(int rate) {
	this.rate = rate; 
}

public Date getReviewDate() {
	return date;
}

public void setReviewDate(Date reviewDate) {
	this.date = reviewDate;
}
 
}
