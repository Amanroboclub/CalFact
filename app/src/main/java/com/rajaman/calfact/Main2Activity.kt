package com.rajaman.calfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle=intent.extras
        var number = bundle!!.getInt("number")
        textView2.text = "Your number$number".toString()
        for(i in 1..number){
            if(number>i){
                number =number/i
            }
            else{

                textView3.text = "Now this is Answer$number".toString()
            }
        }
    }
}
