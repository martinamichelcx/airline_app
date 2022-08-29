package com.example.airlineapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.airlineapp.databinding.ActivityItemDetailBinding
//

import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
//
class ItemDetailHostActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
///

   // private var layoutManager: RecyclerView.LayoutManager? = null
     //var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    ///
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//
     //   setContentView(R.layout.card_layout1)
       // setSupportActionBar(toolbar)

        //layoutManager = LinearLayout(this)
       // recycler_view.layoutManager = layoutManager

      //  adapter = RecyclerAdapter()
       // recycler_vie = adapter

     val binding = ActivityItemDetailBinding.inflate(layoutInflater)
     setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_item_detail) as NavHostFragment
        val navController = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_item_detail)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}