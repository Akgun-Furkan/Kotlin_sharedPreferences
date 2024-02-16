package com.agn.kullaniciadisaklama

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.agn.kullaniciadisaklama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //var sharedP:SharedPreferences?=null
    lateinit var sharedP:SharedPreferences
    var alinanKullanici:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        //SharedPreferences
         sharedP=this.getSharedPreferences("com.agn.kullaniciadisaklama", MODE_PRIVATE)
         alinanKullanici=sharedP.getString("kullanici","")
        if(alinanKullanici!=null){
            binding.textView.text="Kaydedilen kullanıcı ${alinanKullanici}"
        }

    }
    fun Kaydet(view: View){
        val kullaniciAdi=binding.editText.text.toString()


        if(kullaniciAdi==""){
            Toast.makeText(this,"harhangi bir metin girmediniz",Toast.LENGTH_LONG).show()
        }else{
            sharedP.edit().putString("kullanici",kullaniciAdi).apply()
            binding.textView.text="Kaydedilen Kullnıcı ${kullaniciAdi}"
        }


    }
    fun Sil(view: View){

    }
}