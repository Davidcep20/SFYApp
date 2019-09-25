package es.david.sfyapp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.david.sfyapp.R
import es.david.sfyapp.View.Adapters.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = PagerAdapter(supportFragmentManager)
        main_view_pager.adapter = fragmentAdapter

        main_tab_layout.setupWithViewPager(main_view_pager)
    }
}
