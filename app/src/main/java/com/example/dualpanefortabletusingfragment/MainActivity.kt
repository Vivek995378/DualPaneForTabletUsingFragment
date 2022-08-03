package com.example.dualpanefortabletusingfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import com.example.dualpanefortabletusingfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Communicator {
    private lateinit var binding: ActivityMainBinding
    private var mIsDualPane = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentBView = findViewById<View>(R.id.fragmentB)
        mIsDualPane = fragmentBView?.visibility == View.VISIBLE
    }
    override fun passDataCom(courseName: String, description: String, fee: Long) {
        if (mIsDualPane) { // If we are in Tablet
            val fragmentB = supportFragmentManager.findFragmentById(R.id.fragmentB) as FragmentB?
            fragmentB?.displayDetails(courseName, description, fee)
        } else { // When we are in Smart phone
            val bundle = Bundle()
            bundle.putString("Name", courseName)
            bundle.putString("Description", description)
            bundle.putString("Fee", fee.toString())

            val transaction = this.supportFragmentManager.beginTransaction()
            val frag2 = FragmentB()
            frag2.arguments = bundle

            transaction.replace(R.id.fragmentA, frag2)
            transaction.addToBackStack(null)
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            transaction.commit()
        }
    }
}