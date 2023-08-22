
package com.example.semester3_pertemuan2_linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.semester3_pertemuan2_linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            test1.setOnClickListener{
                Toast.makeText(this@MainActivity, "Halo " + coba.text
                    , Toast.LENGTH_LONG).show()
            }
        }
    }
}