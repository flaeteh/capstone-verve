package capstone.com.verve.View

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.TabWidget
import android.widget.TextView
import capstone.com.verve.API.FirebaseConnection
import capstone.com.verve.Presenter.UserDetails
import capstone.com.verve.R
import kotlinx.android.synthetic.main.activity_profile.*
import org.w3c.dom.Text

class ProfileActivity : AppCompatActivity() {

    var txt_name: TextView? = null
    var txt_address: TextView? = null
    var txt_age: TextView? = null
    var txt_birthday: TextView? = null
    var txt_email: TextView? = null
    internal var userDetails = UserDetails()
    internal var firebaseConnection = FirebaseConnection()

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_profile)

        txt_name = findViewById(R.id.txt_name)
        txt_address = findViewById(R.id.txt_address)
        txt_age = findViewById(R.id.txt_age)
        txt_birthday = findViewById(R.id.txt_birthday)
        txt_email = findViewById(R.id.txt_email)

        userDetails.getUserProfile(firebaseConnection.getProfileReference("Users"), txt_name, txt_email, txt_birthday, txt_address)

        var imgHome = findViewById<ImageButton>(R.id.img_home)

        imgHome.setOnClickListener {
           showForum()
        }

    }

    private fun showForum() {
        val intent = Intent(this@ProfileActivity, ForumActivity::class.java)
        startActivity(intent)
    }
}
