package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_ekle = findViewById(R.id.btn_kaydet) as Button
        val btn_sil = findViewById(R.id.btn_sil) as Button
        val textView = findViewById(R.id.txt_yazi) as EditText
        val listView = findViewById(R.id.liste_goster)as ListView



        var itemlist= arrayListOf<String>()
        var adapter = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_multiple_choice, itemlist )

        btn_ekle.setOnClickListener{

            itemlist.add(textView.text.toString())
            listView.adapter=adapter
            adapter.notifyDataSetChanged()
            textView.clearComposingText()
            textView.text.clear()
        }
        btn_sil.setOnClickListener{
            itemlist.clear()
            adapter.notifyDataSetChanged()
        }


    }
}