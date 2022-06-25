package com.joao.t4_grupal_parte_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.joao.t4_grupal_parte_1.R

class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggle = ActionBarDrawerToggle(this, findViewById(R.id.drawerLayout), R.string.open_drawer, R.string.close_drawer)
        findViewById<DrawerLayout>(R.id.drawerLayout).addDrawerListener(toggle)
        toggle.syncState()


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<NavigationView>(R.id.nav_view).setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home ->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, HomeFragment())
                        commit()
                    }
                }
                R.id.nav_suma ->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, SumaFragment())
                        commit()
                    }
                }
                R.id.nav_resta ->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, RestaFragment())
                        commit()
                    }
                }
                R.id.nav_multiplicacion ->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, MultiplicacionFragment())
                        commit()
                    }
                }
                R.id.nav_division ->{
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, DivisionFragment())
                        commit()
                    }
                }
            }
            findViewById<DrawerLayout>(R.id.drawerLayout).closeDrawer(GravityCompat.START)

            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}