/** SchoolActivity class
 *
 * @author Shantaly
 *
 * A class for representing and comparing school activities.
 *
 */

public class SchoolActivity {
	private String title;        // short description for the activity
	private Time startingTime;   // starting time of the activity
	private Time endingTime;     // ending time of the activity
	private String comment;      // additional details about the activity
	
	/**
	 * Create a school activity with all the required fields
	 */
	public SchoolActivity(String title, Time startingTime, Time endingTime, String comment) {
		if (valid(startingTime, endingTime)) {
			this.title = title;
			this.startingTime = startingTime;
			this.endingTime = endingTime;
			this.comment = comment;
		} else {			
			System.out.println("Invalid times for SchoolActivity");
			System.exit(0);
		}
	}
	
	/**
	 * Check the validity for a potential activity
	 */
	public static boolean valid(Time startingTime, Time endingTime) {
		return (startingTime != null) && (endingTime != null);
	}

	/**
	 * Set a new value for title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Set a new value for starting time
	 */
	public void setStartingTime(Time startingTime) {
		if (endingTime == null) {
			System.out.println("Invalid starting time");
			System.exit(0);  
		} else 
			this.startingTime = startingTime; 
	}
	
	/**
	 * Set a new value for ending time
	 */
	public void setEndingTime(Time endingTime) {
		if (startingTime == null) {
			System.out.println("Invalid ending time");
			System.exit(0);
		}
		this.endingTime = endingTime;
	}
	
	/**
	 * Set a new value for comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/**
	 * Get the value of title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Get the value of starting time
	 */
	public Time getStartingTime() {
		return startingTime;
	}
	
	/**
	 * Get the value of ending time
	 */
	public Time getEndingTime() {
		return endingTime;
	}
	
	/**
	 * Get the value of comment
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * Check for equality of two school activties
	 */
	public boolean equals(SchoolActivity other) {
		if (other == null)
			return false;
		else 
			return title.equals(other.title) &&
			       startingTime.equals(other.startingTime) &&
			       endingTime.equals(other.endingTime) &&
			       comment.equals(other.comment);
	}
	
	/**
	 * Show the content of a school activity in a string
	 */
	public String toString() {
		return title + ": " + startingTime + " to " + endingTime + ", " + comment;	
	}
	
	public static void main(String[] args) {
		Time startingTime = new Time(2009, 10, 22, 12, 30);
		Time endingTime = new Time(2009, 10, 22, 13, 20);
		SchoolActivity activity = new SchoolActivity("Java class", startingTime, endingTime, "");
		System.out.println("School Activity: " + activity);
	}
}
