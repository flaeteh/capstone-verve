package capstone.com.verve.Presenter;

public class UserPosts {
    String postTitle, postDescription, uId, firstname, middlename, lastname, datePost, timePost;

    public UserPosts() {

    }

//    public UserPosts(String postTitle, String postDescription, String uId, String firstname, String middlename, String lastname) {
//        this.postTitle = postTitle;
//        this.postDescription = postDescription;
//        this.uId = uId;
//        this.firstname = firstname;
//        this.middlename = middlename;
//        this.lastname = lastname;
//    }

    public String getDatePost() {
        return datePost;
    }

    public void setDatePost(String datePost) {
        this.datePost = datePost;
    }

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost = timePost;
    }

    public UserPosts(String postTitle, String postDescription, String uId, String firstname, String middlename, String lastname, String datePost, String timePost) {
        this.postTitle = postTitle;
        this.postDescription = postDescription;
        this.uId = uId;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.datePost = datePost;
        this.timePost = timePost;

    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
