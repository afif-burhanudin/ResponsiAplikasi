package com.example.responsiaplikasi


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.responsiaplikasi.fragment.HistoryFragment
import com.example.responsiaplikasi.fragment.HomeFragment
import com.example.responsiaplikasi.fragment.PaymentFragment
import com.example.responsiaplikasi.fragment.SettingsFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var home: Button
    private lateinit var payment: Button
    private lateinit var history: Button
    private lateinit var settings: Button

    private fun loadfragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, fragment)
            .commitNow()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        home = findViewById(R.id.home)
        payment = findViewById(R.id.payment)
        history = findViewById(R.id.history)
        settings = findViewById(R.id.setting)

        home.setOnClickListener{
            loadfragment(HomeFragment())
        }
        payment.setOnClickListener{
            loadfragment(PaymentFragment())
        }
        history.setOnClickListener{
            loadfragment(HistoryFragment())
        }
        settings.setOnClickListener {
            loadfragment(SettingsFragment())
        }

    }
}