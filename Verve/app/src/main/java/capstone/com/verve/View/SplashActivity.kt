package capstone.com.verve.View

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import capstone.com.verve.R
import android.view.animation.AnimationUtils.loadAnimation
import android.view.animation.Animation
import android.content.Intent
import android.os.Handler
import android.support.annotation.Nullable
import android.support.v4.os.HandlerCompat.postDelayed
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.content.pm.PackageManager
import android.content.ComponentName
import android.view.WindowManager


class SplashActivity : AppCompatActivity() {

    private var logo: ImageView? = null
    private val splashTimeOut: Long = 1800

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)
        logo = findViewById(R.id.img_logo)

        Handler().postDelayed({
            val i = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(i)
            finish()
        }, splashTimeOut)

        val splashAnimation = AnimationUtils.loadAnimation(this, R.anim.splashanimation)
        logo!!.startAnimation(splashAnimation)

    }
}
