package com.agn.kullaniciadisaklama

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.agn.kullaniciadisaklama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //var shrdP:SharedPreferences?=null
    lateinit var shardP:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        //SharedPreferences
        var sharedP=this.getSharedPreferences("com.agn.kullaniciadisaklama", MODE_PRIVATE)

    }
    fun Kaydet(view: View){
        val kullaniciAdi=binding.editText.text.toString()

    }
    fun Sil(view: View){

    }
}