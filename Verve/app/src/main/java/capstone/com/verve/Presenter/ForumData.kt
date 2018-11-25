package capstone.com.verve.Model

open class ForumData {

    lateinit var uName: String
    lateinit var uDate: String
    lateinit var uTime: String
    lateinit var hearts: String
    lateinit var comments: String
    lateinit var postTitle: String
    lateinit var postDetails: String
    lateinit var dateComment: String
    lateinit var timeComment: String
    lateinit var lastPerson: String
    lateinit var lastComment: String


    fun setUname (uName: String) {
        this.uName = uName
    }

    fun getUname() : String {
        return uName
    }

    fun setUdate (uDate: String) {
        this.uDate = uDate
    }

    fun getUdate() : String {
        return uDate
    }

    fun setUtime (uTime: String) {
        this.uTime = uTime
    }

    fun getUtime() : String {
        return uTime
    }

    fun setPosttitle (postTitle : String) {
        this.postTitle = postTitle
    }

    fun getPosttitle() : String {
        return postTitle
    }

    fun setPostdetails (postDetails: String) {
        this.postDetails = postDetails
    }

    fun getPostdetails() : String {
        return postDetails
    }

    fun setLastcomment (lastComment: String) {
        this.lastComment = lastComment
    }

    fun getLastoomment() : String {
        return lastComment
    }

    fun sethearts (hearts: String) {
        this.hearts = hearts
    }

    fun gethearts(): String {
        return hearts
    }

    fun setcomments (comments: String) {
        this.comments = comments
    }

    fun getcomments() : String {
        return comments
    }

    fun setdateComment (dateComment: String) {
        this.dateComment = dateComment
    }

    fun getdateComment() : String {
        return dateComment
    }

    fun settimeComment (timeComment: String) {
        this.timeComment = timeComment
    }

    fun gettimeComment() : String {
        return timeComment
    }

    fun setlastPerson (lastPerson: String) {
        this.lastPerson = lastPerson
    }

    fun getlastPerson() : String {
        return lastPerson
    }



    //constant
    /* companion object {
         const val userField = "uName"
     }*/
}