package com.example.day19alertdialogue

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.day19alertdialogue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure?")
            builder1.setMessage("Do you want to close the App?")
            builder1.setIcon(R.drawable.exit)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                // What actions should be performed when Yes is clicked?
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                // What actions should be performed when click on the No?

            })
            builder1.show()
        }
        binding.btn2.setOnClickListener {
            val options = arrayOf("Gulab Jamun","Rasmalai","Kaju Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favourite sweets?")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialogInterface, i ->
                // What actions should be performed when users click on any options
                Toast.makeText(this,"You Clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Accept",DialogInterface.OnClickListener { dialogInterface, i ->
                // What actions should be performed when Yes is clicked?
            })
            builder2.setNegativeButton("Declined",DialogInterface.OnClickListener { dialogInterface, i ->
                // What actions should be performed when click on the No?

            })
            builder2.show()
        }
        binding.btn3.setOnClickListener {
            val options = arrayOf("Gulab Jamun","Rasmalai","Kaju Katli")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which is your favourite sweets?")
            builder3.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this,"You Clicked On ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Accept",DialogInterface.OnClickListener { dialogInterface, i ->
                // What actions should be performed when Yes is clicked?
            })
            builder3.setNegativeButton("Declined",DialogInterface.OnClickListener { dialogInterface, i ->
                // What actions should be performed when click on the No?

            })
            builder3.show()


        }
    }
}