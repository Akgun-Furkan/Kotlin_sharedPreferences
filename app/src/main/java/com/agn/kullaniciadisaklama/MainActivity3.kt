package com.agn.kullaniciadisaklama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.agn.kullaniciadisaklama.databinding.ActivityMain2Binding
import com.agn.kullaniciadisaklama.databinding.ActivityMain3Binding
import com.agn.kullaniciadisaklama.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    var numara=0
    var runnable : Runnable=Runnable{ }
    var handler =Handler(Looper.myLooper()!!)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main3)
    }
    fun baslat(view: View){
        numara =0
        /*while (numara<=100){
            numara++
            binding.textView.text="Sayaç=${numara}"
            Thread.sleep(1000)
        }*/
        Toast.makeText(this,"Tuş kontrol", Toast.LENGTH_LONG).show()
        runnable = object :Runnable{
            override fun run() {
              numara=numara+1
              binding.textView4.text="Sayac =${numara}"

              handler.postDelayed(runnable,1000)
            }
        }
        handler.post(runnable)


    }
    fun durdur(view:View){
        handler.removeCallbacks(runnable)
        numara=0
        binding.textView4.text="Sayaç=${numara}"

    }
}