package rc.springbootmongodbhoteldata;

/**
 * Review class holds the information related to hotel reviews
 */
public class Review {
    private String userName;
    private int rating;
    private boolean approved;

    protected Review() {

    }

    public Review(String userName, int rating, boolean approved) {
        this.userName = userName;
        this.rating = rating;
        this.approved = approved;
    }

    public String getUserName() {
        return userName;
    }
    public int getRating() {
        return rating;
    }
    public boolean getApproved() {
        return approved;
    }
}
