package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mylistview=findViewById<ListView>(R.id.list_view)
        var mylist= mutableListOf<Model>()

        //let me add my image tittle and description
        mylist.add(Model("automobile","Latest model",R.drawable.syclone))
        mylist.add(Model("fast car","spacious",R.drawable.glad))
        mylist.add(Model("sport car","sleak",R.drawable.orangecar))
        mylist.add(Model("vehicle","Bulky",R.drawable.whitecar))
        mylist.add(Model("Aston","streamlined",R.drawable.aston))
        mylist.add(Model("stylish","vintage",R.drawable.kathleen))

        mylistview.adapter=MyAdapter(this,R.layout.row,mylist)




    }
}