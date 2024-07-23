package cz.ivosahlik.fav_dish.view.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cz.ivosahlik.fav_dish.R

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_add_update_dish)

    }
}