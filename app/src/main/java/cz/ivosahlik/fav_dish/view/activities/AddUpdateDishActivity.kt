package cz.ivosahlik.fav_dish.view.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cz.ivosahlik.fav_dish.databinding.ActivityAddUpdateDishBinding

class AddUpdateDishActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityAddUpdateDishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityAddUpdateDishBinding.inflate(layoutInflater)

        setContentView(mBinding.root)

        setupActionBar()
    }

    /**
     * A function for ActionBar setup.
     */
    private fun setupActionBar() {
        setSupportActionBar(mBinding.toolbarAddDishActivity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        mBinding.toolbarAddDishActivity.setNavigationOnClickListener { onBackPressed() }
    }

}