package cz.ivosahlik.fav_dish.view.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import cz.ivosahlik.fav_dish.R
import cz.ivosahlik.fav_dish.databinding.ActivitySplashBinding

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashBinding: ActivitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            @Suppress("DEPRECATION")
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        val splashAnimation = AnimationUtils.loadAnimation(this@SplashActivity, R.anim.anim_splash)
        splashBinding.tvAppName.animation = splashAnimation

        splashAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                // "Add the code that you want to execute when animation starts")
            }

            override fun onAnimationEnd(animation: Animation?) {
                // "Add the code that you want to execute when animation ends")

                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this@SplashActivity, AddUpdateDishActivity::class.java))
                    finish()
                }, 1000)
            }

            override fun onAnimationRepeat(animation: Animation?) {
                // "Add the code that you want to execute when animation repeats")
            }
        })
    }
}