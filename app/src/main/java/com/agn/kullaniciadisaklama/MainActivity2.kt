package com.agn.kullaniciadisaklama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.agn.kullaniciadisaklama.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent=intent
        //setContentView(R.layout.activity_main2)
        //abstract class soyut
        object :CountDownTimer(15000,1000)
        {
            override fun onTick(millisUntilFinished: Long) {
                binding.textView2.text="Kalan:${millisUntilFinished/1000}"
            }

            override fun onFinish() {
                binding.textView2.text="kalan =0"
            }

        }.start()
    }
    fun sfkronometre(view: View){
        var init=Intent(applicationContext,MainActivity3::class.java)
        startActivity(init)

    }
}