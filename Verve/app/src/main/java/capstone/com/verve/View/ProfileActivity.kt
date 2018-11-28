package capstone.com.verve.View

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.TabWidget
import capstone.com.verve.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_profile)



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
